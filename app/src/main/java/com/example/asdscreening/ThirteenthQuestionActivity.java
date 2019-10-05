package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirteenthQuestionActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView ivQ131;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteenth_question);

        ivQ131 = findViewById(R.id.iv_q131);

        ivQ131.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == ivQ131) {
            Intent intent = new Intent(ThirteenthQuestionActivity.this, FourteenthQuestionActivity.class);
            startActivity(intent);
        }
    }
}
