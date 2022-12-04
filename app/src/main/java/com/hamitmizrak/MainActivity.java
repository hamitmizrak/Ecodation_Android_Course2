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
    private Button buttonApplicationData1Id;

    // activityler arası veri taşımak
    private Button buttonActivityBlueId;

    //image
    private Button buttonActivityImageId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //start data
        //ID
        //other Activity
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

        //Application 1
        buttonApplicationData1Id=findViewById(R.id.buttonApplicationData1Id);
        buttonApplicationData1Id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentApplication1=new Intent(getApplicationContext(),ApplicationData1.class);
                Toast.makeText(MainActivity.this, "My Application Data 1 Redirect", Toast.LENGTH_SHORT).show();
                startActivity(intentApplication1);
            }
        });

        //ID Blue other connection activity
        buttonActivityBlueId=findViewById(R.id.buttonActivityBlueId);
        buttonActivityBlueId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBlueConnection=new Intent(getApplicationContext(),ActivityConnectionBlue.class);
                Toast.makeText(MainActivity.this, "Activity Connection Blue", Toast.LENGTH_SHORT).show();
                startActivity(intentBlueConnection);
            }
        });


        //picture
        buttonActivityImageId=findViewById(R.id.buttonActivityImageId);
        buttonActivityImageId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentImageConnection=new Intent(getApplicationContext(),ImageTutorials.class);
                Toast.makeText(MainActivity.this, "Resim Tutorials", Toast.LENGTH_SHORT).show();
                startActivity(intentImageConnection);
            }
        });

    } //end onCreate
}