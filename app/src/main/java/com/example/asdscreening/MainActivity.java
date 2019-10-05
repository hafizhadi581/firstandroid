package com.example.asdscreening;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = findViewById(R.id.btn_start); //start button
        btnStart.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == btnStart) {
            Intent intent = new Intent(MainActivity.this, FirstQuestionActivity.class);
            startActivity(intent);
        }
    }
}
