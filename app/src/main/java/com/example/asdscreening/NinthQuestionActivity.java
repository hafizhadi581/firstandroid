package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class NinthQuestionActivity extends AppCompatActivity {
    ImageView btnq91;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth_question);

        btnq91 = findViewById(R.id.btnq91);
        btnq91.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(NinthQuestionActivity.this, TenthQuestionActivity.class);
                startActivity(intent);
            }
        });

    }

}
