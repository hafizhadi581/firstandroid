package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class EighthQuestionActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView ivQ81;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eightth_question);

        ivQ81 = findViewById(R.id.iv_q81);
        ivQ81.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == ivQ81){
            Intent intent = new Intent(EighthQuestionActivity.this, NinthQuestionActivity.class);
            startActivity(intent);
        }
    }
}
