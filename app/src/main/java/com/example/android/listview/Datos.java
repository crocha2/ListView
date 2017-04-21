package com.example.android.listview;

import java.util.ArrayList;

/**
 * Created by android on 21/04/2017.
 */

public class Datos {

    private static ArrayList<Operacion> operaciones = new ArrayList();

    public static void guardar(Operacion p){
        operaciones.add(p);
    }

    public static ArrayList<Operacion> getDatos() {
        return operaciones;
    }

}
