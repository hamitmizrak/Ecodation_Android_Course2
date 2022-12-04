package com.hamitmizrak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityConnectionYellow extends AppCompatActivity {

    //Global Variable
    private TextView textViewYellow;
    private Intent blueConnection;
    private String blueUserData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection_yellow);
        //ID
        textViewYellow=findViewById(R.id.textViewYellow);

        //Activity Connection Blue veriyi almak istersek
        blueConnection=getIntent();
        // ActivityConnectionBlue gelen veri almak için ==>
        // blueIndent.putExtra("key_blue",userData);
        blueUserData=blueConnection.getStringExtra("key_blue");
        textViewYellow.setText(blueUserData.trim());
    }
}