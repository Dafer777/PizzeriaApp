package com.example.pizzeriaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button btn;
    Button prinpal;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn = (Button) findViewById(R.id.btnPedido);
        prinpal = (Button) findViewById(R.id.btnPrincipal);
        tv = (TextView) findViewById(R.id.tv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle extras = getIntent().getExtras();
                String ingre = extras.getString("Ingrediente");
                double total = extras.getDouble( "Total");
                String name = extras.getString("Nombre");


                tv.setText("Estimad@ "+ name +", tu pedido es:\n"+ingre+"\n"+"Tu total es: "+total+"\n");

            }
        });


       prinpal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent prinpal = new Intent(MainActivity2.this,MainActivity.class);
               startActivity(prinpal);
           }
       });

    }
}