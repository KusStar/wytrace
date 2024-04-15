package com.wy.wytrace;

import android.app.Application;

import com.wy.lib.wytrace.ArtMethodTrace;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ArtMethodTrace.fix14debugApp(this);
    }
}
