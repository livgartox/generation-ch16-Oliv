package ejerciciosTarea;

import java.util.Scanner;

public class MainEjerciciosTarea {
    public static void main(String[] args) {
        //Crear un objeto de tipo referencia Hora, usando el constructor vacío
        //Lo manejaremos considerando las 24 horas
        Hora hora=new Hora(23,362,362);
        //Ejemplo: 0,362,362
        //6 minutos 2 segundos
        //6 horas 2 minutos
        //resultado 6 horas 8 minutos 2 segundos
        Scanner sc=new Scanner(System.in);
        //int hora= sc.nextInt();
        System.out.println("exp "+hora.visualizarHora());
    }
}
