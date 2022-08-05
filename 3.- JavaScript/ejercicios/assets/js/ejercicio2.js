/*usar="*"
usar=usar+"*" //dos
usar=usar+"*" //tres
console.log("hey",usar)
*/
//--------------Idea
/*
Crear una variable que sea igual a "*"
Averiguar hasta donde se va a detener el patrón, ej si es hasta *****
meter a un ciclo iniciado en 1,en uno porque es la punta del patrón
*/
let sizeP=10;
let signo_aUsar="*";
console.log(signo_aUsar)
for (i=2;i<=sizeP;i++){
    signo_aUsar=signo_aUsar+"*";
    console.log(signo_aUsar);
}
//sobre for anidado:
//---------------------------SOLUCIÓN EN CLASE:
for(let i=0;i<5;i++){
    console.log("for principal "+i)
    for (let j=0;j<i;j++){
        console.log("For interno "+j)
    }
}