package com.harjot.goverment;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.maps.model.Circle;

import at.markushi.ui.CircleButton;

public class Aadharhome extends AppCompatActivity implements View.OnClickListener {
CircleButton first,secound, third ,fourth,fifith,sixith,seventh,eigh,nin,tenth,eleventh,twelveth,thirteenth;
    WebView webView;
String url;
    double latitude;
    Uri gmmIntentUri,gmmIntentUri1;
    Intent mapIntent,mapIntent1;
    double longitude;
    LocationManager locationManager;
    ProgressBar pd;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aadharhome);
        first=(CircleButton)findViewById(R.id.status);
        secound=(CircleButton)findViewById(R.id.database);
        third=(CircleButton)findViewById(R.id.three);
        first.setOnClickListener(this);
        third.setOnClickListener(this);
        secound.setOnClickListener(this);
        fourth=(CircleButton)findViewById(R.id.four);
        fourth.setOnClickListener(this);
        fifith=(CircleButton)findViewById(R.id.five);
        fifith.setOnClickListener(this);
        sixith=(CircleButton)findViewById(R.id.six);
        sixith.setOnClickListener(this);
        seventh=(CircleButton)findViewById(R.id.seven);
        seventh.setOnClickListener(this);
        eigh=(CircleButton)findViewById(R.id.eight);
        eigh.setOnClickListener(this);
        nin=(CircleButton)findViewById(R.id.nine);
        nin.setOnClickListener(this);
        tenth=(CircleButton)findViewById(R.id.ten);
        tenth.setOnClickListener(this);
        eleventh=(CircleButton)findViewById(R.id.eleven);
        eleventh.setOnClickListener(this);
        twelveth=(CircleButton)findViewById(R.id.bank);
        twelveth.setOnClickListener(this);
        thirteenth=(CircleButton)findViewById(R.id.vac);
        thirteenth.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch (id){
            case R.id.status:
                 url="https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en";
                Intent intent=new Intent(Aadharhome.this,Aadharwebview.class);
                intent.putExtra("URL",url);
                startActivity(intent);
                break;

            case R.id.database:
                 gmmIntentUri = Uri.parse("geo:0,0?q=Aadhar Enrolment Center");
                mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

                break;
            case R.id.three:
                url="https://resident.uidai.gov.in/check-aadhaar-status";
                Intent intent2=new Intent(Aadharhome.this,Aadharwebview.class);
                intent2.putExtra("URL",url);
                startActivity(intent2);
                break;


            case R.id.four:
                gmmIntentUri1 = Uri.parse("geo:0,0?q=Aadhar enrolment center");
                mapIntent1 = new Intent(Intent.ACTION_VIEW, gmmIntentUri1);
                mapIntent1.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent1);
                break;
            case R.id.five:
                url="https://resident.uidai.gov.in/web/resident/get-aadhaar-no";
                Intent intent3=new Intent(Aadharhome.this,Aadharwebview.class);
                intent3.putExtra("URL",url);
                startActivity(intent3);
                break;
            case R.id.six:
                url="https://eaadhaar.uidai.gov.in/#/";
                Intent intent4=new Intent(Aadharhome.this,Aadharwebview.class);
                intent4.putExtra("URL",url);
                startActivity(intent4);
                break;
            case R.id.seven:
                url="https://resident.uidai.gov.in/find-uid-eid";
                Intent intent5=new Intent(Aadharhome.this,Aadharwebview.class);
                intent5.putExtra("URL",url);
                startActivity(intent5);
                    break;
            case R.id.eight:
                url="https://ssup.uidai.gov.in/web/guest/ssup-home#/popup";
                Intent intent6=new Intent(Aadharhome.this,Aadharwebview.class);
                intent6.putExtra("URL",url);
                startActivity(intent6);
                break;
            case R.id.nine:
                url="https://resident.uidai.gov.in/verify-email-mobile";
                Intent intent7=new Intent(Aadharhome.this,Aadharwebview.class);
                intent7.putExtra("URL",url);
                startActivity(intent7);
                break;
            case R.id.ten:
                url="https://resident.uidai.gov.in/aadhaarverification";
                Intent intent8=new Intent(Aadharhome.this,Aadharwebview.class);
                intent8.putExtra("URL",url);
                startActivity(intent8);
                break;
            case R.id.eleven:
                url="https://resident.uidai.gov.in/verify-email-mobile";
                Intent intent9=new Intent(Aadharhome.this,Aadharwebview.class);
                intent9.putExtra("URL",url);
                startActivity(intent9);
                break;
            case R.id.bank:
                url="https://resident.uidai.gov.in/bank-mapper";
                Intent intent10=new Intent(Aadharhome.this,Aadharwebview.class);
                intent10.putExtra("URL",url);
                startActivity(intent10);
                break;
            case R.id.vac:
                url="https://uidai.gov.in/about-uidai/current-vacancies.html";
                Intent in=new Intent(Aadharhome.this,Aadharwebview.class);
                in.putExtra("URL",url);
                startActivity(in);
                break;



        }
    }

}

