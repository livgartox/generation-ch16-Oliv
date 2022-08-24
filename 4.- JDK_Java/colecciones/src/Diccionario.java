import java.util.*;

public class Diccionario {
    public static void main(String[] args) {
        /*
         *  Crear una clase llamada Diccionario
         *  Crear un programa en Java que realice lo siguiente:
         *  Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
         *  Utilizar un objeto HashMap para almacenar los pares de palabras.
         *  Escoger al azar 5 palabras del mini diccionario.
         *  Pedir al usuario que teclee la palabra en inglés y que se imprima la traducción
         *
         *
         *
         * Extra:
         *  Pedir al usuario que teclee la traducción al inglés de cada una de las palabras y comprobará si son correctas.
         *  Al final debe mostrar por consola cuántas respuestas correctas e incorrectas tiene el usuario.
         * */
        //-----------------------------------------------------------------------
        //1.- Crear un HashMap con 20 palabras
        //2.- Convertir a array las llaves y luego con Random seleccionar algunas posiciones aleatorias
        //2.5.- Mostrar en pantalla las aleatorias que seleccionó el sistema
        //3.- Pedir al usuario con Scanner la palabra en inglés (será la valor)

        Map<String,String> diccionario = new HashMap<>();
        diccionario.put("door", "puerta");
        diccionario.put("body", "cuerpo");
        diccionario.put("house", "casa");
        diccionario.put("dog", "perro");
        diccionario.put("think","pensar");
        diccionario.put("see", "ver");
        diccionario.put("people", "gente");
        diccionario.put("time", "tiempo");
        diccionario.put("up","arriba");
        diccionario.put("but","pero");
        diccionario.put("all", "todo");
        diccionario.put("sister", "hermana");
        diccionario.put("dragon", "dragon");
        diccionario.put("have", "tener");
        diccionario.put("year","año");
        diccionario.put("work", "trabajo");
        diccionario.put("new", "nuevo");
        diccionario.put("clock", "reloj");
        diccionario.put("day","día");
        diccionario.put("chair","silla");

        //Seleccionar 5

        System.out.println(diccionario);


        System.out.println("Seleccione alguna de estas palabras para conocer si significado:");
        for(int i=1;i<=5;i++){
            Random rd = new Random();
            int numeroAleatorio = rd.nextInt(20);
            Object palabraAleatoria=diccionario.keySet().toArray()[numeroAleatorio];
            System.out.println(palabraAleatoria);
        }
        System.out.println("Ingrese la palabra en inglés");
        Scanner sc=new Scanner(System.in);
        String palabraBuscada = sc.nextLine();
        String palabraMeaning=diccionario.get(palabraBuscada);
        System.out.println(palabraMeaning);










    }
}
