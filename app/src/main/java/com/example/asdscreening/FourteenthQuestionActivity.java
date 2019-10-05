package com.example.asdscreening;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FourteenthQuestionActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView ivQ141;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourteenth_question);

        ivQ141 = findViewById(R.id.iv_q41);
        ivQ141.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if(v == ivQ141){
            Intent intent= new Intent(FourteenthQuestionActivity.this, FifthteenthQuestionActivity.class);
            startActivity(intent);
        }
    }
}
