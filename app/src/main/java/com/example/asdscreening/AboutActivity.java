package com.example.asdscreening;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity{


    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        TextView tvAbout7 = (TextView) findViewById(R.id.tv_about_7);
        tvAbout7.setMovementMethod(LinkMovementMethod.getInstance());
    }



}
