package com.example.giftease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoActivity extends AppCompatActivity {
    Button goBtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cho);
        goBtn3 = findViewById(R.id.goBtn3);
    }

    public void go(View view) {
        Intent intent = new Intent(ChoActivity.this, MainActivity3.class);
        startActivities(new Intent[]{intent});
    }
}