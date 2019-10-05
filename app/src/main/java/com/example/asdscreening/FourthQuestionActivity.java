package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FourthQuestionActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView ivQ41;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_question);

        ivQ41 = findViewById(R.id.iv_q41);

    }

    @Override
    public void onClick(View v) {
        if(v == ivQ41) {
            Intent intent = new Intent(FourthQuestionActivity.this, FifthQuestionActivity.class);
            startActivity(intent);
        }
    }
}
