package com.example.harshit.myds;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mNotLogin,mforget_password;
    private Button mButton;
    private EditText mUserName;
    private EditText mPassword;
    public String tag = "SGSITS";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUserName = (EditText) findViewById(R.id.username);
        mPassword = (EditText) findViewById(R.id.password);
        mButton = (Button) findViewById(R.id.login);
        mforget_password=(TextView)findViewById(R.id.forget_password);
        mforget_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ForgetPassword.class));
            }
        });

        mNotLogin = (TextView) findViewById(R.id.signup);
        mNotLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RegistrationActivity.class));
            }
        });
        mButton.setOnClickListener(this);


    }
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.login:
                Log.i(tag,"LOGIN BUTTON CLICKED..");
                validateLoginScreen();
                break;
        }
    }
    void validateLoginScreen()
    {
        if((mUserName.getText().toString().isEmpty())||(!mUserName.getText().toString().matches("[a-zA-Z0-9@]+") ))
        {
            Log.i(tag,"please enter the username..");
            Toast.makeText(this, "please enter the username..", Toast.LENGTH_SHORT).show();
        }
        else if((mPassword.getText().toString().isEmpty())||(!mPassword.getText().toString().matches("[a-zA-Z0-9@]+")))
        {
            Log.i(tag,"please enter the password..");
            Toast.makeText(this, "please enter the password..", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Log.i(tag,"Login Successful...");
            Toast.makeText(this, "Login Successful,click again...", Toast.LENGTH_SHORT).show();
            mButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, HomeActivity.class));
                }
            });
        }



    }



}

