package com.hamitmizrak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageTutorials extends AppCompatActivity {

    //Global Variable
    private ImageView ImageViewInternetPictures;
    private String internetPictureUrl="https://ecodation.com/wp-content/uploads/2021/03/cropped-ecodationlogo.png";
    private String internetPictureGif="https://yunti.files.wordpress.com/2019/01/turk_bayragi_03_tam35blog.gif";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_tutorials);
        //ID
        ImageViewInternetPictures=findViewById(R.id.ImageViewInternetPictures);
        Glide.with(getApplicationContext())
                .load(internetPictureGif)
                .into(ImageViewInternetPictures);
    }
}