package com.example.giftease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FlowerActivity extends AppCompatActivity {

    Button goBtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower);
        goBtn1 = findViewById(R.id.goBtn1);

    }

    public void go(View view) {
        Intent intent = new Intent(FlowerActivity.this, MainActivity3.class);
        startActivities(new Intent[]{intent});
    }
    }
