package com.ot.principal;

import com.ot.herencia.BasePadre;
import com.ot.herencia.Ejecutar;
import com.ot.herencia.Hija;
import com.ot.herencia.Hijo;

public class EjemploHerencia {
    public static void main(String[] args) {
        //ejercicio
        //Ejecutar ejecutar=new Ejecutar();
        //ejecutar.ejecutar();
        Hija h=new Hija();
        h.visualizarA();//Esto se pudo hacer por el super que le asignamos a la clase hija
        Hijo ho=new Hijo();
        ho.visualizarABC();

        BasePadre obj=new BasePadre();
        obj.setA(2345);
        obj.setB(2.3);

        System.out.println("atributo de la  "+h.getA());
        System.out.println("atributo de la  "+h.getB());

    }
}
