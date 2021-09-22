package cn.ly.py_lib;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import com.srplab.www.starcore.StarCoreFactory;
import com.srplab.www.starcore.StarCoreFactoryPath;
import com.srplab.www.starcore.StarObjectClass;
import com.srplab.www.starcore.StarServiceClass;
import com.srplab.www.starcore.StarSrvGroupClass;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PythonUtil {

    public static PythonUtil instance;

    public static PythonUtil getInstance() {
        if (instance == null) instance = new PythonUtil();
        return instance;
    }

    private final String TAG = this.getClass().getSimpleName();

    private Context context;
    private StarServiceClass Service;
    private StarObjectClass python;
    private File appFile;
    private String appLib;

    /**
     * 构造函数
     */
    private PythonUtil() {
    }

    /**
     * 初始化Python
     * @param context
     */
    public void initPython(Activity context) {
        // 路径
        this.context = context;
        this.appFile = context.getApplicationContext().getFilesDir();
        this.appLib = appFile.getPath();
        // 初始化
        initTmpDir();
        loadPyEnviroment();
        initCle();
    }

    /**
     * 初始化临时文件
     */
    @SuppressLint("SdCardPath")
    private void initTmpDir() {
        File file = new File("/sdcard/var/tmp");
        if(!file.exists()) {
            boolean s = file.mkdirs();
            Log.e(TAG, s + "");
        }

        file = new File("/sdcard/usr/tmp");
        if(!file.exists()) {
            boolean s = file.mkdirs();
            Log.e(TAG, s + "");
        }

        file = new File("/sdcard/tmp");
        if(!file.exists()) {
            boolean s = file.mkdirs();
            Log.e(TAG, s + "");
        }
    }
    /**
     * 加载Py环境
     */
    private void loadPyEnviroment() {
        // 拷贝Python相关环境
        File pythonLibFile = new File(appFile, "python3.7.zip");
        if (!pythonLibFile.exists()) {
            String[] lst = getAssetFiles(context);
            for (String tmp : lst) {
                copyFile(context, tmp);
            }
        }

        // 拷贝Python 代码
        copyFile(context, "yy.py");
        copyFile(context, "test.py");

        try {
            // 加载Python解释器 minSdkVersion 19，大于19可能会异常
            System.load(appLib + File.separator + "libpython3.7m.so");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 初始化Cle
     */
    private void initCle() {
        /*----init starcore----*/
        StarCoreFactoryPath.StarCoreCoreLibraryPath = appLib;
        StarCoreFactoryPath.StarCoreShareLibraryPath = appLib;
        StarCoreFactoryPath.StarCoreOperationPath = appFile.getPath();

        StarCoreFactory starcore = StarCoreFactory.GetFactory();
        starcore._SRPLock();
        Log.d(TAG, "zjy startcore:" + starcore);

        StarSrvGroupClass srvGroup = starcore._GetSrvGroup(0);
        Log.d(TAG, "zjy SrvGroup:" + srvGroup);

        Service = srvGroup._GetService("test", "123");
        Log.d(TAG, "zjy Service:" + Service);

        if (Service == null) { // the service has not been initialized
            Log.d(TAG, "zjy Service is null");
            Service = starcore._InitSimple("test", "123", 0, 0);
        } else {
            Log.d(TAG, "zjy SrvGroup:" + srvGroup);
            Service._CheckPassword(false);
        }

        Service._CheckPassword(false);

        /*----run python code----*/
        srvGroup._InitRaw("python37", Service); // this place
        python = Service._ImportRawContext("python", "", false, "");
        StarObjectClass model = python._GetObject("pd");
        python._Call("import", "sys");
        StarObjectClass pythonSys = python._GetObject("sys");
        StarObjectClass pythonPath = (StarObjectClass) pythonSys._Get("path");
        pythonPath._Call("insert", 0, appFile.getPath() + File.separator + "python3.7.zip");
        pythonPath._Call("insert", 0, appLib);
        pythonPath._Call("insert", 0, appFile.getPath());
        starcore._SRPUnLock();
    }

    /**
     * 运行Py脚本
     * @param pyFileName 文件名
     * @param funName 函数名
     * @param params 运行参数
     * @return
     */
    public Object runPy(String pyFileName, String funName, Object[] params) {
        // 调用函数
        Service._DoFile("python", appFile.getPath() + "/" + pyFileName, "");
        Object result = python._Call(funName, params);
        Log.d(TAG, "result=" + result);
        return result;
    }

    /**
     * 运行Py脚本
     */
    public void runPy() {
        // 调用函数
        Service._DoFile("python", appFile.getPath() + "/yy.py", "");
        Object result = python._Call("get_real_url", new Object[]{54880976});
        Log.d(TAG, "result=" + result);

        /*
        //调用Python代码
        Service._DoFile("python", appFile.getPath() + "/py_code.py", "");
        long time = python._Calllong("get_time");
        Log.d(TAG, "form python time=" + time);

        Service._DoFile("python", appFile.getPath() + "/test.py", "");
        int result = python._Callint("add", 5, 2);
        Log.d(TAG, "result=" + result);

        python._Call()
        python._Set("JavaClass", Log.class);
        Service._DoFile("python", appFile.getPath() + "/calljava.py", "");
        */
    }

    /**
     * 拷贝文件夹
     * @param c
     * @param Name
     */
    private void copyFile(Context c, String Name) {
        File outfile = new File(c.getFilesDir(), Name);
        BufferedOutputStream outStream = null;
        BufferedInputStream inStream = null;

        try {
            outStream = new BufferedOutputStream(new FileOutputStream(outfile));
            inStream = new BufferedInputStream(c.getAssets().open(Name));

            byte[] buffer = new byte[1024 * 10];
            int readLen = 0;
            while ((readLen = inStream.read(buffer)) != -1) {
                outStream.write(buffer, 0, readLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inStream != null) inStream.close();
                if (outStream != null) outStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 获取as文件列表
     * @param context
     * @return
     */
    public String[] getAssetFiles(Context context) {
        String[] list = {};
        try {
            AssetManager mAssetManager = context.getAssets();
            list = mAssetManager.list("");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
