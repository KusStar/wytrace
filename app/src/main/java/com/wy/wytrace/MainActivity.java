package com.wy.wytrace;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //步骤1
        super.onCreate(savedInstanceState);
        //步骤2
        setContentView(R.layout.activity_main);
        //步骤3
        test();
    }

    public void test() {
        SystemClock.sleep(100);

    }
}