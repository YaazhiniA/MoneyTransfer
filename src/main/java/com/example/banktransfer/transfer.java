package com.example.banktransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class transfer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);
        Button btn = (Button) findViewById(R.id.button7);
        EditText et=(EditText)findViewById(R.id.editTextTextPersonName16);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et.getText().toString();
                Intent intent = new Intent(getApplicationContext(), upi.class);
                intent.putExtra("message", str);

                startActivity(intent);
    }

});}}