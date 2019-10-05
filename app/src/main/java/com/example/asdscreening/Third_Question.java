package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Third_Question extends AppCompatActivity {
    ImageView btnq31;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_question);

        btnq31 = findViewById(R.id.btnq31);
        btnq31.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Third_Question.this,Fourth_Question.class);
                startActivity(intent);
            }
        });
    }
}
