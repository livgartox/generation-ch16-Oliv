package com.ot.h_abstracta;

public class EjemploFiguras {
    public static void main(String[] args) {
        Triangulo t1=new Triangulo(0,0);
        t1.setBase(5);
        t1.setAltura(2);
        System.out.println("prueba con el primer tríangulo "+t1.area());

        Circulo c1=new Circulo();
        c1.setRadio(15.5f);
        System.out.println("c.area() Calcula el area "+ c1.area());

        Cuadrado square1=new Cuadrado();
        square1.setLonglado(5);
        System.out.println("area cuadrado "+ square1.getLonglado());
    }
}
