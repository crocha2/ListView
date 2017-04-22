package com.example.android.listview;

/**
 * Created by android on 21/04/2017.
 */

public class Operacion {

    private String nombreOperacion;
    private int valorLado;
    private int resultado;

    public Operacion(String nombreOperacion, int resultado, int valorLado) {
        this.nombreOperacion = nombreOperacion;
        this.resultado = resultado;
        this.valorLado = valorLado;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getValorLado() {
        return valorLado;
    }

    public void setValorLado(int valorLado) {
        this.valorLado = valorLado;
    }

    public String getNombreOperacion() {
        return nombreOperacion;
    }

    public void setNombreOperacion(String nombreOperacion) {
        this.nombreOperacion = nombreOperacion;
    }

    public void guardar(){
        Datos.guardar(this);
    }

}
