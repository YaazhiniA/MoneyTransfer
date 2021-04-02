package com.example.banktransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.content.Intent;
public class recharge extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recharge);
        Button btn = (Button) findViewById(R.id.button5);
        EditText et=(EditText)findViewById(R.id.editTextTextPersonName);
        EditText et1=(EditText)findViewById(R.id.editTextTextPersonName2);

       btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                btn.isClickable();
                if (btn.isPressed()) {
                    Toast.makeText(getBaseContext(), "Payment Successful!", Toast.LENGTH_SHORT).show();
                   /* String str= et.getText().toString();
                    String str1= et1.getText().toString();
                    Intent intent = new Intent(getApplicationContext(), trans_history.class);
                    intent.putExtra("message", str);
                    intent.putExtra("message", str1);

                    startActivity(intent);*/
                }

            }


        });
    }
}