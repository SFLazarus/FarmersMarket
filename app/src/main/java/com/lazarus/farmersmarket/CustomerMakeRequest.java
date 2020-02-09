package com.lazarus.farmersmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CustomerMakeRequest extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_make_request);
        btn= findViewById(R.id.submitmkreq);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getBaseContext(), "Request submitted. Continue shopping", Toast.LENGTH_LONG).show();
                    Intent myintent = new Intent(getBaseContext(), CustomerHome.class);
                    startActivity(myintent);
                }
            });

        }
}
