package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView edit;
    double n,t;
    int p;
    Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        edit = findViewById(R.id.result);
        home = findViewById(R.id.home);
        p = getIntent().getExtras().getInt("key");
        t = getIntent().getExtras().getDouble("time");
        n = (p*t*30*4.3)/1000;
        edit.setText(String.format("%.2f",n));

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
