package com.hostelfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Window window = getWindow();
        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        TextView tvTitle = findViewById(R.id.tv_title);
        Animation slideAnimation = AnimationUtils.loadAnimation(this, R.anim.side_slide);
        tvTitle.startAnimation(slideAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Intent daySelectionIntent = new Intent(this, )
                //startActivity(intent)
                //finish();
            }
        }, 4000);
    }
}