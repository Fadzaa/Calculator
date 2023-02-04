package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText emailText;
    EditText passwordText;
    Button loginButton;

    public static final String SHARED_PREFS = "shared_prefs";

    public static final String EMAIL_KEY = "email_key";

    public static final String PASSWORD_KEY = "password_key";

    SharedPreferences sharedPreferences;
    String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginBtn);
        emailText = findViewById(R.id.emailText);
        passwordText = findViewById(R.id.passwordText);

        sharedPreferences = getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
        email = sharedPreferences.getString(EMAIL_KEY, null);
        password = sharedPreferences.getString(PASSWORD_KEY, null);


        loginButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {


        String email = emailText.getText().toString();
        String password = passwordText.getText().toString();


        if(email.equalsIgnoreCase("admin") & password.equalsIgnoreCase("admin")) {
            SharedPreferences.Editor editor = sharedPreferences.edit();

            // below two lines will put values for
            // email and password in shared preferences.
            editor.putString(EMAIL_KEY, email); 
            editor.putString(PASSWORD_KEY, password);

            // to save our data with key and value.
            editor.apply();
            Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, Kalkulator.class));
            finish();
        }else {
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        if (email != null && password != null) {
            Intent i = new Intent(MainActivity.this, Kalkulator.class);
            startActivity(i);
        }
    }
}