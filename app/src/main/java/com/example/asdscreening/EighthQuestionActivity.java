package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class EighthQuestionActivity extends AppCompatActivity {
    ImageView btnq81;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eightth_question);

        btnq81 = findViewById(R.id.btnq81);
        btnq81.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(EighthQuestionActivity.this, NinthQuestionActivity.class);
                startActivity(intent);
            }
        });
    }
}
