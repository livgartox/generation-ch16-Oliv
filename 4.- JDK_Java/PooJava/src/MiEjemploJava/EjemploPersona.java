package MiEjemploJava;

public class EjemploPersona {
    public static void main(String[] args) {
        //Lo borrado es de cuando nada era privado
        //Persona p=new Persona("Juan",23,2345);//Constructor
        //System.out.println(p.edad);//como la edad es public, puedo acceder a ella


        //En la otra hoja tenemos un constructor vacío, lo cual nos permite hacer esto:
        Persona p=new Persona();
        //Para agregar los valores usamos el set
        p.setNombre("Adriana");
        p.setEdad(22);
        p.setNss(3456);
        System.out.println("Nombre "+p.getNombre());
        System.out.println("Edad "+p.getEdad());
        System.out.println("Nss "+p.getNss());
    }
}
