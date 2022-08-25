public class Main {
    public static void main(String[] args)
    {
        //Creando un objeto
        CuentaBancaria cuentaDeJuan=new CuentaBancaria();
        cuentaDeJuan.titular="Juan Martínez";
        cuentaDeJuan.saldo=2500;
        cuentaDeJuan.tipoDeCuenta="Nomina";

        //cuentaDeJuan.ingresarDinero(500);
        //System.out.printf("Saldo nuevo "+cuentaDeJuan.saldo);

        //Es mala práctica acceder a los valores mediante las variables de instancia
        //por eso:
        System.out.println("Saldo "+cuentaDeJuan.consultarSaldo());
        //Si alguien intenta retirar una cantidad negativa:
        //Como se ve, al poner el if y return para este caso, hace que no se reste nada
        cuentaDeJuan.sacarDinero(-500);
        System.out.println("Saldo de Juan luego de retirar -500 es "+cuentaDeJuan.consultarSaldo());

    }
}