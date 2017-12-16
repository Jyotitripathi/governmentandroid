package com.harjot.goverment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity implements View.OnClickListener {
Button signup,signin;
SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        signup=(Button)findViewById(R.id.Login);
        signin=(Button)findViewById(R.id.register);
        signup.setOnClickListener(this);
        signin.setOnClickListener(this);

        preferences =getSharedPreferences("LoginDetails",MODE_PRIVATE);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Login:
                String Email=preferences.getString("keyem","");
                String Password=preferences.getString("keypass","");
                Intent intent=new Intent(Welcome.this,Login.class);
                startActivity(intent);

break;
            case R.id.register:
                Intent intent1=new Intent(Welcome.this,Register.class);
                startActivity(intent1);
                break;

        }
    }
}
