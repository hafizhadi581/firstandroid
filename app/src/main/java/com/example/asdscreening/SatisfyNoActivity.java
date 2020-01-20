package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class SatisfyNoActivity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox cbNotSatisfyDoctor;
    private CheckBox cbNotSatisfySurrounding;
    private CheckBox cbNotSatisfySelf;
    private TextView tvResult;
    private ImageView ivNotSatisfyNext;
    private InputStream myInputStream;
    private Scanner scan;
    private String aWord;


    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satisfy_no_question);

        cbNotSatisfyDoctor = findViewById(R.id.cb_notsatisfy_doctor);
        cbNotSatisfySurrounding = findViewById(R.id.cb_notsatisfy_surrounding);
        cbNotSatisfySelf = findViewById(R.id.cb_notsatisfy_self);
        ivNotSatisfyNext = findViewById(R.id.iv_not_satisfy_next);
        tvResult = findViewById(R.id.tv_test_result);
        ivNotSatisfyNext.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        if( v == ivNotSatisfyNext){
            //initialize variable

            ArrayList<String> listOfWord = new ArrayList<String>();
            scan = null;
            aWord = "";
            myInputStream = null;
            try {
                myInputStream = getAssets().open("database_file.txt");
                scan = new Scanner(myInputStream).useDelimiter(",");
                while(scan.hasNext()){
                    aWord = scan.next();
                    listOfWord.add(aWord);
                    Toast.makeText(SatisfyNoActivity.this, aWord, Toast.LENGTH_LONG).show();
                }
            } catch (IOException e) {
                Toast.makeText(SatisfyNoActivity.this, e.getClass().getSimpleName() + ": " + e.getMessage(),
                        Toast.LENGTH_LONG).show();
            }
            finally {
                if(scan != null) {
                    scan.close();
                }
                try {
                    if(myInputStream != null){
                        myInputStream.close();
                    }
                } catch (IOException e) {
                    Toast.makeText(SatisfyNoActivity.this, e.getClass().getSimpleName() + ": " + e.getMessage(),
                            Toast.LENGTH_SHORT).show();
                }
            }


            Intent intent = new Intent(SatisfyNoActivity.this,SatisfyNoActivity.class);
            startActivity(intent);

        }


    }
}
