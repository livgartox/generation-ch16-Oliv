import java.util.HashSet;
import java.util.Set;
public class Colecciones2 {
    public static void main(String[] args) {
        //SET
        //HashSet
        //No guardan los valores en el orden en el que se van agregando
        //SET no permite elementos duplicados
        //Colección que funciona más rápido
        Set<String> miSet=new HashSet<>();
        miSet.add("Juan");
        miSet.add("Arturo");
        miSet.add("Daniel");
        miSet.add("Daniel");
        miSet.remove("Felipe");
        System.out.println(miSet);

        System.out.println(miSet);
        System.out.println(miSet.size());
        System.out.println(miSet.contains("Juan"));

        for (String nombre : miSet ){
            System.out.println(nombre);

        }
    }
}
