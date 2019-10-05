package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class TenthQuestionActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView ivq101;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth_question);

        ivq101 = findViewById(R.id.iv_q101);
        ivq101.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == ivq101){
            Intent intent= new Intent(TenthQuestionActivity.this, EleventhQuestionActivity.class);
            startActivity(intent);
        }
    }
}
