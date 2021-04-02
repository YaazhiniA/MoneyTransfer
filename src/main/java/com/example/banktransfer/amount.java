package com.example.banktransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class amount extends AppCompatActivity {
Button btn,btn1;
EditText et;
    TextView tv1,tv4,tv3,tv2;
    //EditText tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amount);
       // tv3 = (EditText) findViewById(R.id.editTextTextPersonName13);
        tv4 = (TextView)findViewById(R.id.textView24);
        btn = (Button)findViewById(R.id.button8);
        btn1 = (Button)findViewById(R.id.button11);
        tv2 = (TextView)findViewById(R.id.textView26);
        tv3 = (TextView) findViewById(R.id.textView25);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        tv4.setText(str);

    btn.setOnClickListener(new View.OnClickListener()
    { @Override public void onClick(View v)
        { int bal; int trans;
        String srt;
        bal=Integer.parseInt(tv3.getText().toString());
        trans=Integer.parseInt(tv4.getText().toString());
        bal= bal - trans;
        String s=Integer.toString(bal);

            tv2.setText(s); } });
    btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = tv2.getText().toString();

                Intent intent = new Intent(getApplicationContext(), balance.class);
                intent.putExtra("message", str);

                startActivity(intent);
            }
        });



    }
    /*public void first(View view){
        Intent intent1=new Intent(this,first.class);
        startActivity(intent1);
    }*/
}