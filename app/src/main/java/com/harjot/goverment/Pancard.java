package com.harjot.goverment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.model.Circle;

import at.markushi.ui.CircleButton;

public class Pancard extends AppCompatActivity implements View.OnClickListener{
CircleButton one,two,three,four,five,six,seven,eight,nine,ten,elven,twelev;
    String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pancard);
        one=(CircleButton)findViewById(R.id.pan1);
        one.setOnClickListener(this);









        two=(CircleButton)findViewById(R.id.pan2);
        two.setOnClickListener(this);
        three=(CircleButton)findViewById(R.id.pan3);
        three.setOnClickListener(this);
        four=(CircleButton)findViewById(R.id.pan5);
        four.setOnClickListener(this);
        five=(CircleButton)findViewById(R.id.pan6);
        five.setOnClickListener(this);
        six=(CircleButton)findViewById(R.id.pan7);
        six.setOnClickListener(this);
        seven=(CircleButton)findViewById(R.id.pan8);
        seven.setOnClickListener(this);
        eight=(CircleButton)findViewById(R.id.pan9);
        eight.setOnClickListener(this);
        nine=(CircleButton)findViewById(R.id.pan10);
        nine.setOnClickListener(this);
        ten=(CircleButton)findViewById(R.id.pan11);
        ten.setOnClickListener(this);
        elven=(CircleButton)findViewById(R.id.pan12);
        elven.setOnClickListener(this);
        twelev=(CircleButton)findViewById(R.id.pan13);
        twelev.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch (id) {
            case R.id.pan1:
                url="https://www.onlineservices.nsdl.com/paam/endUserRegisterContact.html";
                Intent intent=new Intent(Pancard.this,Aadharwebview.class);
                intent.putExtra("URL",url);
                startActivity(intent);
                break;
            case R.id.pan2:
                url="https://tin.tin.nsdl.com/pantan/StatusTrack.html";
                Intent intent1=new Intent(Pancard.this,Aadharwebview.class);
                intent1.putExtra("URL",url);
                startActivity(intent1);
                break;
            case R.id.pan3:
                url="https://www.onlineservices.nsdl.com/paam/endUserRegisterContact.html";
                Intent intent2=new Intent(Pancard.this,Aadharwebview.class);
                intent2.putExtra("URL",url);
                startActivity(intent2);
                break;
            case R.id.pan5:
                url="https://onlineservices.tin.egov-nsdl.com/etaxnew/tdsnontds.jsp";
                Intent intent3=new Intent(Pancard.this,Aadharwebview.class);
                intent3.putExtra("URL",url);
                startActivity(intent3);
                break;
            case R.id.pan6:
                url="https://www.onlineservices.nsdl.com/paam/endUserRegisterContact.html";
                Intent intent4=new Intent(Pancard.this,Aadharwebview.class);
                intent4.putExtra("URL",url);
                startActivity(intent4);
                break;
            case R.id.pan7:
                url="https://www.tin-nsdl.com/services/pan/pan-introduction.html#how";
                Intent Intent5=new Intent(Pancard.this,Aadharwebview.class);
                Intent5.putExtra("URL",url);
                startActivity(Intent5);
                break;
            case R.id.pan8:
                url="https://www.tin-nsdl.com/services/pan/pan-aocode.html";
                Intent Intent6=new Intent(Pancard.this,Aadharwebview.class);
                Intent6.putExtra("URL",url);
                startActivity(Intent6);
                break;
            case R.id.pan9:
                url="https://www.incometaxindiaefiling.gov.in/e-Filing/Services/LinkAadhaarHome.html";
                Intent Intent7=new Intent(Pancard.this,Aadharwebview.class);
                Intent7.putExtra("URL",url);
                startActivity(Intent7);
                break;
            case R.id.pan10:
                url="https://www.tin-nsdl.com/services/status-tax-refunds/refundstatuslogin.html";
                Intent Intent8=new Intent(Pancard.this,Aadharwebview.class);
                Intent8.putExtra("URL",url);
                startActivity(Intent8);
                break;
            case R.id.pan11:
                url="https://www.tin-nsdl.com/customerfeedback.html";
                Intent Intent9=new Intent(Pancard.this,Aadharwebview.class);
                Intent9.putExtra("URL",url);
                startActivity(Intent9);
                break;
            case R.id.pan12:
                url="https://www.tin-nsdl.com/bank-center.html";
                Intent Intent10=new Intent(Pancard.this,Aadharwebview.class);
                Intent10.putExtra("URL",url);
                startActivity(Intent10);
                break;
            case R.id.pan13:
                url="https://www.tin-nsdl.com/faqs/refund/faq-refund.html";
                Intent Intent11=new Intent(Pancard.this,Aadharwebview.class);
                Intent11.putExtra("URL",url);
                startActivity(Intent11);
                break;
        }


        }
    }

