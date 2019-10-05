package com.example.asdscreening;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Fourteenth_Question extends AppCompatActivity {
    ImageView btnq141;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourteenth_question);

        btnq141 = findViewById(R.id.btnq141);
        btnq141.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Fourteenth_Question.this,Fifthteenth_Question.class);
                startActivity(intent);
            }
        });
    }
}
