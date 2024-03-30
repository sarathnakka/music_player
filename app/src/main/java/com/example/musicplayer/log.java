package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class log extends AppCompatActivity {
EditText a,c;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        a=findViewById(R.id.a);
        c=findViewById(R.id.c);
        b=findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  e,p;

                EditText er,pr;
                er=(EditText) findViewById(R.id.c);
                e=er.getText().toString().trim();
                pr=(EditText) findViewById(R.id.c);
                p=pr.getText().toString().trim();
                String ep = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                if (e.matches(ep)){
                    Intent i=new Intent(log.this,ml.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid email address Please enter again",Toast.LENGTH_SHORT).show();
                }
            }
        });





    }
}