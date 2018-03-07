package com.jhonatan.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tDisplay;
    Button bNum1,bNum2,bNum3,bNum4,bNum5,bNum6,bNum7,bNum8,bNum9,bNum0,bSuma,bResta,bMultiplicacion,bIgual,bPunto,bDivision;
    boolean decimal = false;
    boolean suma = false;
    boolean resta = false;
    boolean multiplicacion= false;
    boolean division = false;
    boolean igual = false;
    double numero0,numero1,resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tDisplay = findViewById(R.id.tDisplay);
        bNum1= findViewById(R.id.bNum1);
        bNum2= findViewById(R.id.bNum2);
        bNum3= findViewById(R.id.bNum3);
        bNum4= findViewById(R.id.bNum4);
        bNum5= findViewById(R.id.bNum5);
        bNum6= findViewById(R.id.bNum6);
        bNum7= findViewById(R.id.bNum7);
        bNum8= findViewById(R.id.bNum8);
        bNum9= findViewById(R.id.bNum9);
        bNum0= findViewById(R.id.bNum0);
        bSuma= findViewById(R.id.bSuma);
        bResta= findViewById(R.id.bResta);
        bMultiplicacion= findViewById(R.id.bMultiplicacion);
        bDivision= findViewById(R.id.bDivision);
        bPunto= findViewById(R.id.bPunto);
        bIgual= findViewById(R.id.bIgual);

    }

    public void onButtonClicked(View view) {
        int id = view.getId();
        String num = tDisplay.getText().toString();


        switch(id){
            case R.id.bNum0:
                tDisplay.setText(num + "0");
                break;
            case R.id.bNum1:
                tDisplay.setText(num +"1");
                break;
            case R.id.bNum2:
                tDisplay.setText(num +"2");
                break;
            case R.id.bNum3:
                tDisplay.setText(num +"3");
                break;
            case R.id.bNum4:
                tDisplay.setText(num +"4");
                break;
            case R.id.bNum5:
                tDisplay.setText(num +"5");
                break;
            case R.id.bNum6:
                tDisplay.setText(num +"6");
                break;
            case R.id.bNum7:
                tDisplay.setText(num +"7");
                break;
            case R.id.bNum8:
                tDisplay.setText(num +"8");
                break;
            case R.id.bNum9:
                tDisplay.setText(num +"9");
                break;
            case R.id.bPunto:
                if(decimal == false) {
                    tDisplay.setText(num + ".");
                    decimal=true;
                }else{ return;}
                break;
            case R.id.bMultiplicacion:
                //tDisplay.setText(num +"*");
                multiplicacion=true;
                numero0=Double.parseDouble(num);
                tDisplay.setText("");
                decimal=false;
                break;
            case R.id.bDivision:
                // tDisplay.setText(num +"/");
                division = true;
                numero0=Double.parseDouble(num);
                tDisplay.setText("");
                decimal=false;
                break;
            case R.id.bSuma:
                //tDisplay.setText(num +"+");
                suma= true;
                numero0=Double.parseDouble(num);
                tDisplay.setText("");
                decimal=false;
                break;
            case R.id.bResta:
                //tDisplay.setText(num +"-");
                resta= true;
                numero0=Double.parseDouble(num);
                tDisplay.setText("");
                decimal=false;
                break;
            case R.id.bIgual:
                //tDisplay.setText(num +"=");
                numero1=Double.parseDouble(num);
                if(suma == true){
                    resultado = numero0 + numero1;
                    tDisplay.setText(String.valueOf(resultado));
                    suma = false;
                }else if(resta == true){
                    resultado = numero0 - numero1;
                    tDisplay.setText(String.valueOf(resultado));
                    resta = false;
                }else if(multiplicacion == true){
                    resultado = numero0 * numero1;
                    tDisplay.setText(String.valueOf(resultado));
                    multiplicacion  = false;
                }else if(division == true ){
                    resultado = numero0 / numero1;
                    tDisplay.setText(String.valueOf(resultado));
                    division = false;
                }
                break;
        }
    }
}
