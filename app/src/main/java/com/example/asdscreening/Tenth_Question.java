package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Tenth_Question extends AppCompatActivity {
    ImageView btnq101;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth_question);

        btnq101 = findViewById(R.id.btnq101);
        btnq101.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Tenth_Question.this,Eleventh_Question.class);
                startActivity(intent);
            }
        });

    }
}
