package ejerciciosTarea;

public class Triangulo {
    private int base;
    private int altura;

    //Constructor
    public Triangulo(){}
    //Constructor 2
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    //Métodos Setter y Getter


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int areaT(){
        int areaTotal=(getBase()*getAltura())/2;
        return areaTotal;
    }
}
