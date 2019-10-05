package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Second_Question extends AppCompatActivity {
    ImageView btnq21;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_question);

        btnq21 = findViewById(R.id.btnq21);
        btnq21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Second_Question.this,Third_Question.class);
                startActivity(intent);
            }
        });
    }
}
