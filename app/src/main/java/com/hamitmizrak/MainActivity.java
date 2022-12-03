package com.hamitmizrak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Global VAriable
    private Button buttonOtherActivityId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //start datas
        buttonOtherActivityId=findViewById(R.id.buttonOtherActivityId);
        buttonOtherActivityId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Data 555");
                Log.e("Intent,Toast","Intent Toast");
                // Diğer Activity geçiş için
                Intent otherActivityIntent= new Intent(getApplicationContext(),OtherActivity.class);

                // Ekranda Bilgi mesajı için kullanıyoruz
                Toast.makeText(MainActivity.this, "Other Activity Yönlendirildi ...", Toast.LENGTH_LONG).show();
                startActivity(otherActivityIntent);
            }
        });
    }
}