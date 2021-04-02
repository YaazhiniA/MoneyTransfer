package com.example.banktransfer;
//import Global;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class balance extends AppCompatActivity {
    EditText tv2;
   // EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance);
       // EditText e1=(EditText)findViewById(R.id.editTextTextPersonName11);
        tv2 = (EditText)findViewById(R.id.editTextTextPersonName11);
        tv2.setText("5000");
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        tv2.setText(str);
       /* String amt=tv2.getText().toString();
        Global.stringToPass = amt;
        startActivity(new Intent(balance.this, amount.class));*/
    }
    public void first(View view){
        Intent intent1=new Intent(this,first.class);
        startActivity(intent1);
    }
}