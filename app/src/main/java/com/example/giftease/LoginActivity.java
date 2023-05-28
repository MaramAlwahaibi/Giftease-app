package com.example.giftease;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {
    Button flower;
    Button Accessories;
    Button choclatebutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        flower = findViewById(R.id.Flawers);
        Accessories = findViewById(R.id.Accessories);
        choclatebutton = findViewById(R.id.choclatebutton);

        flower.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, FlowerActivity.class);
            startActivities(new Intent[]{intent});

        });

        Accessories.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, AccActivity.class);
            startActivities(new Intent[]{intent});
        });

        choclatebutton.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, ChoActivity.class);
            startActivities(new Intent[]{intent});
        });
    }
}