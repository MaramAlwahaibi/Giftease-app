package com.example.giftease;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AccActivity extends AppCompatActivity {
    Button goBtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acc);
        goBtn4 = findViewById(R.id.goBtn4);
    }

    public void go(View view) {
        Intent intent = new Intent(AccActivity.this, MainActivity3.class);
        startActivities(new Intent[]{intent});
    }
}
