import java.util.Scanner;
import java.awt.List;
public class EjerciciosJona {
    public static void main(String[] args) {
        String cantastericos="";
        for(int i=1;i<=5;i++){
            cantastericos=cantastericos+"*";
            System.out.println(cantastericos);
        }
        String cantastericos2="******";
        System.out.println("Segundo");
        for(int j=1;j<=5;j++){
            String a=cantastericos2.substring(j);
            System.out.println(a);
        }

        //char[] caracteres = new char [7];
        //caracteres[0] = 'h';



    }
}
