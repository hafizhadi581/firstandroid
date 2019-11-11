package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SettingActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView sound;
    private ImageView noSound;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        TextView tvSetting5 = (TextView) findViewById(R.id.tv_setting_5);
        tvSetting5.setMovementMethod(LinkMovementMethod.getInstance());
        sound = findViewById(R.id.iv_sound);
        noSound = findViewById(R.id.iv_no_sound);
        sound.setOnClickListener(this);
        noSound.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v == sound){
            startService(new Intent(this, MyService.class));
        }
        else if (v == noSound){
            stopService(new Intent(this, MyService.class));
        }

    }
}
