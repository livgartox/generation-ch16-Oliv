import java.util.Objects;
import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        System.out.println("Bucles");
        for (int i=0; i<10;i++){
            System.out.println(i);
        }
        //while
        //bucle no controlado
        //la condición se debe modificar dentro del while
        //Mientras la condición sea true
        String condicion="";
        Scanner sc=new Scanner(System.in);
        // == != estamos comparando datos primitivos
        while((!Objects.equals(condicion,"Hola"))|!Objects.equals(condicion,"hey")){
            System.out.println("Saludame");
            condicion=sc.next();

        }



    }
}
