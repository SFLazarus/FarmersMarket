package com.lazarus.farmersmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cOnClickBuy(View view) {
        Intent myintent= new Intent(getBaseContext(),CustomersLogin.class);
        startActivity(myintent);
    }

    public void fOnClickBuy(View view) {
        Intent myintent= new Intent(getBaseContext(),FarmersLogin.class);
        startActivity(myintent);
    }
}
