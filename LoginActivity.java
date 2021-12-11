package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView userName =(TextView) findViewById(R.id.userName);
        TextView password =(TextView) findViewById(R.id.password);

        Button loginBtn = (Button) findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userName.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //correct
                    Toast.makeText(LoginActivity.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                }else
                    //incorrect
                    Toast.makeText(LoginActivity.this,"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show();
            }
        });

    }
}