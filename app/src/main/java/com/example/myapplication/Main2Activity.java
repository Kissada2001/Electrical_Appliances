package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText user,time;
    Button btn;
    int result;
    double num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        time = findViewById(R.id.answerre);
        user = findViewById(R.id.hrs);
        btn = findViewById(R.id.conti);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Integer.parseInt(user.getText().toString());
                num = Double.parseDouble(time.getText().toString());
                Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                intent.putExtra("key",result);
                intent.putExtra("time",num);
                startActivity(intent);


            }
        });
    }
}
