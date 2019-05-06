package com.example.abdo.globalprogramming;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUpActivity extends AppCompatActivity {
    EditText email;
    EditText password1;
    EditText password2;
    Button btn1;
    private FirebaseAuth mAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        email = findViewById(R.id.SignUpEmail);
        password1 = findViewById(R.id.SignUpPassword);
        password2 = findViewById(R.id.SignUpRepeatPassword);
        btn1 = findViewById(R.id.SignUpBtn1);
        mAuth = FirebaseAuth.getInstance();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (password1.getText().toString().equals(password2.getText().toString()))
                {
                    SignUp(email.getText().toString(),password1.getText().toString());
                }
                else
                {
                    password2.setText(" ");
                    Toast.makeText(SignUpActivity.this, "Enter Your password again correctly", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
    void SignUp(String email,String password)
    {
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            startActivity(new Intent(SignUpActivity.this,LogInActivity.class));
                            finish();

                        } else {
                            Toast.makeText(SignUpActivity.this, task.getException().getMessage().toString(),
                                    Toast.LENGTH_LONG).show();

                        }
                    }
                });
    }
}
