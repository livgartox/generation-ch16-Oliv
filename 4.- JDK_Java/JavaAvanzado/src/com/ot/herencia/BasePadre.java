package com.ot.herencia;

public class BasePadre {
    //atributos
    protected int a;
    private double b;
    private String c;
    //Constructor vacío
    public BasePadre() {
    }
    //Métodos
    public void visualizarA(){
        System.out.println("elemento de la clase padre el valor de a "+getA());
    }

    public void visualizarABC(){
        //System.out.println("el valor de a es "+getA());
        //System.out.println("el valor de B es "+getB());
        //System.out.println("el valor de c es "+getC());
        System.out.println("método ABC");
    }
    //Métodos accesores
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}
