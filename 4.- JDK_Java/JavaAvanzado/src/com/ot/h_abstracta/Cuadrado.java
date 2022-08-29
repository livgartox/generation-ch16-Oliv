package com.ot.h_abstracta;

public class Cuadrado extends FigurasGeometricas{
    private float longlado;
    /*Constructor */
    public Cuadrado() {
    }

    public Cuadrado(float longlado) {
        this.longlado = longlado;
    }

    /*Get y Set*/

    public float getLonglado() {
        return longlado;
    }

    public void setLonglado(float longlado) {
        this.longlado = longlado;
    }
    /*Métodos*/
    public float area(){
        return getLonglado()*getLonglado();
    }
}
