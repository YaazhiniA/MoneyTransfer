package com.example.banktransfer;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText passq;
    //Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.buttonpay);

        passq = (EditText) findViewById(R.id.editTextTextPassword);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                successful();
            }
        });

    }
    public void successful(){
        int password = Integer.parseInt(passq.getText().toString());
        if (password == 3434) {
            Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(this,first.class);
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(), "Wrong Password", Toast.LENGTH_SHORT).show();
        }




    }
}