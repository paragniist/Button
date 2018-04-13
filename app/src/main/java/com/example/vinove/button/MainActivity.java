package com.example.vinove.button;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AppCompatButton raisedButton;
    AppCompatButton flatButton;
    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        raisedButton = findViewById(R.id.raisedBtn);
        raisedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Raised Button",Toast.LENGTH_SHORT).show();
            }
        });

        flatButton = findViewById(R.id.flatBtn);
        flatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Flat Button",Toast.LENGTH_SHORT).show();
            }
        });
        fab = (FloatingActionButton) findViewById(R.id.fab_btn);


        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Floating Action Button",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
