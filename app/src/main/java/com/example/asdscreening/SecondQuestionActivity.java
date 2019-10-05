package com.example.asdscreening;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

public class SecondQuestionActivity extends AppCompatActivity {

    private ImageView ivq21;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_question);

        ivq21 = findViewById(R.id.)


        Intent intent= new Intent(SecondQuestionActivity.this, ThirdQuestionActivity.class);
        startActivity(intent);

    }



}
