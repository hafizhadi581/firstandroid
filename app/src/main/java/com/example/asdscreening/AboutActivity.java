package com.example.asdscreening;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;



public class AboutActivity extends YouTubeBaseActivity {

    private YouTubePlayerView mYoutubePlayerView;
    private Button btnPlay;
    private static final String TAG = "AboutActivity";
    private TextView tvAbout7;

    YouTubePlayer.OnInitializedListener mOnInitializedListener;
    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Log.d(TAG, "onCreate: Starting.");
        btnPlay = findViewById(R.id.btn_play);
        mYoutubePlayerView = (YouTubePlayerView) findViewById(R.id.vv_youtube);
        tvAbout7 = findViewById(R.id.tv_about_7);
        tvAbout7.setMovementMethod(LinkMovementMethod.getInstance());

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG, "onClick: Done initializing");

                youTubePlayer.loadVideo("FCejya1WWC8");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "onClick: fail initializing");
            }
        };

        btnPlay.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Initializing Youtube Player");
                mYoutubePlayerView.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
                Log.d(TAG, "onClick: Done initializing");
            }
        }));

    }

}
