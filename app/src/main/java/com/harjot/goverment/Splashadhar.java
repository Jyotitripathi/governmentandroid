package com.harjot.goverment;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splashadhar extends AppCompatActivity {
    ImageView imageView;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashadhar);
        getSupportActionBar().hide();
        imageView=(ImageView)findViewById(R.id.aadhar);
        txt=(TextView)findViewById(R.id.adhartxt);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mytransition);
        imageView.startAnimation(myanim);
        txt.startAnimation(myanim);
        Thread timerThread=new Thread(){
            public void run(){
                try{
                    sleep(5000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    Intent intent=new Intent(Splashadhar.this,Adharcard.class);
                    startActivity(intent);
                    finish();


                }
            }

        };
        timerThread.start();
    }
}
