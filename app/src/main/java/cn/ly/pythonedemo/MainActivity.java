package cn.ly.pythonedemo;

import android.os.Bundle;

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
        findViewById(R.id.btn_go).setOnClickListener(v -> {
            String fileName = "fff.py";
            String methodName = "get_real_url";
            String url = "https://v.qq.com/x/cover/mzc00200lxzhhqz.html";
            PythonUtil.getInstance().runPy(fileName, methodName, new Object[]{ url });
        });
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
