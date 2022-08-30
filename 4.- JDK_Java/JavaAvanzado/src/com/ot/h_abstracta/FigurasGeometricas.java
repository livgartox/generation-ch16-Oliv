package com.ot.h_abstracta;
/*Definir una clase abstracta */
public abstract class FigurasGeometricas {
    private String nombre;
    public abstract float area();

    public FigurasGeometricas(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre+" area -> "+area();
    }

}
