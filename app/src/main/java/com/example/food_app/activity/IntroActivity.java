package com.example.food_app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.food_app.R;

import java.util.Timer;
import java.util.TimerTask;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        Timer timer = new Timer();
        TimerTask nextActivity=new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent(IntroActivity.this, LoginActivity.class);
                startActivity(i);
            }
        };
        timer.schedule(nextActivity, 3000);
    }
}