package com.ot.j_interface;

import java.util.ArrayList;

public class EjemploTest {
    public static void main(String[] args) {
        System.out.println("Test.conv = " +Test.conv);
        /*System.out.println("Prueba.conv = " + Prueba.conv);*/
        Prueba p=new Prueba();
        /*System.out.println(p.conv);*/
        /*Instancia de tipo referencia */
        Test ts=new Prueba();
        ts.metodo1(5);
        ts.metodo2("Adriana");
        System.out.println("hey"+ts.metodo2("Adriana"));
        p.metodoPropio();
        /*List <> ob=new ArrayList<>();*/
        Test1 s1 = new Prueba();
        s1.metodo01(5);
        System.out.println("s1.metodo02() = " + s1.metodo02("Andi"));

    }
}
