package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdQuestionActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView ivQ31;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_question);

        ivQ31 = findViewById(R.id.iv_q31);
        ivQ31.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == ivQ31) {
            Intent intent = new Intent(ThirdQuestionActivity.this, FourthQuestionActivity.class);
            startActivity(intent);
        }
    }
}
