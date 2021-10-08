package cn.ly.pythonedemo;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import cn.ly.py_lib.PythonUtil;

public class MainActivity extends PermissionActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestPermission();
    }

    @Override
    public void permissionGranted() {
        setContentView(R.layout.activity_main);
        PythonUtil.getInstance().initPython(this);
        findViewById(R.id.btn_you_get).setOnClickListener(v -> {
            String fileName = "get_real_url.py";
            String methodName = "get_real_url";
            String url = "https://v.qq.com/x/cover/mzc00200lxzhhqz.html";
            Object obj = PythonUtil.getInstance().runPy(fileName, methodName, new Object[]{ url });
            if  (obj != null) {
                ((EditText) findViewById(R.id.edt_go)).setText(obj.toString());
            }
            //Toast.makeText(MainActivity.this, obj.toString(), Toast.LENGTH_SHORT).show();
        });

        findViewById(R.id.btn_yy).setOnClickListener(v -> {
            String fileName = "get_real_url.py";
            String methodName = "get_real_url";
            String url = "https://www.yy.com/54880976/54880976?tempId=16777217";
            Object obj = PythonUtil.getInstance().runPy(fileName, methodName, new Object[]{ url });
            if  (obj != null) {
                ((EditText) findViewById(R.id.edt_go)).setText(obj.toString());
            }
            //Toast.makeText(MainActivity.this, obj.toString(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
