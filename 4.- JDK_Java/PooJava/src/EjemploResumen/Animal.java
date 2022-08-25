package EjemploResumen;

public class Animal {
    private String raza;
    //En el archivo viene que entero
    private String nombre;
    private int edad;

    public Animal(){};

    public Animal(String nuevonombre){
        nombre=nuevonombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

}
