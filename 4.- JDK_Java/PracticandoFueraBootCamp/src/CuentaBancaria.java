public class CuentaBancaria {
    String titular;
    String tipoDeCuenta;
    double saldo;

    //métodos
    void sacarDinero(double cantidad){
        if (cantidad<0){
            return;
        }
        saldo-=cantidad;
    }
    void ingresarDinero(double cantidad){
        if (cantidad<0){
            return;
        }
        saldo+=cantidad;
    }
    void cambioTipoCuenta(String nuevoTipo){
        tipoDeCuenta=nuevoTipo;
    }

    double consultarSaldo(){
        return saldo;
    }
}
