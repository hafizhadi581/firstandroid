package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Eleventh_Question extends AppCompatActivity {
    ImageView btnq111;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleventh_question);

        btnq111 = findViewById(R.id.btnq111);
        btnq111.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Eleventh_Question.this,Twelveth_Question.class);
                startActivity(intent);
            }
        });
    }
}
