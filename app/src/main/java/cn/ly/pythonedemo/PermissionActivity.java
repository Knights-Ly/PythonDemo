package cn.ly.pythonedemo;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

abstract class PermissionActivity extends Activity {

	private String[] permissionList = new String[]{
			Manifest.permission.INTERNET,
			Manifest.permission.READ_EXTERNAL_STORAGE,
			Manifest.permission.WRITE_EXTERNAL_STORAGE
	};

	public abstract void permissionGranted();

	public void requestPermission(){
		if (! checkPermission(permissionList)){
			ActivityCompat.requestPermissions(this,permissionList,1);
		}else{
			permissionGranted();
		}
	}

	private boolean checkPermission(String[] permissionList){
		boolean isGranted = true;
		for (String perssion : permissionList){
			isGranted = isGranted && (ContextCompat.checkSelfPermission(this,perssion) == PackageManager.PERMISSION_GRANTED);
		}

		return isGranted;
	}

	@Override
	public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults){
		super.onRequestPermissionsResult(requestCode,permissions,grantResults);
		switch (requestCode){
			case 1:
				boolean isNoGranted = false;
				if (permissions.length == grantResults.length){
					for (int i = 0;i < grantResults.length;i++){
						if (grantResults[i] != PackageManager.PERMISSION_GRANTED){
							isNoGranted = true;
							//showWaringDialog();
							//return;
						}
					}
				}

				if (isNoGranted){
					Toast.makeText(getApplicationContext(),
							"请前往设置->应用->权限管理->权限中打开相关权限，否则功能无法正常运行！", Toast.LENGTH_SHORT).show();;
				}
				permissionGranted();
				break;
		}
	}

}
