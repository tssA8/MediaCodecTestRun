package com.example.kuohsuan.mediacodectest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private MediaCodeTest mMediaCodeTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(mMediaCodeTest == null) {
            MediaCodeTest.Builder builder = new MediaCodeTest.Builder(this);
            mMediaCodeTest = builder.build(3840, 2160, 15, 500000);
            mMediaCodeTest.onStartTest();
        }

    }
}
