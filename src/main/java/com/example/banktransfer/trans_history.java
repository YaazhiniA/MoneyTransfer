package com.example.banktransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class trans_history extends AppCompatActivity {
EditText tv,tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trans_history);


        tv = (EditText) findViewById(R.id.editTextTextPersonName13);
        tv1=(EditText) findViewById(R.id.editTextTextPersonName14);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        tv.setText(str);
        Intent intent1=getIntent() ;
        String str1 = intent1.getStringExtra("message");
        tv1.setText(str);

    }
    public void first(View view){
        Intent intent1=new Intent(this,first.class);
        startActivity(intent1);
    }
}