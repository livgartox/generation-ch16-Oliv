import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i=5, j=4,suma=i+j;
        System.out.println("suma = " + suma);
        System.out.println("i + j= " + (i+j));
        
        int resta=i-j;
        System.out.println("resta = " + resta);
        System.out.println("(i-j) = " + (i-j));

        int multi=i*j;
        System.out.println("multi = " + multi);
        System.out.println("i*j = " + i*j);
        
        int division=i/j;
        System.out.println("division = " + division);
        System.out.println("(i/j) = " + (i/j));
        
        float k=10,l=3,div2=k/l;
        float div3=(float) i/(float) j;
        System.out.println("div2 = " + div2);
        System.out.println("div3 = "+div3);

        Scanner scanner=new Scanner(System.in);
        System.out.println("cuál es tu nombre");
        String dato=scanner.next();
        System.out.println("Mi nombre es: "+dato);
    }
}
