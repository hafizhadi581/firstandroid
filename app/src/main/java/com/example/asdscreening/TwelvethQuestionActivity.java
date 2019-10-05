package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class TwelvethQuestionActivity extends AppCompatActivity {
    ImageView btnq121;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelveth_question);

        btnq121 = findViewById(R.id.btnq121);
        btnq121.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(TwelvethQuestionActivity.this, ThirteenthQuestionActivity.class);
                startActivity(intent);
            }
        });
    }
}
