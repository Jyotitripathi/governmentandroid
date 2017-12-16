package com.harjot.goverment;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

import at.markushi.ui.CircleButton;

public class Home extends AppCompatActivity {
ViewPager viewPager;
    CustomSwipeAdapter adapter;
    Button btn;
    StorageReference storageRef;
    String url;
    Uri gmmIntentUri,gmmIntentUri1;
    Intent mapIntent,mapIntent1;
    CircleButton adharcard,votercard,Passport,P,driving,resident,n1,n2,loc1,loc2,loc3,loc4,loc6,n3,n4;
    private Handler handler;
    private int delay = 5000; //milliseconds
    private int page = 0;
    ImageView im;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,101,0,"Aadharcard");
        menu.add(0,102,0,"Voter Card");
        menu.add(0,103,0,"PanCard");
        menu.add(0,104,0,"Passport");
        menu.add(0,105,0,"Driving Licences");
        menu.add(0,106,0,"Resident Certificate");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==101){
            Intent intent=new Intent(Home.this,Splashadhar.class);
            startActivity(intent);
        }
        if(item.getItemId()==102){
            Intent intent1=new Intent(Home.this,Splashvoter.class);
            startActivity(intent1);
        }
        if (item.getItemId()==103){
            Intent intent2=new Intent(Home.this,PanSplash.class);
            startActivity(intent2);
        }
        return true;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);
        viewPager=(ViewPager)findViewById(R.id.viewpager);



        adapter=new CustomSwipeAdapter(this);
btn=(Button)findViewById(R.id.status);

        viewPager.setAdapter(adapter);

         handler=new Handler();
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

        adharcard=(CircleButton)findViewById(R.id.circleButton2);
        votercard=(CircleButton)findViewById(R.id.circleButton3);
        Passport=(CircleButton)findViewById(R.id.passport);
        P=(CircleButton)findViewById(R.id.pancard);
        driving=(CircleButton)findViewById(R.id.dl);
        n1=(CircleButton)findViewById(R.id.n);
        n2=(CircleButton)findViewById(R.id.ajit);
        n3=(CircleButton)findViewById(R.id.ja);
        n4=(CircleButton)findViewById(R.id.t);
        resident=(CircleButton)findViewById(R.id.residen) ;
        loc1=(CircleButton)findViewById(R.id.L1);
        loc2=(CircleButton)findViewById(R.id.L2);
        loc3=(CircleButton)findViewById(R.id.L3);
        loc4=(CircleButton)findViewById(R.id.L4);

        loc6=(CircleButton)findViewById(R.id.L6);


        adharcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home.this,Splashadhar.class);
                startActivity(intent);
                finish();
            }
        });
        votercard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Home.this,Splashvoter.class);
                startActivity(intent1);
                finish();
            }
        });
        Passport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(Home.this,SplashPassport.class);
                startActivity(intent2);
            }
        });
        P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten3=new Intent(Home.this,Paninfo.class);
                startActivity(inten3);
            }
        });
        driving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home.this,Drivinginfo.class);
                startActivity(intent);
            }
        });
        resident.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentw=new Intent(Home.this,Residentcertiicate.class);
                startActivity(intentw);
            }
        });
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                url="http://epaper.tribuneindia.com/";
                Intent intent=new Intent(Home.this,Aadharwebview.class);
                intent.putExtra("URL",url);
                startActivity(intent);
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                url="http://epaper.ajitjalandhar.com/";
                Intent intent3=new Intent(Home.this,Aadharwebview.class);
                intent3.putExtra("URL",url);
                startActivity(intent3);
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                url="http://jagbani.epapr.in/";
                Intent intent4=new Intent(Home.this,Aadharwebview.class);
                intent4.putExtra("URL",url);
                startActivity(intent4);
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                url="http://epaper.timesgroup.com/Olive/ODN/TimesOfIndia/#";
                Intent intent5=new Intent(Home.this,Aadharwebview.class);
                intent5.putExtra("URL",url);
                startActivity(intent5);
            }
        });
        loc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gmmIntentUri = Uri.parse("geo:0,0?q=Aadhar Enrolment Center");
                mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
loc2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        gmmIntentUri = Uri.parse("geo:0,0?q=Votercard");
        mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
});
loc3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        gmmIntentUri = Uri.parse("geo:0,0?q=Driving Licence Authority");
        mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }
});
        loc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gmmIntentUri1 = Uri.parse("geo:0,0?q=Passport Seva Kendra");
                mapIntent1 = new Intent(Intent.ACTION_VIEW, gmmIntentUri1);
                mapIntent1.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent1);

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
            if (adapter.getCount() == page) {
                page = 0;
            } else {
                page++;
            }
            viewPager.setCurrentItem(page, true);
            handler.postDelayed(this, delay);
        }
    };
}


