package com.ot.principal;

import com.ot.herencia.BasePadre;
import com.ot.herencia.Ejecutar;
import com.ot.herencia.Hija;
import com.ot.herencia.Hijo;

import java.util.ArrayList;
import java.util.List;

public class EjemploHerencia {
    public static void main(String[] args) {
        //ejercicio
        //Ejecutar ejecutar=new Ejecutar();
        //ejecutar.ejecutar();
        Hija h=new Hija();
        h.visualizarA();//Esto se pudo hacer por el super que le asignamos a la clase hija
        Hijo ho=new Hijo();
        ho.setA(1234);
        ho.visualizarABC();

        BasePadre obj=new BasePadre();
        obj.setA(2345);
        Object miObj=new BasePadre();
        /*obj.setB(2.3);*/

        BasePadre objB=new BasePadre();
        objB.setA(2345);

        /*
        System.out.println("atributo de la  "+h.getA());
        System.out.println("atributo de la  "+h.getB());*/

        /*Object miObj=new BasePadre();
        List <T>obj=new ArrayList<>();*/

        System.out.println("Atributo de clase padre "+objB.getA());

        System.out.println("Atributo de clase hijo "+ho.getA());

    }
}
