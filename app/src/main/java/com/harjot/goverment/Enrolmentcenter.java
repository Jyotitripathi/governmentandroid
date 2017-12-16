package com.harjot.goverment;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Locale;

public class Enrolmentcenter extends AppCompatActivity implements View.OnClickListener,LocationListener{
    Spinner state, distric;
    String State, Distric;
    LocationManager locationManager;
    Geocoder geocoder;
    double latitude;
    double longitude;
    Button btx;
    TextView txt;
    ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enrolmentcenter);
        state = (Spinner) findViewById(R.id.state);
        distric = (Spinner) findViewById(R.id.distric);
        initViews();
        txt=(TextView)findViewById(R.id.LOC);
        pd=new ProgressDialog(Enrolmentcenter.this);
        pd.setTitle("Location");
        pd.setMessage("Please Wait Fetching Your Location..........");
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinnerstate, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        state.setAdapter(adapter);
        state.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                State = state.getSelectedItem().toString().trim();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.Distric, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        distric.setAdapter(adapter1);
        distric.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Distric = state.getSelectedItem().toString().trim();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button2) {
            if (ActivityCompat.checkSelfPermission(this,android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this,"Please Grant Permissions from Settings",Toast.LENGTH_LONG).show();
                pd.show();
            }else{

                locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 5, 10, this);
            }
        }
        Uri gmmIntentUri = Uri.parse("geo: 30.7978159,76.0306685?q=Aadhar Enrolment center");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);


    }
    void initViews() {
        btx=(Button)findViewById(R.id.button2);
        btx.setOnClickListener(this);
        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);

    }

    @Override
    public void onLocationChanged(Location location) {
        latitude = location.getLatitude();
         longitude = location.getLongitude();
        locationManager.removeUpdates(this);

        txt.setText("Location: "+latitude+" : "+longitude);
        try {
            Geocoder geocoder = new Geocoder(this);
            List<Address> adrsList = geocoder.getFromLocation(latitude, longitude, 2);
            if(adrsList!=null && adrsList.size()>0){
                Address address = adrsList.get(0);

                StringBuffer buffer = new StringBuffer();
                for(int i=0;i<address.getMaxAddressLineIndex();i++){
                    buffer.append(address.getAddressLine(i)+"\n");
                }


            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}
