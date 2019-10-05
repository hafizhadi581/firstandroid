package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SixthQuestionActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView ivq61;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_question);

        ivq61 = findViewById(R.id.iv_q61);
        ivq61.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view == ivq61){
            Intent intent= new Intent(SixthQuestionActivity.this, SeventhQuestionActivity.class);
            startActivity(intent);
        }
    }
}
