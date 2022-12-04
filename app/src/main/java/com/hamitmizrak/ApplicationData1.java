package com.hamitmizrak;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ApplicationData1 extends AppCompatActivity {
    //Global variable
    private EditText editTextApplicationId;
    private Button buttonSubmitId;
    private ImageView imageViewId;
    private TextView textViewApplicationId;
    private String userData;
    private Button buttonResetId;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_data1);
        //start

        // ID
        editTextApplicationId=findViewById(R.id.editTextApplicationId);
        buttonSubmitId=findViewById(R.id.buttonSubmitId);
        imageViewId=findViewById(R.id.imageViewId);
        textViewApplicationId=findViewById(R.id.textViewApplicationId);
        buttonResetId=findViewById(R.id.buttonResetId);

        // Submit ClickListener
        buttonSubmitId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ApplicationData1.this, "Yazıldı", Toast.LENGTH_SHORT).show();
                //EditText veri almak
                 userData=editTextApplicationId.getText().toString();

                 //Log
                 Log.i("user",userData);

                 //TextView Veri yazmak
                textViewApplicationId.setText(userData.toUpperCase());

                // 4 tane resim olsun
                //
                Object[] imageObject=new Object[4];
                imageObject[0]=R.drawable.earth;
                imageObject[1]=R.drawable.ai;
                imageObject[2]=R.drawable.sea;
                imageObject[3]=R.drawable.main1;
                for (int i = 0; i <imageObject.length ; i++) {
                    Random random=new Random();
                    int imageData=random.nextInt(4)+0;
                    imageViewId.setImageResource((Integer) imageObject[imageData]);
                }
            }
        }); //end Submit ClickListener
        buttonResetId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ApplicationData1.this, "Temizlendi", Toast.LENGTH_SHORT).show();
                textViewApplicationId.setText("");
            }
        });


    } //end
} //end ApplicationData1

/*
Button oluştur
activity connection
1.Activity: EditText , Button
2.Activity: 1.activity gelen veri alacak
*/