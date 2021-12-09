package com.example.twoactivitieschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView title;
    private TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        title = (TextView) findViewById(R.id.Title);
        description = (TextView) findViewById(R.id.Description);

        Intent intent = getIntent();

        String main = intent.getStringExtra("title");
        String sec = intent.getStringExtra("description");
        title.setText(main);
        description.setText(sec);
    }
}