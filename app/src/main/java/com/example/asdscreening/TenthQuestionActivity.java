package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.asdscreening.rules.Rule10;
import com.example.asdscreening.rules.Rules;

public class TenthQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = TenthQuestionActivity.class.getSimpleName();
    private Rules rules = Rules.getInstance();

    private CheckBox cbRespondLook;
    private CheckBox cbRespondTalk;
    private CheckBox cbRespondStop;
    private CheckBox cbNoRespond;
    private CheckBox cbHearButIgnore;
    private CheckBox cbRespondParentInfront;
    private CheckBox cbRespondTouch;
    private ImageView ivq101;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth_question);


        cbRespondLook = findViewById(R.id.cb_respond_look);
        cbRespondTalk = findViewById(R.id.cb_respond_talk);
        cbRespondStop = findViewById(R.id.cb_respond_stop);
        cbNoRespond = findViewById(R.id.cb_no_respond);
        cbHearButIgnore = findViewById(R.id.cb_hear_but_ignore);
        cbRespondParentInfront = findViewById(R.id.cb_respond_parent_infront);
        cbRespondTouch = findViewById(R.id.cb_respond_touch);
        ivq101 = findViewById(R.id.iv_q101);

        ivq101.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if (view == ivq101){

            rules.setRule10(new Rule10(cbRespondLook.isChecked(), cbRespondTalk.isChecked(), cbRespondStop.isChecked(), cbNoRespond.isChecked(), cbHearButIgnore.isChecked(), cbRespondParentInfront.isChecked(), cbRespondTouch.isChecked()));

            Log.d(TAG, "current score: " + rules.getScore());

            Intent intent= new Intent(TenthQuestionActivity.this, EleventhQuestionActivity.class);
            startActivity(intent);
        }
    }
}
