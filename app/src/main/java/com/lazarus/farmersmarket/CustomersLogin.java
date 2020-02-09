package com.lazarus.farmersmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CustomersLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customers_login);
    }

    public void cOnClickForgotPwd(View view) {
        Intent myintent = new Intent(getBaseContext(), ResetPassword.class);
        startActivity(myintent);

    }

    public void  cOnClickLogin(View view) {
        Intent myintent = new Intent(getBaseContext(), CustomerHome.class);
        startActivity(myintent);

    }


}
