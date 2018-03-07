package com.jhonatan.geometria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton rCirculo,rCuadrado,rCubo,rTriangulo;
    TextView tPerimetro,tArea,tVolumen,tCuadrado,tCirculo,tTriangulo,tCubo;
    EditText eCuadrado,eCirculo,eTriangulo,eCubo;
    Button bCalcular;
    double perimetro,area,volumen,lado,base,altura,radio;
    String Slado,Sradio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bCalcular = findViewById(R.id.bCarcular);
        rCirculo = findViewById(R.id.rCirculo);
        rCuadrado = findViewById(R.id.rCuadrado);
        rCubo = findViewById(R.id.rCubo);
        rTriangulo = findViewById(R.id.rTriangulo);
        tCirculo = findViewById(R.id.tCirculo);
        tCuadrado = findViewById(R.id.tCuadrado);
        tCubo = findViewById(R.id.tCubo);
        tTriangulo = findViewById(R.id.tTriangulo);
        eCirculo = findViewById(R.id.eCirculo);
        eCirculo.setEnabled(false);
        eCuadrado = findViewById(R.id.eCuadrado);
        eCuadrado.setEnabled(false);
        eCubo = findViewById(R.id.eCubo);
        eCubo.setEnabled(false);
        eTriangulo = findViewById(R.id.eTriangulo);
        eTriangulo.setEnabled(false);
        tPerimetro = findViewById(R.id.tPerimetro);
        tArea = findViewById(R.id.tArea);
        tVolumen = findViewById(R.id.tVolumen);

    }


    public void onClickedRadioButton(View view) {

        int id = view.getId();
        switch (id){
            case R.id.rCirculo:

                tCirculo.setText("Ingrese el Radio:");
                eCirculo.setEnabled(true);
                tCubo.setText("");
                eCubo.setEnabled(false);
                tCuadrado.setText("");
                eCuadrado.setEnabled(false);
                tTriangulo.setText("");
                eTriangulo.setEnabled(false);
                eCubo.setText("");
                eCuadrado.setText("");
                eTriangulo.setText("");
                break;
            case R.id.rCubo:
                tCubo.setText("Ingrese lado:");
                eCubo.setEnabled(true);
                tCirculo.setText("");
                eCirculo.setEnabled(false);
                tCuadrado.setText("");
                eCuadrado.setEnabled(false);
                tTriangulo.setText("");
                eTriangulo.setEnabled(false);
                eCirculo.setText("");
                eCuadrado.setText("");
                eTriangulo.setText("");
                break;
            case R.id.rCuadrado:
                tCuadrado.setText("Ingrese lado:");
                eCuadrado.setEnabled(true);
                tCirculo.setText("");
                eCirculo.setEnabled(false);
                tCubo.setText("");
                eCubo.setEnabled(false);
                tTriangulo.setText("");
                eTriangulo.setEnabled(false);
                eCirculo.setText("");
                eCubo.setText("");
                eTriangulo.setText("");
                break;
            case R.id.rTriangulo:
                tTriangulo.setText("Ingrese lado:");
                eTriangulo.setEnabled(true);
                tCirculo.setText("");
                eCirculo.setEnabled(false);
                tCubo.setText("");
                eCubo.setEnabled(false);
                tCuadrado.setText("");
                eCuadrado.setEnabled(false);
                eCirculo.setText("");
                eCubo.setText("");
                eCuadrado.setText("");

                break;


        }
    }

    public void onClickedButton(View view) {
        int id= view.getId();
        if(id == R.id.bCarcular) {
            if (rCirculo.isChecked()) {
                Sradio = eCirculo.getText().toString();
                radio = Integer.parseInt(Sradio);
                perimetro = 2 * radio * Math.PI;
                area = 2 * radio * radio;
                tPerimetro.setText(String.valueOf(perimetro));
                tArea.setText(String.valueOf(area));
                tVolumen.setText("");
            } else if (rCuadrado.isChecked()) {
                Slado = eCuadrado.getText().toString();
                lado = Integer.parseInt(Slado);
                perimetro = 4 * lado;
                area = lado * lado;
                tPerimetro.setText(String.valueOf(perimetro));
                tArea.setText(String.valueOf(area));
                tVolumen.setText("");
            } else if (rCubo.isChecked()) {
                Slado = eCubo.getText().toString();
                lado = Integer.parseInt(Slado);
                perimetro = 6 * 4 * lado;
                area = 6 * lado * lado;
                volumen = lado * lado * lado;
                tPerimetro.setText(String.valueOf(perimetro));
                tArea.setText(String.valueOf(area));
                tVolumen.setText(String.valueOf(volumen));
            } else if (rTriangulo.isChecked()) {
                Slado = eTriangulo.getText().toString();
                lado= Integer.parseInt(Slado);
                perimetro= 3*lado;
                base = lado;
                altura = ((Math.sqrt(3)) * lado)/2;
                area = (base * altura) / 2;
                tPerimetro.setText(String.valueOf(perimetro));
                tArea.setText(String.valueOf(area));
                tVolumen.setText("");
            } else {
                tPerimetro.setText("");
                tArea.setText("");
                tVolumen.setText("");
            }
        }
    }
}
