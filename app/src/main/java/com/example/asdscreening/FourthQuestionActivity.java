package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FourthQuestionActivity extends AppCompatActivity {
    ImageView btnq41;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_question);

        btnq41 = findViewById(R.id.btnq41);
        btnq41.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(FourthQuestionActivity.this,Fifth_Question.class);
                startActivity(intent);
            }
        });
    }
}
