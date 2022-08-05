/*
Crea un programa que emule las funciones de un cajero automático.

Considera lo siguiente:

El cajero solo cuenta con $10,000 de saldo.
Cada transacción se descontará del saldo del cajero.
Se debe tener una función para consultar el saldo del cajero
*/
let saldoC=10000;
let retirado=0;
let quiereretirar; //es lo que quiere pero quizá no se de
let accion=Number(prompt("Qué desea realizar, press 1 para retirar, 2 para consultar"))
//accion=prompt("Seleccione 1 para consultar, 2 pa retirar")
function retirar(saldoC,retirado){
    quiereretirar=prompt("Cuánto");
    if (quiereretirar<=saldoC){
        retirado=quiereretirar;
        saldoC=saldoC-retirado;
        return saldoC;
    }else{
        alert("error");
        return saldoC;
    }
}

while (accion==1 || accion==2){
    if (accion==1){
        retirar(saldoC,retirado)
    }else{
        console.log("El saldo es",saldoC)
    }
    accion=Number(prompt("Qué desea realizar, press 1 para retirar, 2 para consultar"))
}

/*
saldoC=retirar(saldoC,retirado);
console.log(saldoC);
saldoC=retirar(saldoC,retirado);
console.log(saldoC);

saldoC=retirar(saldoC,retirado);
console.log(saldoC);
saldoC=retirar(saldoC,retirado);
console.log(saldoC);

*/