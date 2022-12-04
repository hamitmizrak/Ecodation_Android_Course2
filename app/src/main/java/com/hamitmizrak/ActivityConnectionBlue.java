package com.hamitmizrak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityConnectionBlue extends AppCompatActivity {
    //Global Variable
    private EditText editTextBlue;
    private Button buttonBlue;

    private String userData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection_blue);
        //ID
        editTextBlue=findViewById(R.id.editTextBlue);
        buttonBlue=findViewById(R.id.buttonBlue);

        //Set On Click Listener
        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blueIndent=new Intent(getApplicationContext(),ActivityConnectionYellow.class);
                userData=editTextBlue.getText().toString().trim();
                Log.e("activity",userData);
                Toast.makeText(ActivityConnectionBlue.this, userData, Toast.LENGTH_SHORT).show();
                blueIndent.putExtra("key_blue",userData);
                startActivity(blueIndent);
            }
        });

    }
}