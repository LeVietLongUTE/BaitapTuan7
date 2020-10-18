package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main_signup extends AppCompatActivity {
    Button buttom;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        buttom = (Button) findViewById(R.id.buttom_sign);
        buttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_signup.this, MainActivity.class);
                startActivity(intent);
            }
        });

        textView= (TextView) findViewById(R.id.login2);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_signup.this, Main_login.class);
                startActivity(intent);
            }
        });
    }

}
