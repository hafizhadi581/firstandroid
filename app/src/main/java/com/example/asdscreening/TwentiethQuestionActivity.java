package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.asdscreening.rules.Rule2;
import com.example.asdscreening.rules.Rule20;
import com.example.asdscreening.rules.Rules;

public class TwentiethQuestionActivity extends AppCompatActivity implements View.OnClickListener {


    private final String TAG = "Activity 20: ";
    private Rules rules = Rules.getInstance();
    private CheckBox cbMoving;
    private CheckBox cbMovingBounce;
    private CheckBox cbLaugh;
    private CheckBox cbBabble;
    private CheckBox cbRequest;

    private ImageView ivQ201;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twentieth_question);

        cbMoving = findViewById(R.id.cb_movement);
        cbMovingBounce = findViewById(R.id.cb_move_bounced);
        cbLaugh = findViewById(R.id.cb_laugh);
        cbBabble = findViewById(R.id.cb_babble);
        cbRequest = findViewById(R.id.cb_request);
        ivQ201 = findViewById(R.id.iv_q201);

        ivQ201.setOnClickListener(this);
    }
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {

            case R.id.cb_movement:

                if (checked)
                    showCbMovement();
                    //do things when checked
                else
                    hideCbMovement();
                // do things when unchecked
                break;

        }
    }

    private void showCbMovement() {

        View cbMoveBouncedShow = findViewById(R.id.cb_move_bounced);
        cbMoveBouncedShow.setVisibility(View.VISIBLE);
        View tvYq202show = findViewById(R.id.tv_yq202);
        tvYq202show.setVisibility(View.VISIBLE);

    }

    private void hideCbMovement() {

        View cbMoveBouncedHide = findViewById(R.id.cb_move_bounced);
        cbMoveBouncedHide.setVisibility(View.GONE);
        View tvYq202Show = findViewById(R.id.tv_yq202);
        tvYq202Show.setVisibility(View.GONE);

    }
    @Override
    public void onClick(View v) {

        if (v == ivQ201) {

            rules.setRule20(new Rule20(cbMoving.isChecked(),
                    cbMovingBounce.isChecked(),
                    cbLaugh.isChecked(),
                    cbBabble.isChecked(),
                    cbRequest.isChecked()));

            Log.d(TAG, "current score: " + rules.getScore());

            Intent intent = new Intent(TwentiethQuestionActivity.this, CalculateScoreActivity.class);
            startActivity(intent);
        }

    }
}
