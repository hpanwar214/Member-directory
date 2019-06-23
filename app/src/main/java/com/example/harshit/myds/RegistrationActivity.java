package com.example.harshit.myds;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.nfc.Tag;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;


public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener
{
    private EditText mName,mDob,mEmail,mPhone,minstitute,mbranch,myear,mcity;
    private Button mSignup;
    private DatePickerDialog.OnDateSetListener mDateSet;
    String tag2="Succesfully registered";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        mName=(EditText) findViewById(R.id.urname);
        mDob=(EditText) findViewById(R.id.dob);
        mEmail=(EditText) findViewById(R.id.email);
        mPhone=(EditText) findViewById(R.id.phone);
        mSignup=(Button) findViewById(R.id.signupBut);
        minstitute=findViewById(R.id.institute);
        mbranch=findViewById(R.id.branch);
        myear=findViewById(R.id.passOut);
        mcity=findViewById(R.id.city);
        mDob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal=Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int mon=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dlg=new DatePickerDialog(RegistrationActivity.this,android.R.style.Theme_DeviceDefault_Dialog,mDateSet,year,mon,day);
                dlg.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dlg.show();
            }
        });
        mDateSet=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month=month+1;
                Log.d(tag2,"onDateSet: dd/mm/yy "+month+"/"+dayOfMonth+"/"+year);
                String date=dayOfMonth +"/"+month+"/"+"/"+year;
                mDob.setText(date);
            }
        };
        mSignup.setOnClickListener(this);
    }
    public void onClick(View v2)
    {
        switch(v2.getId())
        {
            case R.id.signupBut:
                Log.i(tag2,"LOGIN BUTTON CLICKED..");
                validateRegisterScreen();
                break;
        }
    }


    void validateRegisterScreen()
    {
        if(mName.getText().toString().isEmpty())
        {
            Log.i(tag2,"please enter the username..");
            Toast.makeText(this, "please enter the username..", Toast.LENGTH_SHORT).show();
        }
        else if(mDob.getText().toString().isEmpty())
        {
            Log.i(tag2,"please enter the Date of Birth..");
            Toast.makeText(this, "please enter the Date of Birth..", Toast.LENGTH_SHORT).show();
        }
        else if(mPhone.getText().toString().isEmpty())
        {
            Log.i(tag2,"please enter the Mobile No..");
            Toast.makeText(this, "please enter the Mobile No..", Toast.LENGTH_SHORT).show();
        }
        else if(mEmail.getText().toString().isEmpty())
        {
            Log.i(tag2,"please enter the Email..");
            Toast.makeText(this, "please enter the Email..", Toast.LENGTH_SHORT).show();

        }
        else if(mcity.getText().toString().isEmpty()||mbranch.getText().toString().isEmpty()||minstitute.getText().toString().isEmpty()||myear.getText().toString().isEmpty())
        {
            Log.i(tag2,"Some fields are left empty... ");
            Toast.makeText(this, "Some fields are left empty...", Toast.LENGTH_SHORT).show();

        }
        else
        {
            Log.i(tag2,"Registration Succesfull");
            Toast.makeText(this, "Registration Succesfull", Toast.LENGTH_SHORT).show();

        }
    }

}
