import java.util.ArrayList;
import java.util.List;


public class Colecciones {
    public static void main(String[] args) {
        //List -- ArrayList
        //Los valores se ordenan según el orden en que los agreguemos
        // Permiten tener valores duplicados
        //Es una colección de valores/objetos
        
        List<String> meses=new ArrayList<String>();
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Mayo");
        meses.add("Abril");
        meses.add(1,"Mitad de enero");
        String mes=meses.remove(4);

        System.out.println(mes);
        System.out.println(meses.get(0));//funciona para las posiciones
        System.out.println("meses = " + meses);
        System.out.println(meses.size());

        System.out.println("Recorrer cada elemento de la lista");
        for(String elemento:meses){
            System.out.println(elemento);
        }

        //List<int> numeros=new ArrayList<int>(); No se puede hacer así
        //por eso usamos:
        //clases envolventes o wrapper: Permite guardar valores primitivos
        int num1=10;
        Integer num2=10;
        System.out.println(num1+10);
        System.out.println(num2-5);
        System.out.println(num2.getClass().getSimpleName());

        List<Integer>numeros=new ArrayList<Integer>();
        numeros.add(2);
        numeros.add(500);
        numeros.add(200);
        System.out.println(numeros);


    }
}
