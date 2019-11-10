package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import com.example.asdscreening.rules.Rule15;
import com.example.asdscreening.rules.Rules;

import androidx.appcompat.app.AppCompatActivity;

public class FifthteenthQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private Rules rules = Rules.getInstance();
    private final String TAG = "Activity 15: ";

    private CheckBox cbCopyTongue;
    private CheckBox cbCopySound;
    private CheckBox cbCopyWave;
    private CheckBox cbCopyClap;
    private CheckBox cbCopySignal;
    private CheckBox cbCopyKiss;
    private ImageView ivQ151;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifthteenth_question);

        cbCopyTongue = findViewById(R.id.cb_copy_tongue);
        cbCopySound = findViewById(R.id.cb_copy_sound);
        cbCopyWave = findViewById(R.id.cb_copy_wave);
        cbCopyClap = findViewById(R.id.cb_copy_clap);
        cbCopySignal = findViewById(R.id.cb_copy_signal);
        cbCopyKiss = findViewById(R.id.cb_copy_kiss);
        ivQ151 = findViewById(R.id.iv_q151);

        ivQ151.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == ivQ151) {

            rules.setRule15(new Rule15(cbCopyTongue.isChecked(),
                    cbCopySound.isChecked(),
                    cbCopyWave.isChecked(),
                    cbCopyClap.isChecked(),
                    cbCopySignal.isChecked(),
                    cbCopyKiss.isChecked()));

            Log.d(TAG, "current score: " + rules.getScore());
            Intent intent = new Intent(FifthteenthQuestionActivity.this, CalculateScoreActivity.class);
            startActivity(intent);
        }
    }
}
