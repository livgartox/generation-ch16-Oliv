public class EjemploVariables {
    public static void main(String[] args) {
        String nombre="Adriana";
        String saludo="Hola, esto es un ejemplo de variables";
        System.out.println(saludo+" "+nombre);
        char espacio='\u0020';
        char caracter='a';
        System.out.println("espacio = " + espacio);
        System.out.println("char corresponde en byte: "+Character.BYTES);
        System.out.println("char corresponde en bits: ln" + Character.SIZE);
        System.out.println("char valor máximo: " + Character.MAX_VALUE);
        System.out.println("char valor mínimo = " + Character.MIN_VALUE);

        int numeroEntero=2;
        //Integer es la clase base
        System.out.println("numeroEntero = " + numeroEntero);
        System.out.println("int corresponde en byte: " + Integer.BYTES);
        System.out.println("int corresponde en bits: " + Integer.SIZE);
        System.out.println("int valor máximo: " + Integer.MAX_VALUE);
        System.out.println("int valor mínimo = " + Integer.MIN_VALUE);


        float numeroFloat=0.00000000015f;//1.5e-10
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Float corresponde en byte: " + Float.BYTES);
        System.out.println("Float corresponde en bits: " + Float.SIZE);
        System.out.println("Float valor máximo: " + Float.MAX_VALUE);
        System.out.println("Float valor mínimo = " + Float.MIN_VALUE);

        double numeroDouble=3.444444444E39;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Double corresponde en byte: " + Double.BYTES);
        System.out.println("Double corresponde en bits: " + Double.SIZE);
        System.out.println("Double valor máximo: " + Double.MAX_VALUE);
        System.out.println("Double valor mínimo = " + Double.MIN_VALUE);

        //Boolean no tiene los métodos que el otro sí tenía
        boolean valorBoolean=true;
        System.out.println("valorBoolean = " + valorBoolean);

        //long
        long valorLong=3455633;
        System.out.println("valorLong = " + valorLong);
        System.out.println("Long corresponde en byte: " + Long.BYTES);
        System.out.println("Long corresponde en bits: " + Long.SIZE);
        System.out.println("Long valor máximo: " + Long.MAX_VALUE);
        System.out.println("Long valor mínimo = " + Long.MIN_VALUE);

        byte valorByte=12;
        System.out.println("valorByte = " + valorByte);
        System.out.println("Byte corresponde en byte: " + Byte.BYTES);
        System.out.println("Byte corresponde en bits: " + Byte.SIZE);
        System.out.println("Byte valor máximo: " + Byte.MAX_VALUE);
        System.out.println("Byte valor mínimo = " + Byte.MIN_VALUE);



    }
}
