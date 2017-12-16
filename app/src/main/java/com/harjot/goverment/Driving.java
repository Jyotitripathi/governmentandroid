package com.harjot.goverment;

import android.content.Intent;
import android.icu.text.BreakIterator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.model.Circle;

import at.markushi.ui.CircleButton;

public class Driving extends AppCompatActivity implements View.OnClickListener{
CircleButton d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14;
    String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driving);

        d1=(CircleButton)findViewById(R.id.dl1);
        d1.setOnClickListener(this);
        d2=(CircleButton)findViewById(R.id.dl2);
d2.setOnClickListener(this);
        d3=(CircleButton)findViewById(R.id.dl3);
        d3.setOnClickListener(this);
        d4=(CircleButton)findViewById(R.id.dl4);
        d4.setOnClickListener(this);
        d5=(CircleButton)findViewById(R.id.dl5);
        d5.setOnClickListener(this);
        d6=(CircleButton)findViewById(R.id.dlsix);
        d6.setOnClickListener(this);


        d7=(CircleButton)findViewById(R.id.dlseven);
        d7.setOnClickListener(this);
        d8=(CircleButton)findViewById(R.id.dleight);
       d8.setOnClickListener(this);
        d9=(CircleButton)findViewById(R.id.dlnine);
        d9.setOnClickListener(this);
        d10=(CircleButton)findViewById(R.id.dlten);
        d10.setOnClickListener(this);
        d11=(CircleButton)findViewById(R.id.dleleven);
        d11.setOnClickListener(this);
        d12=(CircleButton)findViewById(R.id.dltwelve);
        d12.setOnClickListener(this);
        d13=(CircleButton)findViewById(R.id.dlthirteen);
        d13.setOnClickListener(this);
        d14=(CircleButton)findViewById(R.id.dlfourteen);
        d14.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch (id){
            case R.id.dl1:
                url="https://parivahan.gov.in/sarathiservice10/newLL_displayNewLL.do";
                Intent intent=new Intent(Driving.this,Aadharwebview.class);
                intent.putExtra("URL",url);
                startActivity(intent);
                break;
            case R.id.dl2:
                url="https://parivahan.gov.in/sarathiservice10/biometrics.do";
                Intent intent1=new Intent(Driving.this,Aadharwebview.class);
                intent1.putExtra("URL",url);
                startActivity(intent1);
                break;
            case R.id.dl3:
                url="https://parivahan.gov.in/sarathiservice10/viewDocuments.do";
                Intent intent2=new Intent(Driving.this,Aadharwebview.class);
                intent2.putExtra("URL",url);
                startActivity(intent2);
                break;
            case R.id.dl4:
                url="https://parivahan.gov.in/parivahan/";
                Intent intent3=new Intent(Driving.this,Aadharwebview.class);
                intent3.putExtra("URL",url);
                startActivity(intent3);
                break;
            case R.id.five:
                url="https://parivahan.gov.in/sarathiservice12/newDL_display.do";
                Intent intent4=new Intent(Driving.this,Aadharwebview.class);
                intent4.putExtra("URL",url);
                startActivity(intent4);
                break;
            case R.id.dlsix:
                url="https://parivahan.gov.in/sarathiservice12/NewCLHome.do";
                Intent intent5=new Intent(Driving.this,Aadharwebview.class);
                intent5.putExtra("URL",url);
                startActivity(intent5);
                break;
            case R.id.dlseven:
                url="https://parivahan.gov.in/sarathiservice12/applViewStatus.do";
                Intent intent6=new Intent(Driving.this,Aadharwebview.class);
                intent6.putExtra("URL",url);
                startActivity(intent6);
                break;
            case R.id.dleight:
                url="https://parivahan.gov.in/rcdlstatus/?pur_cd=102";
                Intent intent11=new Intent(Driving.this,Aadharwebview.class);
                intent11.putExtra("URL",url);
                startActivity(intent11);
            case R.id.dlnine:
                url="https://parivahan.gov.in/rcdlstatus/?pur_cd=101";
                Intent intent12=new Intent(Driving.this,Aadharwebview.class);
                intent12.putExtra("URL",url);
                startActivity(intent12);

            case R.id.dlten:
                url="https://parivahan.gov.in/sarathiservice12/confirmOrAdd_enterApplDetails.do?linkValue=addCovs";
                Intent intent7=new Intent(Driving.this,Aadharwebview.class);
                intent7.putExtra("URL",url);
                startActivity(intent7);
                break;
            case R.id.dleleven:
                url="https://parivahan.gov.in/sarathiservice12/confirmOrAdd_enterApplDetails.do?linkValue=addTransactions";
                Intent intent8=new Intent(Driving.this,Aadharwebview.class);
                intent8.putExtra("URL",url);
                startActivity(intent8);
                break;
            case R.id.dltwelve:
                url="https://parivahan.gov.in/sarathiservice12/lleditrequest.do";
                Intent intent9=new Intent(Driving.this,Aadharwebview.class);
                intent9.putExtra("URL",url);
                startActivity(intent9);
                break;
            case R.id.dlthirteen:
                url="https://parivahan.gov.in/sarathiservice12/printform.do";
                Intent intent10=new Intent(Driving.this,Aadharwebview.class);
                intent10.putExtra("URL",url);
                startActivity(intent10);
                break;
            case R.id.dlfourteen:
                url="https://parivahan.gov.in/sarathiservice12/authenticationaction.do";
                Intent intentz=new Intent(Driving.this,Aadharwebview.class);
                intentz.putExtra("URL",url);
                startActivity(intentz);
                break;
        }

    }
}
