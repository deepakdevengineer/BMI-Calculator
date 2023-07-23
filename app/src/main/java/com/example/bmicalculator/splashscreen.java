package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;


public class splashscreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        Intent Home = new Intent(splashscreen.this, MainActivity.class);
        ImageView imageView = findViewById(R.id.splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(Home);

            }
        },6000);
    }
}

