package com.harjot.goverment;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



public class Register extends AppCompatActivity {
    EditText Name1, Email1, Password1, Address1, Postalcode1, Pobileno1;
    Model model = new Model();
    Button Register;
    String Email;
    String Password;
    one e=new one();

    FirebaseAuth firebaseAuth;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Name1 = (EditText) findViewById(R.id.username);
        Email1 = (EditText) findViewById(R.id.useremail);
        Register = (Button) findViewById(R.id.submit);
        Password1 = (EditText) findViewById(R.id.userpaswword);
        Address1 = (EditText) findViewById(R.id.useraddress);
        Postalcode1 = (EditText) findViewById(R.id.userpostalcode);
        Pobileno1 = (EditText) findViewById(R.id.usernumber);
        firebaseAuth = FirebaseAuth.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference();
        final Spinner spinner = (Spinner) findViewById(R.id.userstate);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String Place = spinner.getSelectedItem().toString().trim();
                model.setState(Place);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = Name1.getText().toString().trim();
                e.setName(Name);
                 Email = Email1.getText().toString().trim();
                e.setEmail(Email);
                Password = Password1.getText().toString().trim();
               e.setPassword(Password);
                String Address = Address1.getText().toString().trim();
               e.setAddress(Address);
                String Post = Postalcode1.getText().toString().trim();
                e.setPincode(Post);
                String Mobile = Pobileno1.getText().toString().trim();
               e.setMobile(Mobile);
                Register();
            }
        });




    }

    void Register() {
   firebaseAuth.createUserWithEmailAndPassword(Email,Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
    @Override
    public void onComplete(@NonNull Task<AuthResult> task) {
        if (task.isSuccessful())
        {
            Toast.makeText(Register.this, "Registered Successful", Toast.LENGTH_SHORT).show();
            Registeruser(task.getResult().getUser());
            Toast.makeText(Register.this, "user "+task.getResult().getUser(), Toast.LENGTH_SHORT).show();


        }
        else{
            Toast.makeText(Register.this, "Ex "+task.getException(), Toast.LENGTH_SHORT).show();
            Toast.makeText(Register.this, "Please Regestration Again", Toast.LENGTH_SHORT).show();
            Toast.makeText(Register.this, "user "+task.getResult().getUser(), Toast.LENGTH_SHORT).show();

        }

    }
});
    }
   void Registeruser(FirebaseUser user){

       databaseReference.child("One").child(user.getUid()).setValue(e);
   }
}

