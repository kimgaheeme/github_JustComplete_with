package com.example.chat_me;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

public class Login_Activity extends AppCompatActivity {

    private Button login;
    private Button signin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button)findViewById(R.id.login_button_login);
        signin = (Button)findViewById(R.id.login_button_signin);

    }
}