package com.harjot.goverment;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;


public class Login extends AppCompatActivity implements View.OnClickListener{
    ProgressDialog pd;
    Button login;
    EditText email, password;
ImageView imageView;
    TextView up,Forget;
    Model user;
    StorageReference storageRef;
    SharedPreferences preferences;
    FirebaseAuth firebaseAuth;
String em,pa;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = new Model();
        storageRef = FirebaseStorage.getInstance().getReference().child("picture").child("image.jpg");
        storageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri)
            {

                // Image view meh uri set kar do..
                Picasso.with(Login.this).load(uri).into(imageView);
            }
        });
        imageView = (ImageView) findViewById(R.id.imageView);
        email = (EditText) findViewById(R.id.Email);
        login=(Button)findViewById(R.id.loginuser) ;
        firebaseAuth = FirebaseAuth.getInstance();

        password = (EditText) findViewById(R.id.Password);
        login.setOnClickListener(this);
        Forget=(TextView)findViewById(R.id.forget);
        Forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Login.this,Forgetpassword.class);
                startActivity(intent);
            }
        });

        preferences = getSharedPreferences("LoginDetails",MODE_PRIVATE);

        em=email.getText().toString().trim();
         pa=password.getText().toString().trim();

        }


    @Override
    public void onClick(View view) {
        em=email.getText().toString().trim();
        pa=password.getText().toString().trim();

        SharedPreferences.Editor editor=preferences.edit();
        editor.putString("keyem",em);
        editor.putString("keypass",pa);
        editor.commit();

login();



    }

    void login(){

        firebaseAuth.signInWithEmailAndPassword(em,pa).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(Login.this, "Ex "+task.getException(), Toast.LENGTH_SHORT).show();
                    Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(Login.this,Home.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(Login.this, "Ex "+task.getException(), Toast.LENGTH_SHORT).show();
                    Toast.makeText(Login.this, "Login Failure", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


}




