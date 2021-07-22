package com.example.chat_me;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

public class Login_Activity extends AppCompatActivity {

    private Button login;
    private Button signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button)findViewById(R.id.login_button_login);
        signup = (Button)findViewById(R.id.login_button_signup);

        signup.setOnClickListener(new View.OnClickListener() {//signup 이벤트 생성
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login_Activity.this,Signup_Activity.class));//페이지 넘김 만들기
            }
        });
    }
}