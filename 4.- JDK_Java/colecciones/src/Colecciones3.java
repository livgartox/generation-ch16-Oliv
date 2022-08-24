import java.util.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Arrays;

public class Colecciones3 {
    public static void main(String[] args) {
        //int --> Integer
        //char --> Character
        //float --> Float
        //double --> Double

        System.out.println("ArrayList");
        List<String> comidas = new ArrayList<String>();
        comidas.add("Pozole");
        comidas.add("Tostadas");
        comidas.add("Ceviche");
        comidas.add(2, "Esquite");
        System.out.println(comidas);

        List<Integer> numeros = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 56, 789));
        System.out.println(numeros);

        System.out.println("----------------");
        System.out.println("HashSet");

        Set<String> ciudades = new HashSet<>();
        ciudades.add("CDMX");
        ciudades.add("GDL");
        ciudades.add("MTY");
        System.out.println(ciudades);

        //Otra forma de crear un HashSet
        Set<Boolean> verdad = new HashSet<Boolean>(Arrays.asList(true, false, false, true));
        System.out.println(verdad);


        System.out.println("------------");
        System.out.println("HashMap");
        //Permite guardar pares de valores
        //llave:valor
        //HashMap <Llave, Valor>
        //Los acomoda de acuerdo a la llave
        Map<Integer, String> alumnos = new HashMap<Integer, String>();
        alumnos.put(1, "Pedro Lopez");
        alumnos.put(2, "Sofia");
        alumnos.put(3, "Salma");
        alumnos.put(4, "Miguel");
        alumnos.put(4, "Miguel");//Lo va a ignorar porque está repetido
        alumnos.put(5, "Miguel");//Aunque tenga el mismo valor, al se rla llave diferente, a´si lo deja
        alumnos.put(5, "Miguel reemplazado");//Se reemplaza este valor por el de arriba
        alumnos.put(0, "Adriana");


        System.out.println(alumnos);
        System.out.println("Tamaño " + alumnos.size());
        System.out.println("Valores: " + alumnos.values());//Lista sólo de los valores
        System.out.println("Llaves " + alumnos.keySet());//Lista sólo de las llaves
        System.out.println(alumnos.get(2));//dentro del get va el nombre de la llave
        //Cuándo no sabemos qué tipo de dato es, preferentemente que no sea primitivo
        Object llaves=alumnos.keySet().toArray();//
        System.out.println(llaves);
        Object llavesValor=alumnos.keySet().toArray()[3];//Para ir a un elemento
        System.out.println(llavesValor);
        System.out.println(alumnos.get(llavesValor));

        for(int i=0;i<alumnos.size();i++){
            Object llaves2=alumnos.keySet().toArray()[i];
            System.out.println(alumnos.get(llaves2));
        }

        for(Integer llave: alumnos.keySet()){
            System.out.println(llave+"-"+alumnos.get(llave));
        }


    }
}
