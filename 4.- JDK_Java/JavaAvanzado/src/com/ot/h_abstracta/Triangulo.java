package com.ot.h_abstracta;

public class Triangulo extends FigurasGeometricas{
    private float base;
    private float altura;

    /*Constructor */
    public Triangulo() {
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public float area(){
        return (getBase()*getAltura())/2;
    }

    /*Getter y Setter */
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
