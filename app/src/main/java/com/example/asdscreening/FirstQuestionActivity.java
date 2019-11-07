package com.example.asdscreening;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.asdscreening.rules.Rule1;
import com.example.asdscreening.rules.Rules;

public class FirstQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = FirstQuestionActivity.class.getSimpleName();
    private ImageView ivQ11;
    private Rules rules = Rules.getInstance();

    private CheckBox cbLookAtObject;
    private CheckBox cbPointAtObject;
    private CheckBox cbLookAndCommentToObject;
    private CheckBox cbParrentCommantLook;
    private CheckBox cbIgnoreParent;
    private CheckBox cbLookAroundRandomly;
    private CheckBox cdLookAtParentFinger;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);

        ivQ11 = findViewById(R.id.iv_q11); //next button

        cbLookAtObject = findViewById(R.id.cb_look_at_object);
        cbPointAtObject = findViewById(R.id.cb_point_at_object);
        cbLookAndCommentToObject = findViewById(R.id.cb_look_and_comment_to_object);

        cbParrentCommantLook = findViewById(R.id.cb_parrent_commant_look);
        cbIgnoreParent = findViewById(R.id.cb_ignore_parent);
        cbLookAroundRandomly = findViewById(R.id.cb_look_around_randomly);
        cdLookAtParentFinger = findViewById(R.id.cd_look_at_parent_finger);


        ivQ11.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == ivQ11) {
            rules.setRule1(new Rule1(cbLookAtObject.isChecked(),cbPointAtObject.isChecked(),cbLookAndCommentToObject.isChecked(),
            cbParrentCommantLook.isChecked(),cbIgnoreParent.isChecked(),cbLookAroundRandomly.isChecked(),cdLookAtParentFinger.isChecked()));

            Log.d(TAG, "current score: " + rules.getScore());

//            cbLookAtObject.isChecked(),cbPointAtObject.isChecked(),cbLookAndCommentToObject.isChecked(),
//            cbParrentCommantLook.isChecked(),cbIgnoreParent.isChecked(),cbLookAroundRandomly.isChecked());
            Intent intent = new Intent(FirstQuestionActivity.this, FourteenthQuestionActivity.class); //go to page 2
            startActivity(intent);
        }
    }
}
