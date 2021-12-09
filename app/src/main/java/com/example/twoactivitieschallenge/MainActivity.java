package com.example.twoactivitieschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button Text1;
    private Button Text2;
    private Button Text3;
    private Intent intent;
    private String title;
    private String description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Text1=(Button) findViewById(R.id.bText1);
        Text2=(Button) findViewById(R.id.bText2);
        Text3=(Button) findViewById(R.id.bText3);

        Text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title= getString(R.string.title_joy);
                description = getString(R.string.description_joy);
                intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("title", title);
                intent.putExtra("description", description);
                startActivity(intent);
            }
        });

        Text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title= getString(R.string.title_imagination);
                description = getString(R.string.description_imagination);
                intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("title", title);
                intent.putExtra("description", description);
                startActivity(intent);
            }
        });

        Text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title= getString(R.string.title_trauma);
                description = getString(R.string.description_trauma);
                intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("title", title);
                intent.putExtra("description", description);
                startActivity(intent);
            }
        });

    }
}