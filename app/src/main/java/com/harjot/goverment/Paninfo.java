package com.harjot.goverment;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Paninfo extends AppCompatActivity {
ViewPager viewPager;
    Button btn;
    private Handler handler;
    PanAdapter adapter1;
    private int delay = 5000; //milliseconds
    private int page ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paninfo);
        btn=(Button)findViewById(R.id.paninfo);
        viewPager = (ViewPager) findViewById(R.id.panviewpager);
        adapter1 = new PanAdapter(this);
        getSupportActionBar().setTitle("VoterCard");
        viewPager.setAdapter(adapter1);
        handler = new Handler();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Paninfo.this, Pancard.class);
                startActivity(intent);
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                page = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        handler.postDelayed(runnable, delay);
    }

    @Override
    protected void onPause() {
        super.onPause();
        handler.removeCallbacks(runnable);
    }

    Runnable runnable = new Runnable() {
        public void run() {
            if (adapter1.getCount() == page) {
                page = 0;
            } else {
                page++;
            }
            viewPager.setCurrentItem(page, true);
            handler.postDelayed(this, delay);
        }
    };

    }

