package com.lazarus.farmersmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FarmersLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmers_login);
    }

    public void fOnClickLogin(View view) {
        Intent myintent= new Intent(getBaseContext(),FarmersHomepage.class);
        startActivity(myintent);
    }

    public void fOnClickForgotPwd(View view) {
        Intent myintent= new Intent(getBaseContext(),ResetPassword.class);
        startActivity(myintent);
    }
}
