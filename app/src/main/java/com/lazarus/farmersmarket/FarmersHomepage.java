package com.lazarus.farmersmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FarmersHomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmers_homepage);
    }

    public void fOnClickSellItems(View view) {
        Intent myintent= new Intent(getBaseContext(),SellItems.class);
        startActivity(myintent);
    }

}
