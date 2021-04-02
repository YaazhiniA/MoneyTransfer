package com.example.banktransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class first extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);




    }

    public void paybill(View view){
        Intent intent1=new Intent(this,paybill.class);
        startActivity(intent1);
    }
    public void transfer(View view){
        Intent intent2=new Intent(this,transfer.class);
        startActivity(intent2);
    }
    public void recharge(View view){

        Intent intent3=new Intent(this,recharge.class);
        startActivity(intent3);
    }
    public void balance(View view){

        Intent intent3=new Intent(this,balance.class);

        startActivity(intent3);
    }

}