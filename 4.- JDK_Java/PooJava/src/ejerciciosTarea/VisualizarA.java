package ejerciciosTarea;

import java.util.Scanner;

public class VisualizarA {
    public void verArea(){
        Triangulo triangulo=new Triangulo();
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la base del triángulo");
        int base=sc.nextInt();
        System.out.println("Ingrese la base del triángulo");
        int altura=sc.nextInt();
        triangulo.setBase(base);
        triangulo.setAltura(altura);
        System.out.println(triangulo.areaT());
    }
}
