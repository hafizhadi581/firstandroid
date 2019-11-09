package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.asdscreening.rules.Rule16;
import com.example.asdscreening.rules.Rules;

public class SixthteenthQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private Rules rules = Rules.getInstance();
    private final String TAG = "Activity 16: ";

    private CheckBox cbLookSomething;
    private CheckBox cbLookToward;
    private CheckBox cbPointToward;
    private CheckBox cbLookAround;
    private CheckBox cbIgnore;
    private CheckBox cbLookFace;

    private ImageView ivQ161;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixteenth_question);

        cbLookSomething = findViewById(R.id.cb_look_something);
        cbLookToward = findViewById(R.id.cb_look_toward);
        cbPointToward = findViewById(R.id.cb_point_toward);
        cbLookAround = findViewById(R.id.cb_look_around);
        cbIgnore = findViewById(R.id.cb_ignore);
        cbLookFace = findViewById(R.id.cb_look_face);

        ivQ161 = findViewById(R.id.iv_q161);
        ivQ161.setOnClickListener(this);

    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {

            case R.id.cb_look_something:

                if (checked)
                    hideCbLookSomething();
                    //do things when checked
                else
                    showCbLookSomething();
                // do things when unchecked
                break;

        }
    }

    private void hideCbLookSomething(){

        View tvQ161Hide = findViewById(R.id.tv_yq161);
        tvQ161Hide.setVisibility(View.GONE);

        View cbLookTorwardHide = findViewById(R.id.cb_look_toward);
        cbLookTorwardHide.setVisibility(View.GONE);
        View tvYq162Hide = findViewById(R.id.tv_yq162);
        tvYq162Hide.setVisibility(View.GONE);

        View cbPointTorwardHide = findViewById(R.id.cb_point_toward);
        cbPointTorwardHide.setVisibility(View.GONE);
        View tvYq163Hide = findViewById(R.id.tv_yq163);
        tvYq163Hide.setVisibility(View.GONE);

        View cbLookAroundHide = findViewById(R.id.cb_look_around);
        cbLookAroundHide.setVisibility(View.GONE);
        View tvYq164Hide = findViewById(R.id.tv_yq164);
        tvYq164Hide.setVisibility(View.GONE);

        View cbIgnoreHide = findViewById(R.id.cb_ignore);
        cbIgnoreHide.setVisibility(View.GONE);
        View tvYq165Hide = findViewById(R.id.tv_yq165);
        tvYq165Hide.setVisibility(View.GONE);

        View cbLookFaceHide = findViewById(R.id.cb_look_face);
        cbLookFaceHide.setVisibility(View.GONE);
        View tvYq166Hide = findViewById(R.id.tv_yq166);
        tvYq166Hide.setVisibility(View.GONE);

    }

    private void showCbLookSomething() {

        View tvQ161Show = findViewById(R.id.tv_yq161);
        tvQ161Show.setVisibility(View.VISIBLE);

        View cbLookTorwardShow = findViewById(R.id.cb_look_toward);
        cbLookTorwardShow.setVisibility(View.VISIBLE);
        View tvYq162Show = findViewById(R.id.tv_yq162);
        tvYq162Show.setVisibility(View.VISIBLE);

        View cbPointTorwardShow = findViewById(R.id.cb_point_toward);
        cbPointTorwardShow.setVisibility(View.VISIBLE);
        View tvYq163Show = findViewById(R.id.tv_yq163);
        tvYq163Show.setVisibility(View.VISIBLE);

        View cbLookAroundShow = findViewById(R.id.cb_look_around);
        cbLookAroundShow.setVisibility(View.VISIBLE);
        View tvYq164Show = findViewById(R.id.tv_yq164);
        tvYq164Show.setVisibility(View.VISIBLE);

        View cbIgnoreShow = findViewById(R.id.cb_ignore);
        cbIgnoreShow.setVisibility(View.VISIBLE);
        View tvYq165Show = findViewById(R.id.tv_yq165);
        tvYq165Show.setVisibility(View.VISIBLE);

        View cbLookFaceShow = findViewById(R.id.cb_look_face);
        cbLookFaceShow.setVisibility(View.VISIBLE);
        View tvYq166Show = findViewById(R.id.tv_yq166);
        tvYq166Show.setVisibility(View.VISIBLE);

    }


    @Override
    public void onClick(View v) {
        if (v == ivQ161) {

            rules.setRule16(new Rule16(cbLookSomething.isChecked(), cbLookToward.isChecked(),
                    cbPointToward.isChecked(), cbLookAround.isChecked(), cbIgnore.isChecked(), cbLookFace.isChecked()));
            Log.d(TAG, "current score: " + rules.getScore());
            Intent intent = new Intent(SixthteenthQuestionActivity.this, CalculateScoreActivity.class);
            startActivity(intent);
        }
    }


}
