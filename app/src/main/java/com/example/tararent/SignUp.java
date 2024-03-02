package com.example.tararent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity {

    EditText email, pass;
    Button registerButton;

    TextView already;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        already = findViewById(R.id.already);
        registerButton = findViewById(R.id.signupbtn);
        email = findViewById(R.id.signupEmail);
        pass = findViewById(R.id.signupPassword);

        already.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open = new Intent(SignUp.this, Login.class);
                startActivity(open);
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String regEmail = email.getText().toString().trim();
                String regPass = pass.getText().toString().trim();
                registerUser(regEmail, regPass);

            }
        });

    }
    private void registerUser(String regEmail, String regPass) {
        FirebaseAuth.getInstance().createUserWithEmailAndPassword(regEmail, regPass).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Intent i = new Intent(SignUp.this, Login.class);
                    startActivity(i);
                } else {
                    Toast.makeText(SignUp.this, "sorry", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }




}