package com.hamitmizrak;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

public class CameraActivity extends AppCompatActivity {

    private static final int MY_CAMERA_ID = 44;

    //Camera izni
    public void isPermissinCamera() {
        //GRANTED: izin verilmemiş
        if (checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.CAMERA}, MY_CAMERA_ID);
            Toast.makeText(this, "Kamera izin verilmemiştir lütfen eşleştirin", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Kamera izin verilmiştir.", Toast.LENGTH_LONG).show();
        }
    }

    //camera requestCode ile eşleşitirmesidir
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        //KAMERA
        if (requestCode == MY_CAMERA_ID && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
            Toast.makeText(this, "Kamera Eşleşmesi yapıldı", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Kamera Eşleşmesi yapılmadı DİKKAT", Toast.LENGTH_SHORT).show();
    }

    //Android 23 altında zaten kamera izni verilmiştir.
    public void isCameraFull() {
        if (Build.VERSION.SDK_INT >= 23) {
            Toast.makeText(this, "Android SDK 23 veya üstünden sürüm kullanıyorsunuz", Toast.LENGTH_SHORT).show();
            isPermissinCamera();
        } else {
            Toast.makeText(this, "Android SDK 23 altında   sürüm kullanıyorsunuz izin verilmiştir", Toast.LENGTH_SHORT).show();
        }
    }

    //ONCREATE
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        //start
        isCameraFull();

    }
}