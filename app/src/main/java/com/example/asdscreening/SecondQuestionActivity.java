package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

public class SecondQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView ivq21;

    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_question);

        ivq21 = findViewById(R.id.iv_q21);
        ivq21.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if(view == ivq21) {
            Intent intent = new Intent(SecondQuestionActivity.this, ThirdQuestionActivity.class);
            startActivity(intent);
        }

    }
}
