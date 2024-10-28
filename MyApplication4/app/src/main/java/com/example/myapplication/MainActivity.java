package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText login;
    EditText password;
    Button button;
    TextView twoj_login;
    TextView Twoje_haslo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button);
        login = findViewById(R.id.Login);
        password = findViewById(R.id.Password);
        button = findViewById(R.id.button);
        twoj_login = findViewById(R.id.twoj_login);
        Twoje_haslo = findViewById(R.id.Twoje_haslo);
        button.setOnClickListener(nazwa->{
            twoj_login.setText(login.getText());
            Twoje_haslo.setText(password.getText());

        });

        password.getText();


    }
}