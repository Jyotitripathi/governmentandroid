package com.harjot.goverment;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;

import at.markushi.ui.CircleButton;

public class Passport extends AppCompatActivity implements View.OnClickListener {
CircleButton p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12;
    String url;
    Uri gmmIntentUri,gmmIntentUri1;
    Intent mapIntent,mapIntent1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passport);
        p1=(CircleButton)findViewById(R.id.stat1);
        p1.setOnClickListener(this);
        p2=(CircleButton)findViewById(R.id.stat2);
        p2.setOnClickListener(this);
        p3=(CircleButton)findViewById(R.id.stat3);
        p3.setOnClickListener(this);
        p4=(CircleButton)findViewById(R.id.stat4);
        p4.setOnClickListener(this);
        p5=(CircleButton)findViewById(R.id.stat5);
        p5.setOnClickListener(this);
        p6=(CircleButton)findViewById(R.id.stat6);
        p6.setOnClickListener(this);
        p7=(CircleButton)findViewById(R.id.stat7);
        p7.setOnClickListener(this);
        p8=(CircleButton)findViewById(R.id.stat8);
        p8.setOnClickListener(this);
        p9=(CircleButton)findViewById(R.id.stat9);
        p9.setOnClickListener(this);
        p10=(CircleButton)findViewById(R.id.stat10);
        p10.setOnClickListener(this);
        p11=(CircleButton)findViewById(R.id.stat11);
        p11.setOnClickListener(this);
        p12=(CircleButton)findViewById(R.id.stat12);
        p12.setOnClickListener(this);




    }
    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch (id) {

            case R.id.stat1:
                url="https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en";
                Intent intent=new Intent(Passport.this,Aadharwebview.class);
                intent.putExtra("URL",url);
                startActivity(intent);
                break;
            case R.id.stat2:
                url="http://www.passportindia.gov.in/AppOnlineProject/statusTracker/trackStatusInpNew";
                Intent intent1=new Intent(Passport.this,Aadharwebview.class);
                intent1.putExtra("URL",url);
                startActivity(intent1);
                break;
            case R.id.stat4:
                url="https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en";
                Intent intent2=new Intent(Passport.this,Aadharwebview.class);
                intent2.putExtra("URL",url);
                startActivity(intent2);
                break;
            case R.id.stat5:
                url="https://portal1.passportindia.gov.in/AppOnlineProject/secure/mainFormOptions";
                Intent intent3=new Intent(Passport.this,Aadharwebview.class);
                intent3.putExtra("URL",url);
                startActivity(intent3);
                break;
            case R.id.stat6:
                gmmIntentUri1 = Uri.parse("geo:0,0?q=Passport Seva Kendra");
                mapIntent1 = new Intent(Intent.ACTION_VIEW, gmmIntentUri1);
                mapIntent1.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent1);
                break;
            case R.id.stat7:
                url="http://www.passportindia.gov.in/AppOnlineProject/online/downloadEFormStatic";
                Intent intent4=new Intent(Passport.this,Aadharwebview.class);
                intent4.putExtra("URL",url);
                startActivity(intent4);
                break;
            case R.id.stat8:
                url="https://www.tin-nsdl.com/services/pan/pan-aocode.html";
                Intent Intent6=new Intent(Passport.this,Aadharwebview.class);
                Intent6.putExtra("URL",url);
                startActivity(Intent6);
                break;
            case R.id.stat9:
                url="http://www.passportindia.gov.in/AppOnlineProject/online/apptAvailStatus";
                Intent Intent7=new Intent(Passport.this,Aadharwebview.class);
                Intent7.putExtra("URL",url);
                startActivity(Intent7);
                break;
            case R.id.stat10:
                url="http://www.passportindia.gov.in/AppOnlineProject/online/welComeMessage";
                Intent Intent8=new Intent(Passport.this,Aadharwebview.class);
                Intent8.putExtra("URL",url);
                startActivity(Intent8);
                break;
            case R.id.stat11:
                url="http://www.passportindia.gov.in/AppOnlineProject/fee/feeInput";
                Intent Intent9=new Intent(Passport.this,Aadharwebview.class);
                Intent9.putExtra("URL",url);
                startActivity(Intent9);
                break;

            case R.id.stat12:
                url="www.passportindia.gov.in/AppOnlineProject/online/LocatePoliceStation";
                Intent Intent10=new Intent(Passport.this,Aadharwebview.class);
                Intent10.putExtra("URL",url);
                startActivity(Intent10);
                break;

        }


    }


}
