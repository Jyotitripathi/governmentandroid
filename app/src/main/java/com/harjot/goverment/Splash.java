package com.harjot.goverment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
ImageView image;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        image=(ImageView)findViewById(R.id.imageView4);
        textView=(TextView)findViewById(R.id.textView);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mytransition);
        image.startAnimation(myanim);
        textView.startAnimation(myanim);
        Thread timerThread=new Thread(){
            public void run(){
                try{
                    sleep(3000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    Intent intent=new Intent(Splash.this,Welcome.class);
                    startActivity(intent);
                    finish();


                }
            }

        };
        timerThread.start();
    }@Override
    protected void onDestroy() {
        super.onDestroy();
        Splash.this.finish();
    }
}



