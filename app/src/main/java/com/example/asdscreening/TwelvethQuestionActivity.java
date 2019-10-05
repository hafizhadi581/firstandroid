package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class TwelvethQuestionActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView ivQ121;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelveth_question);

        ivQ121 = findViewById(R.id.iv_q121);
        ivQ121.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == ivQ121){
            Intent intent = new Intent(TwelvethQuestionActivity.this, ThirteenthQuestionActivity.class);
            startActivity(intent);
        }
    }
}
