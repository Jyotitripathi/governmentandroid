package com.harjot.goverment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PanSplash extends AppCompatActivity {
ImageView image;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pan_splash);
        getSupportActionBar().hide();
        image=(ImageView)findViewById(R.id.pan1);
        txt=(TextView)findViewById(R.id.pan2);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mytransition);
        image.startAnimation(myanim);
        txt.startAnimation(myanim);
        Thread timerThread=new Thread(){
            public void run(){
                try{
                    sleep(3000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    Intent intent=new Intent(PanSplash.this,Paninfo.class);
                    startActivity(intent);
                    finish();


                }
            }

        };
        timerThread.start();
    }
}
