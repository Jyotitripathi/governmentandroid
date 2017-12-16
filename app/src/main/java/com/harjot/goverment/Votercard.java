package com.harjot.goverment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import at.markushi.ui.CircleButton;

public class Votercard extends AppCompatActivity implements View.OnClickListener{
CircleButton on,tw,thre,fou,fife,si,seve,eigh,nin;
String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_votercard);
on=(CircleButton)findViewById(R.id.one);
        on.setOnClickListener(this);
        tw=(CircleButton)findViewById(R.id.two);
        thre=(CircleButton)findViewById(R.id.three);
        fou=(CircleButton)findViewById(R.id.four);
        fife=(CircleButton)findViewById(R.id.five);
        si=(CircleButton)findViewById(R.id.six);
        seve=(CircleButton)findViewById(R.id.seven);
        eigh=(CircleButton)findViewById(R.id.eight);
        nin=(CircleButton)findViewById(R.id.nine);
        tw.setOnClickListener(this);
        thre.setOnClickListener(this);
        fou.setOnClickListener(this);
        fife.setOnClickListener(this);
        si.setOnClickListener(this);
        seve.setOnClickListener(this);
        eigh.setOnClickListener(this);
        nin.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch (id) {
            case R.id.one:
                url="http://www.nvsp.in/Forms/Forms/form6";
                Intent intent=new Intent(Votercard.this,Aadharwebview.class);
                intent.putExtra("URL",url);
                startActivity(intent);
                break;

            case R.id.two:
                url="www.nvsp.in/Forms/Forms/form8";
                Intent intent1=new Intent(Votercard.this,Aadharwebview.class);
                intent1.putExtra("URL",url);
                startActivity(intent1);
                break;

            case R.id.three:
            url="http://www.nvsp.in/Forms/Forms/form6A";
            Intent intent2=new Intent(Votercard.this,Aadharwebview.class);
            intent2.putExtra("URL",url);
            startActivity(intent2);
            break;
            case R.id.four:
                url="http://electoralsearch.in/" ;
                Intent intent3=new Intent(Votercard.this,Aadharwebview.class);
                intent3.putExtra("URL",url);
                startActivity(intent3);
                break;
            case R.id.five:
                url="http://www.nvsp.in/Forms/Forms/trackstatus";
                Intent intent4=new Intent(Votercard.this,Aadharwebview.class);
                intent4.putExtra("URL",url);
                startActivity(intent4);
                break;
            case R.id.six:
                url="http://www.nvsp.in/Forms/Forms/form8A";
                Intent intent5=new Intent(Votercard.this,Aadharwebview.class);
                intent5.putExtra("URL",url);
                startActivity(intent5);
                break;
            case R.id.seven:
                url="http://eci.nic.in/eci_main1/Links.aspx";
                Intent intent6=new Intent(Votercard.this,Aadharwebview.class);
                intent6.putExtra("URL",url);
                startActivity(intent6);
                break;
            case R.id.eight:
                url="http://eci.nic.in/eci_main1/tm.aspx";
                Intent intent7=new Intent(Votercard.this,Aadharwebview.class);
                intent7.putExtra("URL",url);
                startActivity(intent7);
                break;
            case R.id.nine:
                url="http://eci-citizenservices.nic.in/";
                Intent intent8=new Intent(Votercard.this,Aadharwebview.class);
                intent8.putExtra("URL",url);
                startActivity(intent8);
                break;


        }

        }

    }

