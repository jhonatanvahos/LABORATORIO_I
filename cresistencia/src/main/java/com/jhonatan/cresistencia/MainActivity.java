package com.jhonatan.cresistencia;

import android.content.Context;
import android.graphics.Color;
import android.provider.CalendarContract;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bPrimeraBanda,bSegundaBanda,bTerceraBanda,bCuartaBanda;
    TextView tMostrar;
    int contador1=0,contador2=0,contador3=0,contador4=0;
    String valor1="1",valor2="0",valor3="Ω",valor4="1%";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bPrimeraBanda = findViewById(R.id.bPrimeraBanda);
        bSegundaBanda = findViewById(R.id.bSegundaBanda);
        bTerceraBanda = findViewById(R.id.bTerceraBanda);
        bCuartaBanda = findViewById(R.id.bCuartaBanda);
        tMostrar = findViewById(R.id.tMostrar);
        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);

    }

    public void onClickedButton(View view) {
        int id = view.getId();
        switch (id){
            case R.id.bPrimeraBanda:
                if (contador1 == 0) {
                    valor1="2";
                    if(contador3==2 ||contador3==5 || contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bPrimeraBanda.setBackgroundColor(Color.parseColor("#ff0000"));
                    contador1++;
                } else if (contador1 == 1) {
                    valor1="3";
                    if(contador3==2 ||contador3==5|| contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bPrimeraBanda.setBackgroundColor(Color.parseColor("#ffa500"));
                    contador1++;
                } else if (contador1 == 2) {
                    valor1="4";
                    if(contador3==2||contador3==5 || contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bPrimeraBanda.setBackgroundColor(Color.parseColor("#ffff00"));
                    contador1++;
                } else if (contador1 == 3) {
                    valor1="5";
                    if(contador3==2||contador3==5 || contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bPrimeraBanda.setBackgroundColor(Color.parseColor("#008000"));
                    contador1++;
                } else if (contador1 == 4) {
                    valor1="6";
                    if(contador3==2||contador3==5 || contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bPrimeraBanda.setBackgroundColor(Color.parseColor("#0000ff"));
                    contador1++;
                } else if (contador1 == 5) {
                    valor1="7";
                    if(contador3==2 ||contador3==5|| contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bPrimeraBanda.setBackgroundColor(Color.parseColor("#800080"));
                    contador1++;
                } else if (contador1 == 6) {
                    valor1="8";
                    if(contador3==2||contador3==5 || contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bPrimeraBanda.setBackgroundColor(Color.parseColor("#808080"));
                    contador1++;
                } else if (contador1 == 7) {
                    valor1="9";
                    if(contador3==2 ||contador3==5|| contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bPrimeraBanda.setBackgroundColor(Color.parseColor("#ffffff"));
                    contador1++;
                } else if (contador1 == 8) {
                    valor1="1";
                    if(contador3==2 ||contador3==5|| contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bPrimeraBanda.setBackgroundColor(Color.parseColor("#a52a2a"));
                    contador1 = 0;
                }
                break;
            case R.id.bSegundaBanda:
                if(contador2==0) {
                    valor2="1";
                    if(contador3==2 ||contador3==5|| contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bSegundaBanda.setBackgroundColor(Color.parseColor("#a52a2a"));
                    contador2++;
                }else if (contador2 == 1) {
                    valor2="2";
                    if(contador3==2||contador3==5 || contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bSegundaBanda.setBackgroundColor(Color.parseColor("#ff0000"));
                    contador2++;
                } else if (contador2 == 2) {
                    valor2="3";
                    if(contador3==2||contador3==5 || contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bSegundaBanda.setBackgroundColor(Color.parseColor("#ffa500"));
                    contador2++;
                } else if (contador2 == 3) {
                    valor2="4";
                    if(contador3==2||contador3==5 || contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bSegundaBanda.setBackgroundColor(Color.parseColor("#ffff00"));
                    contador2++;
                } else if (contador2 == 4) {
                    valor2="5";
                    if(contador3==2||contador3==5 || contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bSegundaBanda.setBackgroundColor(Color.parseColor("#008000"));
                    contador2++;
                } else if (contador2 == 5) {
                    valor2="6";
                    if(contador3==2||contador3==5 || contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bSegundaBanda.setBackgroundColor(Color.parseColor("#0000ff"));
                    contador2++;
                } else if (contador2 == 6) {
                    valor2="7";
                    if(contador3==2||contador3==5 || contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bSegundaBanda.setBackgroundColor(Color.parseColor("#800080"));
                    contador2++;
                } else if (contador2 == 7) {
                    valor2="8";
                    if(contador3==2||contador3==5 || contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bSegundaBanda.setBackgroundColor(Color.parseColor("#808080"));
                    contador2++;
                } else if (contador2 == 8) {
                    valor2="9";
                    if(contador3==2||contador3==5 || contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bSegundaBanda.setBackgroundColor(Color.parseColor("#ffffff"));
                    contador2++;
                }else if (contador2 == 9) {
                    valor2="0";
                    if(contador3==2 ||contador3==5|| contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bSegundaBanda.setBackgroundColor(Color.parseColor("#000000"));
                    contador2 = 0;
                }
                break;
            case R.id.bTerceraBanda:
                if(contador3==0) {
                    valor3="0Ω";
                    tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    bTerceraBanda.setBackgroundColor(Color.parseColor("#a52a2a"));
                    contador3++;
                } else if (contador3 == 1) {
                    valor3="kΩ";
                    tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    bTerceraBanda.setBackgroundColor(Color.parseColor("#ff0000"));
                    contador3++;
                } else if (contador3 == 2) {
                    valor3="kΩ";
                    tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    bTerceraBanda.setBackgroundColor(Color.parseColor("#ffa500"));
                    contador3++;
                } else if (contador3 == 3) {
                    valor3="0kΩ";
                    tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    bTerceraBanda.setBackgroundColor(Color.parseColor("#ffff00"));
                    contador3++;
                } else if (contador3 == 4) {
                    valor3="MΩ";
                    tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    bTerceraBanda.setBackgroundColor(Color.parseColor("#008000"));
                    contador3++;
                } else if (contador3 == 5) {
                    valor3="MΩ";
                    tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    bTerceraBanda.setBackgroundColor(Color.parseColor("#0000ff"));
                    contador3++;
                } else if (contador3 == 6) {
                    valor3="Ω";
                    tMostrar.setText(valor1+ "."+ valor2 + valor3 + "   tol" + valor4);
                    bTerceraBanda.setBackgroundColor(Color.parseColor("#ffd700"));
                    contador3++;
                } else if (contador3 == 7) {
                    valor3="Ω";
                    tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    bTerceraBanda.setBackgroundColor(Color.parseColor("#c0c0c0"));
                    contador3++;
                }  else if (contador3 == 8) {
                    valor3="Ω";
                    tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    bTerceraBanda.setBackgroundColor(Color.parseColor("#000000"));
                    contador3 = 0;
                }
                break;
            case R.id.bCuartaBanda:
                if (contador4 == 0) {
                    valor4="2%";
                    if(contador3==2 ||contador3==5|| contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bCuartaBanda.setBackgroundColor(Color.parseColor("#ff0000"));
                    contador4++;
                } else if (contador4 == 1) {
                    valor4="5%";
                    if(contador3==2||contador3==5 || contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bCuartaBanda.setBackgroundColor(Color.parseColor("#ffd700"));
                    contador4++;
                } else if (contador4 == 2) {
                    valor4="10%";
                    if(contador3==2 ||contador3==5|| contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bCuartaBanda.setBackgroundColor(Color.parseColor("#c0c0c0"));
                    contador4++;
                } else if (contador4 == 3) {
                    valor4="1%";
                    if(contador3==2 ||contador3==5|| contador3 == 7){
                        tMostrar.setText(valor1 + "." + valor2 + valor3 + "   tol" + valor4);
                    }else if(contador3==8){
                        tMostrar.setText("0." +valor1 + valor2 + valor3 + "   tol" + valor4);
                    }else {
                        tMostrar.setText(valor1 + valor2 + valor3 + "   tol" + valor4);
                    }
                    bCuartaBanda.setBackgroundColor(Color.parseColor("#a52a2a"));
                    contador4 = 0;
                }
                break;
        }
    }
}

