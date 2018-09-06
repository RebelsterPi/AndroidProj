package com.example.dell.tasks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button button;
private Button button2;
private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2=findViewById(R.id.button2);
        button =findViewById(R.id.button);
        button3=findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opena3();
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
                                       @Override
                                       public void onClick(View view) {opena2();}});
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
open1();
            }
        });

    }
    public void open1(){
            Intent i=new Intent(getApplicationContext(),a1.class);
            startActivity(i);

    }
    public void opena2(){
           Intent i1= new Intent(getApplicationContext(),a2.class);
           startActivity(i1);

    }
    public void opena3(){Intent i3=new Intent(getApplicationContext(),a3.class);
    startActivity(i3);}
}
