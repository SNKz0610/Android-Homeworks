package com.example.question2_timber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {
    private String k = "debug";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timber.v("Bye have good time");
        Timber.d("Hello it's me");
    }
}