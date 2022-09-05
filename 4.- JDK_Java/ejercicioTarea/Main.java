public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1=new Cuenta(2500f, 0.15f,3000f);
        System.out.println(cuenta1.consignar());
        System.out.println("cuenta1.retirar() = " + cuenta1.retirar());

    }
}
