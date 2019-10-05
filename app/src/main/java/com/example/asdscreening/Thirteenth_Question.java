package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Thirteenth_Question extends AppCompatActivity {
    ImageView btnq131;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteenth_question);

        btnq131 = findViewById(R.id.btnq131);
        btnq131.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Thirteenth_Question.this,Fourteenth_Question.class);
                startActivity(intent);
            }
        });
    }
}
