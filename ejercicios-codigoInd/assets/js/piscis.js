/*
Crea un programa que emule las funciones de un cajero automático.

Considera lo siguiente:

El cajero solo cuenta con $10,000 de saldo.
Cada transacción se descontará del saldo del cajero.
Se debe tener una función para consultar el saldo del cajero
*/
let saldoCajero=10000;
let retiro=0;
accion="si"
while (accion==="si"){
    let accion=prompt("Presione 1 para consultar saldo, 2 para retirar");
    if (accion==1){
        consultaSaldo()
    }else if (accion==2){
        retiroCajero()
    }else{
        alert("No entendemos");
    }
    accion=prompt("Desea realizar alguna otra operación")
}
alert("Gracias")


function consultaSaldo(){
    saldoCajero=saldoCajero-retiro;
    console.log(saldoCajero);
    console.log(saldoCajero);
}
console.log(consultaSaldo(saldoCajero))
function retiroCajero(){
    let quiereretirar=prompt("Cuánto quiere retirar?");
    if (quiereretirar>saldoCajero){
        console.log("Fondos Insuficientes")
    }else{
        retiro=quiereretirar;
        console.log("Retiro con exito")
    }
}
retiroCajero();

