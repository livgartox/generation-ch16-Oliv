package com.ot.h_abstracta;

public class Rectangulo extends FigurasGeometricas{
    private float b;
    private float h;
    /*Constructor */

    public Rectangulo(float b, float h) {
        super("Rectangulo");
        this.b = b;
        this.h = h;
    }
    /*Get y Set */

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }
    /*Métodos */
    @Override
    public float area() {
        return getB()*getH();
    }

}
