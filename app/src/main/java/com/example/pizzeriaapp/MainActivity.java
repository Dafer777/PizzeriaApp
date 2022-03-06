package com.example.pizzeriaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.CursorJoiner;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton rb1,rb2,rb3;
    CheckBox p1,p2,p3,p4,p5,p6,p7;
    String ingredientes, nombre;
    Button button;
    EditText et1;
    double price;
    int counter = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn);
        ingredientes= "";
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        p1 = (CheckBox) findViewById(R.id.p1);
        p2 = (CheckBox) findViewById(R.id.p2);
        p3 = (CheckBox) findViewById(R.id.p3);
        p4 = (CheckBox) findViewById(R.id.p4);
        p5 = (CheckBox) findViewById(R.id.p5);
        p6 = (CheckBox) findViewById(R.id.p6);
        p7 = (CheckBox) findViewById(R.id.p7);
        et1 = (EditText) findViewById(R.id.et);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(rb3.isChecked()==true) {
                    price = price + 5000;
                    ingredientes += rb3.getText().toString();
                    ingredientes += "\n";
                    counter++;
                }
                else if (rb2.isChecked()==true)
                {
                    price = price + 3000;
                    ingredientes += rb2.getText().toString();
                    ingredientes +="\n";
                    counter++;
                }
                else {

                    price = price + 1500;
                    ingredientes += rb1.getText().toString();
                    ingredientes +="\n";
                    counter++;

                }



                if (p1.isChecked() == true){
                    price = price + 400;
                    ingredientes += p1.getText().toString();
                    ingredientes += "\n";
                    counter++;
                }
                if (p2.isChecked() == true){
                    price = price + 200;
                    ingredientes += p2.getText().toString();
                    ingredientes += "\n";
                    counter++;
                }
                if (p3.isChecked() == true){
                    price = price + 450;
                    ingredientes += p3.getText().toString();
                    ingredientes += "\n";
                    counter++;
                }
                if (p4.isChecked() == true){
                    price = price + 250;
                    ingredientes += p4.getText().toString();
                    ingredientes += "\n";
                    counter++;
                }
                if (p5.isChecked() == true){
                    price = price + 200;
                    ingredientes += p5.getText().toString();
                    ingredientes += "\n";
                    counter++;
                }
                if (p6.isChecked() == true){
                    price = price + 200;
                    ingredientes += p6.getText().toString();
                    ingredientes += "\n";
                    counter++;
                }
                if (p7.isChecked() == true){
                    price = price + 250;
                    ingredientes += p7.getText().toString();
                    ingredientes += "\n";
                    counter++;
                }
                    nombre = et1.getText().toString();

                    if (counter>0){
                        Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                        i.putExtra("Ingrediente", ingredientes);
                        i.putExtra("Total", price);
                        i.putExtra("Nombre", nombre);

                        startActivity(i);
                        finish();
                    }
                Toast.makeText(getApplicationContext(),"El pedido esta listo. De click al boton conocer pedido para ver el total a pagar.",Toast.LENGTH_LONG).show();



            }
        });

    }
}