package com.ot.h_abstracta;

public class Circulo extends FigurasGeometricas{
    private float radio;
    @Override
    public float area(){
        return (float)(Math.PI*Math.pow(radio,2));
    }
    /*Constructor */
    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }
    /*Set y Get */

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
}
