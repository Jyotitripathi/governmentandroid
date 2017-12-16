package com.harjot.goverment;

import android.app.ProgressDialog;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class Forgetpassword extends AppCompatActivity implements View.OnClickListener {
    EditText email;
    String em;
    ProgressDialog pd;
    FirebaseAuth firebaseAuth;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassword2);
        firebaseAuth = FirebaseAuth.getInstance();
        pd = new ProgressDialog(this);
        email = (EditText) findViewById(R.id.Email);
        btn = (Button) findViewById(R.id.b);

        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (!email.getText().toString().trim().isEmpty()) {
            em = email.getText().toString().trim();
            pd.show();
            firebaseAuth.sendPasswordResetEmail(em).addOnCompleteListener(new OnCompleteListener<Void>() {

                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    pd.dismiss();
                    if (task.isSuccessful()) {
                        Toast.makeText(Forgetpassword.this, "We Have sent you instructions to reset your password !", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Forgetpassword.this, "Failed to send password reset email !", Toast.LENGTH_SHORT).show();
                    }
                }
            });

        } else {
            Toast.makeText(this, "Enter Your Registered Email Id", Toast.LENGTH_SHORT).show();
        }

    }
}
