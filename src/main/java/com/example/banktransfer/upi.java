package com.example.banktransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class upi extends AppCompatActivity {
    TextView tv1;
    EditText passq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upi);
        tv1 = (TextView) findViewById(R.id.textView18);

        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        tv1.setText(str);


        Button button = (Button) findViewById(R.id.button);

        passq = (EditText) findViewById(R.id.editTextTextPassword2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = tv1.getText().toString();

                Intent intent = new Intent(getApplicationContext(), amount.class);
                intent.putExtra("message", str);

                startActivity(intent);
                successful();
            }
        });
    }

    public void successful() {
        int password = Integer.parseInt(passq.getText().toString());

        if (password == 3434) {
            Toast.makeText(getApplicationContext(), " Successful", Toast.LENGTH_SHORT).show();
            Intent intent1 = new Intent(this, amount.class);
            startActivity(intent1);
        } else {
            Toast.makeText(getApplicationContext(), "Wrong Password", Toast.LENGTH_SHORT).show();
        }
    }
}