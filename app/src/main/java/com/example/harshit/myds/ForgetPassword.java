package com.example.harshit.myds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class ForgetPassword extends AppCompatActivity {
    private EditText mPhone;
    private Button mSend_otp;
    public String tag="SGSITS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        mPhone=findViewById(R.id.phone);
        mSend_otp=findViewById(R.id.send_otp);
        mSend_otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mPhone.getText().toString().length()==10)
                {
                    Log.i(tag,"OTP sent");
                    Toast.makeText(getBaseContext(),"OTP sent",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Log.i(tag,"Invalid Phone no.");
                    Toast.makeText(getBaseContext(),"Invalid Phone no.",Toast.LENGTH_LONG).show();

                }
            }
        });
    }



}
