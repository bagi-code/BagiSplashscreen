package com.bagicode.www.bagisplashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    //inisialisasi timer
    private static int SPLASHTIMEOUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // if timer off, method run run run run :p
        // go testing

        // it runs :D
        // dont forget subsribe, bye dude :)

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent goMain = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(goMain);

                finish();
            }
        }, SPLASHTIMEOUT);

    }
}
