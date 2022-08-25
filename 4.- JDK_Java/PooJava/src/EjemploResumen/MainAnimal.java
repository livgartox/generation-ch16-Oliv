package EjemploResumen;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal1=new Animal("perro");
        //System.out.println("animal1 = " + animal1);
        animal1.setEdad(5);
        System.out.println(animal1.getEdad());
        animal1.setRaza("Chihuahua");
        System.out.println("Raza "+animal1.getRaza());
    }
}
