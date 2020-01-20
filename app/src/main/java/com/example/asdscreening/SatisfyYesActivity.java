package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SatisfyYesActivity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox cbSatisfyYesDoctor;
    private CheckBox cbSatisfyYesSurrounding;
    private CheckBox cbSatisfyYesSelf;
    private ImageView ivSatisfyNext;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satisfy_yes_question);

        cbSatisfyYesDoctor = findViewById(R.id.cb_satisfy_doctor);
        cbSatisfyYesSurrounding = findViewById(R.id.cb_satisfy_surrounding);
        cbSatisfyYesSelf = findViewById(R.id.cb_satisfy_self);
        ivSatisfyNext = findViewById(R.id.iv_satisfy_next);

        ivSatisfyNext.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v == ivSatisfyNext){
            Intent intent = new Intent(SatisfyYesActivity.this,CalculateScoreActivity.class);
            startActivity(intent);
        }
    }
}
