package com.example.ashirafzal.loginappexam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText user,pass;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = findViewById(R.id.etName);
        pass = findViewById(R.id.etPassword);
        Login = findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(user.getText().toString(),pass.getText().toString());
            }
        });

    }

    public void validate(String user,String pass){

        if(user.equals("user") && pass.equals("pass")){
            Intent dashboard = new Intent(LoginActivity.this,DashboardActivity.class);
            startActivity(dashboard);
            finish();
        }

    }


}