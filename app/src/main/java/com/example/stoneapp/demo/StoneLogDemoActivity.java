package com.example.stoneapp.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.stoneapp.R;
import com.example.stonelibrary.log.StoneLog;

public class StoneLogDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stone_log_demo);
        Button mBtPrint = findViewById(R.id.mBtPrint);
        mBtPrint.setOnClickListener(v -> {
            printLog();
        });
    }

    private void printLog() {
        StoneLog.a("9900");
    }
}