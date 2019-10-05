package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FourthQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView ivQ41;

    private CheckBox cbyq4y1;
    private CheckBox cbyq4y2;
    private CheckBox cbyq4y3;
    private CheckBox cbyq4y4;




    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_question);


        ivQ41 = findViewById(R.id.iv_q41);
        cbyq4y1 = findViewById(R.id.cb_yq4y1);
        cbyq4y2 = findViewById(R.id.cb_yq4y2);
        cbyq4y3 = findViewById(R.id.cb_yq4y3);
        cbyq4y4 = findViewById(R.id.cb_yq4y4);

    }

    @Override
    public void onClick(View v) {
        if(v == ivQ41) {

            rules.setRules4
            Intent intent = new Intent(FourthQuestionActivity.this, FifthQuestionActivity.class);
            startActivity(intent);
        }
    }
}
