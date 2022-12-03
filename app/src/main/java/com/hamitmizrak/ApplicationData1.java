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

                //Resim değiştirmek
                imageViewId.setImageResource(R.drawable.main1);
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