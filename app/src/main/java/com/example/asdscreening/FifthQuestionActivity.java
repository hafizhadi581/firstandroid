package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FifthQuestionActivity extends AppCompatActivity {
    ImageView btnq52;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_question);

        btnq52 = findViewById(R.id.btnq52);
        btnq52.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(FifthQuestionActivity.this, SixthQuestionActivity.class);
                startActivity(intent);
            }
        });
    }
}
