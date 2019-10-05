package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SeventhQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView ivq71;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh_question);

        ivq71 = findViewById(R.id.iv_q71);
        ivq71.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == ivq71){

            Intent intent= new Intent(SeventhQuestionActivity.this, EighthQuestionActivity.class);
            startActivity(intent);
        }
    }
}



