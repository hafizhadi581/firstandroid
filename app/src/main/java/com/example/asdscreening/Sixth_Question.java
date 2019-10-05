package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Sixth_Question extends AppCompatActivity {
    ImageView btnq62;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_question);

        btnq62 = findViewById(R.id.btnq62);
        btnq62.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Sixth_Question.this,Seventh_Question.class);
                startActivity(intent);
            }
        });
    }
}
