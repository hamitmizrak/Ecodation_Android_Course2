package com.hamitmizrak;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        Log.e("onCreate","1.alan başlatıldı");

        //Toast
        Toast.makeText(this, "this alanı", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "context alanı", Toast.LENGTH_LONG).show();

        //alert
        AlertDialog.Builder alert=new AlertDialog.Builder(OtherActivity.this);
        //Evet
        alert.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(OtherActivity.this, "Evet onayını verdiniz", Toast.LENGTH_SHORT).show();
            }
        });
        //Hayır
        alert.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(OtherActivity.this, "Hayır butonuna bastınız", Toast.LENGTH_SHORT).show();
            }
        });

        alert.setTitle("Header");
        alert.setMessage("Comment in");
        alert.show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart","2.alan başlatıldı");
        //Toast
        Toast.makeText(this, "this alanı", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "context alanı", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume","3.alan devam ediyor");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause","4.alan onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop","5.alan Durduldu");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy","Öldü");
    }
}