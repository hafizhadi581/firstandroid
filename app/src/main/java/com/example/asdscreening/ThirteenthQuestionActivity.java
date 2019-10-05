package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirteenthQuestionActivity extends AppCompatActivity {
    ImageView btnq131;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteenth_question);

        btnq131 = findViewById(R.id.btnq131);
        btnq131.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ThirteenthQuestionActivity.this, FourteenthQuestionActivity.class);
                startActivity(intent);
            }
        });
    }
}
