package com.harjot.goverment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

import com.google.android.gms.maps.model.Circle;

import at.markushi.ui.CircleButton;

public class Residentcertiicate extends AppCompatActivity implements View.OnClickListener {
CircleButton One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten,Eleven,Tweleve,Thirteen,Fourteen,Fifteen;
    String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_residentcertiicate);
        One=(CircleButton)findViewById(R.id.one);
        One.setOnClickListener(this);
        Two=(CircleButton)findViewById(R.id.two);
        Two.setOnClickListener(this);
        Three=(CircleButton)findViewById(R.id.three);
        Three.setOnClickListener(this);
        Four=(CircleButton)findViewById(R.id.four);
        Four.setOnClickListener(this);
        Five=(CircleButton)findViewById(R.id.five);
        Five.setOnClickListener(this);
        Six=(CircleButton)findViewById(R.id.six);
        Six.setOnClickListener(this);
        Seven=(CircleButton)findViewById(R.id.seven);
         Seven.setOnClickListener(this);
        Eight=(CircleButton)findViewById(R.id.eight);
        Eight.setOnClickListener(this);
        Nine=(CircleButton)findViewById(R.id.nine);
        Nine.setOnClickListener(this);
        Ten=(CircleButton)findViewById(R.id.ten);
        Ten.setOnClickListener(this);
        Eleven=(CircleButton)findViewById(R.id.eleven);
        Eleven.setOnClickListener(this);
        Tweleve=(CircleButton)findViewById(R.id.tweleve);
        Tweleve.setOnClickListener(this);
        Thirteen=(CircleButton)findViewById(R.id.thirteen);
        Thirteen.setOnClickListener(this);
        Fourteen=(CircleButton)findViewById(R.id.fourteen);
        Fourteen.setOnClickListener(this);
        Fifteen=(CircleButton)findViewById(R.id.fifteen);
        Fifteen.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch (id){
            case R.id.one:
                url="http://punjab.gov.in/residence-certificate";
                Intent intent=new Intent(Residentcertiicate.this,Aadharwebview.class);
                intent.putExtra("URL",url);
                startActivity(intent);
                break;
            case R.id.two:
                url="http://punjab.gov.in/how-to-apply";
                Intent intent1=new Intent(Residentcertiicate.this,Aadharwebview.class);
                intent1.putExtra("URL",url);
                startActivity(intent1);
                break;
            case R.id.three:
                url="http://punjab.gov.in/documents/10191/868401/49+Residence+Certificate.pdf/d2a28d89-414b-408b-86ed-5794f7840397";
                Intent intent3=new Intent(Residentcertiicate.this,Aadharwebview.class);
                intent3.putExtra("URL",url);
                startActivity(intent3);
                break;
            case R.id.four:
                url="http://punjab.gov.in/documents/10191/1035707/Residence+Certificate.pdf/7a3cfcac-3902-4074-8ed5-35dd45dee130";
                Intent intent4=new Intent(Residentcertiicate.this,Aadharwebview.class);
                intent4.putExtra("URL",url);
                startActivity(intent4);
                break;
            case R.id.five:
                url="http://punjab.gov.in/know-your-processing-office";
                Intent intent5=new Intent(Residentcertiicate.this,Aadharwebview.class);
                intent5.putExtra("URL",url);
                startActivity(intent5);
                break;
            case R.id.six:
                url="http://punjab.gov.in/web/guest/services";
                Intent intent6=new Intent(Residentcertiicate.this,Aadharwebview.class);
                intent6.putExtra("URL",url);
                startActivity(intent6);
                break;
            case R.id.seven:
                url="http://punjab.gov.in/caste-certificate-sc";
                Intent intent7=new Intent(Residentcertiicate.this,Aadharwebview.class);
                intent7.putExtra("URL",url);
                startActivity(intent7);
                break;
            case R.id.eight:
                url="http://punjab.gov.in/caste-certificate-obc";
                Intent intent8=new Intent(Residentcertiicate.this,Aadharwebview.class);
                intent8.putExtra("URL",url);
                startActivity(intent8);
                break;
            case R.id.nine:
                url="http://punjab.gov.in/post-matric-scholarship-to-sc";
                Intent intent9=new Intent(Residentcertiicate.this,Aadharwebview.class);
                intent9.putExtra("URL",url);
                startActivity(intent9);
                break;

            case R.id.ten:
                url="http://punjab.gov.in/post-matric-scholarship-to-sc";
                Intent intent10=new Intent(Residentcertiicate.this,Aadharwebview.class);
                intent10.putExtra("URL",url);
                startActivity(intent10);
                break;
            case R.id.eleven:
                url="http://punjab.gov.in/aashirwad-scheme";
                Intent intent11=new Intent(Residentcertiicate.this,Aadharwebview.class);
                intent11.putExtra("URL",url);
                startActivity(intent11);
                break;
            case R.id.tweleve:
                url="http://punjab.gov.in/term-loan-to-obc";
                Intent intent12=new Intent(Residentcertiicate.this,Aadharwebview.class);
                intent12.putExtra("URL",url);
                startActivity(intent12);
                break;
            case R.id.thirteen:
                url="http://punjab.gov.in/issuance-of-death-certificate-rural-areas-";
                Intent intent13=new Intent(Residentcertiicate.this,Aadharwebview.class);
                intent13.putExtra("URL",url);
                startActivity(intent13);
                break;
            case R.id.fourteen:
                url="http://punjab.gov.in/issuance-of-birth-certificate-rural-areas-";
                Intent intent14=new Intent(Residentcertiicate.this,Aadharwebview.class);
                intent14.putExtra("URL",url);
                startActivity(intent14);
                break;
            case R.id.fifteen:
                url="http://punjab.gov.in/correction-in-birth-certificate";
                Intent intent15=new Intent(Residentcertiicate.this,Aadharwebview.class);
                intent15.putExtra("URL",url);
                startActivity(intent15);
                break;

        }
    }
}
