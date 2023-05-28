package com.example.giftease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nextBtn = findViewById(R.id.nextBtn);

    }

    public void go(View view) {

        Intent intent = new Intent(MainActivity2.this, LoginActivity.class);
        startActivities(new Intent[]{intent});
    }
}