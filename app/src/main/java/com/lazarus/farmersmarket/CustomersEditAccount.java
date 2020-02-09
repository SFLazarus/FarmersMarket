package com.lazarus.farmersmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CustomersEditAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customers_edit_account);
    }

    public void fOnClickSave(View view) {
        Toast.makeText(getBaseContext(),"Changes saved. Login again",Toast.LENGTH_LONG).show();
        Intent myintent= new Intent(getBaseContext(),CustomerHome.class);
        startActivity(myintent);
    }
}
