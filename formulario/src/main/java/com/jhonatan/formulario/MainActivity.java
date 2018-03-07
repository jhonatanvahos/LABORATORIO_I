package com.jhonatan.formulario;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText eFecha,eLogin,ePassword,eRPassword,eCorreo;
    TextView tMostrar;
    Spinner opciones;
    CheckBox cCantar,cLeer,cDibujar,cVideojuegos;
    int año,mes,dia;
    static final int DIALOGO=0;
    static DatePickerDialog.OnDateSetListener selectorfecha;
    String login,password,rpassword,correo,sexo,fecha,lugar,cantar="",dibujar="",leer="",videojuegos="";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calendar fechaActual = Calendar.getInstance();
        año = fechaActual.get(Calendar.YEAR);
        mes = fechaActual.get(Calendar.MONTH);
        dia = fechaActual.get(Calendar.DAY_OF_MONTH);

        opciones = findViewById(R.id.sLugar);
        eFecha = findViewById(R.id.eFecha);
        eLogin = findViewById(R.id.eLogin);
        ePassword = findViewById(R.id.ePassword);
        eRPassword = findViewById(R.id.eRPassword);
        eCorreo = findViewById(R.id.eCorreo);
        tMostrar = findViewById(R.id.tMostrar);
        cCantar = findViewById(R.id.cCantar);
        cLeer = findViewById(R.id.cLeer);
        cDibujar = findViewById(R.id.cDibujar);
        cVideojuegos = findViewById(R.id.cVideojuegos);


        selectorfecha = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                año = year;
                mes= monthOfYear;
                dia = dayOfMonth;
                eFecha.setText(dia+"/"+(mes +1)+"/"+año);

            }
        };

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.opciones,android.R.layout.simple_spinner_item);
        opciones.setAdapter(adapter);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch(id){
            case 0 :
                return new DatePickerDialog(this,selectorfecha,año,mes,dia);
        }
        return null;
    }

    public void onRadioButtonClicked(View view) {
        int id = view.getId();

        if ( id== R.id.rMasculino){

            sexo = "Masculino";
        }else{
            sexo = "Femenino";
        }
    }
    public void onCheckBoxClicked(View view) {
        int id = view.getId();

        switch (id){
            case R.id.cCantar:
                if(cCantar.isChecked()) {
                    cantar ="Cantar";
                }else{
                    cantar ="";
                }
                break;
            case R.id.cDibujar:
                if(cDibujar.isChecked()) {
                    dibujar ="Dibujar";
                }else{
                    dibujar = "";
                }
                break;
            case R.id.cLeer:
                if(cLeer.isChecked()) {
                    leer ="Leer";
                }else{
                    leer = "";
                }
                break;
            case R.id.cVideojuegos:
                if(cVideojuegos.isChecked()) {
                    videojuegos = "Videojuegos";
                }else{
                    videojuegos = "";
                }
                break;

        }
    }
    public void onEditTextClicked(View view) {
        showDialog(DIALOGO);
    }

    public void onButtonClicked(View view) {
        login= eLogin.getText().toString();
        password= ePassword.getText().toString();
        rpassword= eRPassword.getText().toString();
        correo= eCorreo.getText().toString();
        fecha= eFecha.getText().toString();
        lugar =opciones.getSelectedItem().toString();

        if (login.equals("") || password.equals("")|| rpassword.equals("")|| correo.equals("")|| fecha.equals("")|| sexo.equals("")|| lugar.equals("")|| (!(cCantar.isChecked())&&!(cLeer.isChecked())&&!(cDibujar.isChecked())&&!(cVideojuegos.isChecked()) )) {
            Toast.makeText(this, "Debe llenar todos los datos", Toast.LENGTH_LONG).show();

        }else if(!(password.equals(rpassword))){
            Toast.makeText(this, "Contraseñas diferentes", Toast.LENGTH_LONG).show();
        }else{
            tMostrar.setText(login + "  " + password + "  " + rpassword + "  " + correo + "  " + sexo + "  " + fecha + "  " + lugar + "  " + cantar + "  " + dibujar+ "  " + leer+ "  " + videojuegos);

        }
    }
}