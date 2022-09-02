package com.ot.j_interface;

public interface Test {
    int conv=8;
    void metodo1(int x);
    String metodo2(String s);
}
class Prueba implements Test,Test1{

    @Override
    public void metodo1(int x) {
        System.out.println("Hola método 1 parámetro x --Z "+x);
    }

    @Override
    public String metodo2(String s) {
        return "este parámetro es s ---> "+s;
    }
    public void metodoPropio(){
        System.out.println("Soy el método propio");
    }


    @Override
    public void metodo01(int x) {
        System.out.println("soy el método 01");
    }

    @Override
    public String metodo02(String s) {
        return "Soy el método 02";
    }
}
