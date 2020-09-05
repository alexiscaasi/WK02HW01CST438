package com.example.wk02hw01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LandingPageActivity extends AppCompatActivity {

    private TextView tvUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
        tvUsername = findViewById(R.id.Username);
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        tvUsername.setText("Welcome " + username);
    }
}