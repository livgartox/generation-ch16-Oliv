import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        //determinar si una persona es mayor de edad
        //System.out es diferente del system in
        //Pedir edad:
        Scanner escaner=new Scanner(System.in);//instanciar: crear un obj apartir de una clase
        System.out.println("Escribe tu edad: ");
        int edad=escaner.nextInt();
        System.out.println("Escribe tu nombre ");
        String nombre=escaner.next();
        escaner.close();//Cuando ya no se necesiten leer más datos

        //condicionar a que debe ser mayor a 18
        if (edad>=18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }


        //Operador Ternario:
        String resultado=(edad>=18) ? "Eres mayor de edad": "Eres menor de edad";
        System.out.println("con operador ternario = " + resultado);
    }
}
