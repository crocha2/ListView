package com.example.android.listview;

/**
 * Created by android on 21/04/2017.
 */

public class Operacion {

    private String nombreOperacion;
    private int valorLiado;
    private int resultado;

    public Operacion(String nombreOperacion, int valorLiado, int resultado) {
        this.nombreOperacion = nombreOperacion;
        this.valorLiado = valorLiado;
        this.resultado = resultado;
    }

    public String getNombreOperacion() {
        return nombreOperacion;
    }

    public void setNombreOperacion(String nombreOperacion) {
        this.nombreOperacion = nombreOperacion;
    }

    public int getValorLiado() {
        return valorLiado;
    }

    public void setValorLiado(int valorLiado) {
        this.valorLiado = valorLiado;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void guardar(){
        Datos.guardar(this);
    }

}
