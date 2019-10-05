package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Seventh_Question extends AppCompatActivity {
    ImageView btnq72;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh_question);

        btnq72 = findViewById(R.id.btnq72);
        btnq72.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Seventh_Question.this, EighthQuestionActivity.class);
                startActivity(intent);
            }
        });
    }
}



