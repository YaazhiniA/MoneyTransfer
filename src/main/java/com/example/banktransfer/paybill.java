package com.example.banktransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class paybill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paybill);
        Button btn = (Button) findViewById(R.id.button6);
        EditText et=(EditText)findViewById(R.id.editTextTextPersonName3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                btn.isClickable();
                if (btn.isPressed()) {
                    Toast.makeText(getBaseContext(), "Transaction Successful!", Toast.LENGTH_SHORT).show();
                    /*String str= et.getText().toString();
                    Intent intent1 = new Intent(getApplicationContext(), trans_history.class);
                    intent1.putExtra("message", str);

                    startActivity(intent1);*/
                }

            }


        });
    }
}