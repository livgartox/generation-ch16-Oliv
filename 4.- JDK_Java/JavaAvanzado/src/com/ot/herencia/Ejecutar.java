package com.ot.herencia;

import java.util.Scanner;

public class Ejecutar {
    public void ejecutar(){
        BasePadre basepadre=new BasePadre();
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el valor de a (es entero)");
        int a=sc.nextInt();
        basepadre.setA(a);
        System.out.println("Ingrese el valor de b (es double");
        double b=sc.nextDouble();
        basepadre.setB(b);
        System.out.println("Ingrese el valor de c (es string)");
        String c=sc.next();
        basepadre.setC(c);
        basepadre.visualizarA();
        basepadre.visualizarABC();
    }
}
