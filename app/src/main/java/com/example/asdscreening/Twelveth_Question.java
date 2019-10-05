package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Twelveth_Question extends AppCompatActivity {
    ImageView btnq121;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelveth_question);

        btnq121 = findViewById(R.id.btnq121);
        btnq121.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Twelveth_Question.this,Thirteenth_Question.class);
                startActivity(intent);
            }
        });
    }
}
