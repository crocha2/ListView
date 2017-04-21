package com.example.android.listview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CalculoCuadrado extends AppCompatActivity {

    private EditText cajaNumero;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_cuadrado);

        cajaNumero = (EditText)findViewById(R.id.txtNumero);

        res = this.getResources();


    }

    public void Calculo(View v){
        String operacion = "CUADRADO";
        int valor;
        int resultado = 0;

        valor = Integer.parseInt(cajaNumero.toString());

        resultado = valor*valor;

        Operacion op = new Operacion(operacion, valor, resultado);
        op.guardar();

        new AlertDialog.Builder(this).setMessage(res.getString(R.string.mensaje)).show();
        limpiar();
    }

    public void borrar(View v){
        limpiar();
    }

    public void limpiar(){
        cajaNumero.setText("");
        cajaNumero.requestFocus();
    }





}
