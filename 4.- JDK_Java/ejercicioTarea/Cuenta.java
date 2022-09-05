public class Cuenta {
    float saldo;
    int numConsignaciones=0;
    int numeroRetiros=0;
    //es en %
    float tasaAnual;
    float comisionMensual=0;
    float cantidad;
    //Constructor
    public Cuenta(){}

    public Cuenta(float saldo, float tasaAnual, float cantidad) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
        this.cantidad = cantidad;
    }

    //metodos
    public float consignar(){
        saldo+=cantidad;
        return saldo;
    }
    public float retirar(){
        if (saldo>cantidad){
            saldo-=cantidad;
            return saldo;
        }else {
            System.out.println("Saldo insuficiente");
            return saldo;
        }
    }
}
