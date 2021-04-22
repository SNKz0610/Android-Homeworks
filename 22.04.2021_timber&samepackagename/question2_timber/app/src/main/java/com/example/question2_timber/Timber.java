package com.example.question2_timber;

import android.app.Application;

public class Timber extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        timber.log.Timber.plant(new timber.log.Timber.DebugTree());
    }
}
