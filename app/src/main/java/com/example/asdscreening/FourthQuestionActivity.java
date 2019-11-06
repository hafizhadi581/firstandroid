package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.asdscreening.rules.Rule4;
import com.example.asdscreening.rules.Rules;

public class FourthQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG =  "Activity 4: ";
    private ImageView ivQ42;

    private Rules rules = Rules.getInstance();
    private CheckBox cbyq4y1;
    private CheckBox cbyq4y2;
    private CheckBox cbyq4y3;
    private CheckBox cbyq4y4;




    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_question);


        ivQ42 = findViewById(R.id.iv_q42);
        cbyq4y1 = findViewById(R.id.cb_yq4y1);
        cbyq4y2 = findViewById(R.id.cb_yq4y2);
        cbyq4y3 = findViewById(R.id.cb_yq4y3);
        cbyq4y4 = findViewById(R.id.cb_yq4y4);


        //wajib
        ivQ42.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == ivQ42) {

            rules.setRule4(new Rule4(cbyq4y1.isChecked(),
                    cbyq4y2.isChecked(),
                    cbyq4y3.isChecked(),
                    cbyq4y4.isChecked()));
            Log.d(TAG, "current score: " + rules.getScore());
            Intent intent = new Intent(FourthQuestionActivity.this,FifthQuestionActivity.class);
            startActivity(intent);
        }
    }
}
