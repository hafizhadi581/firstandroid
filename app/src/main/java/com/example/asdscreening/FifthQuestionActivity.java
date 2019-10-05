package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FifthQuestionActivity extends AppCompatActivity implements View.OnClickListener {
   private ImageView ivQ52;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_question);

        ivQ52 = findViewById(R.id.iv_q52);
        ivQ52.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if( v == ivQ52){
            Intent intent= new Intent(FifthQuestionActivity.this, SixthQuestionActivity.class);
            startActivity(intent);
        }

    }
}
