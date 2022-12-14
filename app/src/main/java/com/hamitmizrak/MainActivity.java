package com.hamitmizrak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    //Global VAriable
    private Button buttonOtherActivityId;
    private Button buttonApplicationData1Id;

    // activityler arası veri taşımak
    private Button buttonActivityBlueId;

    //image
    private Button buttonActivityImageId;

    //fab
    private FloatingActionButton floatingActionButtonId;

    //progress bar
    private ProgressBar progressBarId;

    //radioButton
    private RadioGroup radioGroupId;
    private RadioButton RadioButtonFemale;
    private RadioButton RadioButtonMale;
    private Button buttonRadioSubmit;

    //listView
    private Button buttonActivityListViewId;


    //ReCyclerView listView'e göre daha gelişmiştir.
    private Button buttonActivityReCyclerViewId;

    //menu ıtem
    private Button buttonMenuButtonId;

    //camera
    private Button buttonCameraId;

    //Firebase RealTime
    private Button buttonActivityFirebasetutorialsId;

    //Firebase LocalStorage
    private Button buttonActivityFirebaseLocalStorageId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //start data
        //ID
        //other Activity
        buttonOtherActivityId = findViewById(R.id.buttonOtherActivityId);
        buttonOtherActivityId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Data 555");
                Log.e("Intent,Toast", "Intent Toast");
                // Diğer Activity geçiş için
                Intent otherActivityIntent = new Intent(getApplicationContext(), OtherActivity.class);

                // Ekranda Bilgi mesajı için kullanıyoruz
                Toast.makeText(MainActivity.this, "Other Activity Yönlendirildi ...", Toast.LENGTH_LONG).show();
                startActivity(otherActivityIntent);
            }
        });

        //Application 1
        buttonApplicationData1Id = findViewById(R.id.buttonApplicationData1Id);
        buttonApplicationData1Id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentApplication1 = new Intent(getApplicationContext(), ApplicationData1.class);
                Toast.makeText(MainActivity.this, "My Application Data 1 Redirect", Toast.LENGTH_SHORT).show();
                startActivity(intentApplication1);
            }
        });

        //ID Blue other connection activity
        buttonActivityBlueId = findViewById(R.id.buttonActivityBlueId);
        buttonActivityBlueId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBlueConnection = new Intent(getApplicationContext(), ActivityConnectionBlue.class);
                Toast.makeText(MainActivity.this, "Activity Connection Blue", Toast.LENGTH_SHORT).show();
                startActivity(intentBlueConnection);
            }
        });


        //picture
        buttonActivityImageId = findViewById(R.id.buttonActivityImageId);
        buttonActivityImageId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentImageConnection = new Intent(getApplicationContext(), ImageTutorials.class);
                Toast.makeText(MainActivity.this, "Resim Tutorials", Toast.LENGTH_SHORT).show();
                startActivity(intentImageConnection);
            }
        });

        //progressBar
        progressBarId = findViewById(R.id.progressBarId);
        progressBarId.setVisibility(View.INVISIBLE);

        //fab
        floatingActionButtonId = findViewById(R.id.floatingActionButtonId);
        floatingActionButtonId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBarId.setVisibility(View.VISIBLE);
            }
        });

        //Radio Button
        radioGroupId = findViewById(R.id.radioGroupId);
        RadioButtonFemale = findViewById(R.id.RadioButtonFemale);
        RadioButtonMale = findViewById(R.id.RadioButtonMale);
        buttonRadioSubmit=findViewById(R.id.buttonRadioSubmit);
        buttonRadioSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioCheckButtonId = radioGroupId.getCheckedRadioButtonId();
                switch (radioCheckButtonId) {
                    case R.id.RadioButtonFemale:
                        Toast.makeText(MainActivity.this, "Bayan", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.RadioButtonMale:
                        Toast.makeText(MainActivity.this, "Erkek", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        //ListView
        buttonActivityListViewId=findViewById(R.id.buttonActivityListViewId);
        buttonActivityListViewId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentImageConnection = new Intent(getApplicationContext(), ListViewData.class);
                Toast.makeText(MainActivity.this, "ListView Clicked", Toast.LENGTH_SHORT).show();
                startActivity(intentImageConnection);
            }
        });

        //ReCyclerView
        buttonActivityReCyclerViewId=findViewById(R.id.buttonActivityReCyclerViewId);
        buttonActivityReCyclerViewId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentImageConnection = new Intent(getApplicationContext(), ReCyclerViewData.class);
                Toast.makeText(MainActivity.this, "ReCyclerView Clicked", Toast.LENGTH_SHORT).show();
                startActivity(intentImageConnection);
            }
        });

        //menu ıtem
        buttonMenuButtonId=findViewById(R.id.buttonMenuButtonId);
        buttonMenuButtonId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenu = new Intent(getApplicationContext(), MenuActivity.class);
                Toast.makeText(MainActivity.this, "intentMenu Clicked", Toast.LENGTH_SHORT).show();
                startActivity(intentMenu);
            }
        });

        //camera
        buttonCameraId=findViewById(R.id.buttonCameraId);
        buttonCameraId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenu = new Intent(getApplicationContext(), CameraActivity.class);
                Toast.makeText(MainActivity.this, "CameraActivity Clicked", Toast.LENGTH_SHORT).show();
                startActivity(intentMenu);
            }
        });

        //firebaseButton Realtime
        buttonActivityFirebasetutorialsId=findViewById(R.id.buttonActivityFirebasetutorialsId);
        buttonActivityFirebasetutorialsId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenu = new Intent(getApplicationContext(), Firebasetutorials.class);
                Toast.makeText(MainActivity.this, "Firebase tutorials Clicked", Toast.LENGTH_SHORT).show();
                startActivity(intentMenu);
            }
        });

        //firabase localStorage
        buttonActivityFirebaseLocalStorageId=findViewById(R.id.buttonActivityFirebaseLocalStorageId);
        buttonActivityFirebaseLocalStorageId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenu = new Intent(getApplicationContext(), Firebasetutorials.class);
                Toast.makeText(MainActivity.this, "Firebase tutorials Clicked", Toast.LENGTH_SHORT).show();
                startActivity(intentMenu);
            }
        });

    } //end onCreate
}