package com.lazarus.farmersmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
    }

    public void resetPassword(View view) {
        Toast.makeText(getBaseContext(),"Reset link is mailed. Login again",Toast.LENGTH_LONG).show();
        Intent myintent= new Intent(getBaseContext(),MainActivity.class);
        startActivity(myintent);
    }

}
