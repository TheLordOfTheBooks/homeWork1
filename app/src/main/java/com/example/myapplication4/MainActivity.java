package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv = findViewById(R.id.textView);
    private TextView tv2 = findViewById(R.id.textView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv.setText("Maxim's app");
        tv.setTextSize(30);
        tv.setTextColor(Color. GREEN);
        tv.setWidth(40);
        tv.setVisibility(View. VISIBLE);
        tv2.setText("secret message");
        tv2.setTextSize(20);
        tv2.setTextColor(Color. GRAY);
        tv2.setWidth(30);
        tv2.setVisibility(View. INVISIBLE);
    }
}