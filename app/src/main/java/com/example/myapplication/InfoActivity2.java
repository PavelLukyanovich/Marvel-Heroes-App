package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class InfoActivity2 extends AppCompatActivity {
    TextView textview3;
    TextView textview4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info2);

        textview3 = findViewById(R.id.textView3);
        textview4 = findViewById(R.id.textView4);
        Intent intent = getIntent();

        if (intent != null) {
            textview4.setText(intent.getStringExtra("description"));
            textview3.setText(intent.getStringExtra("title"));

        }



    }
}