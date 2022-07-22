/*function sueldo(nombre,sueldo){
    console.log("El usuario",nombre);
    console.log("a la semana gana",sueldo*7);
    console.log("a la semana gana",sueldo*30);

}
let nombre=prompt("Ingrese su nombre");
let sueldodado=prompt("cuánto gana al día?");
sueldo(nombre,sueldodado);
*/


//calculadora de porcentajes
function calculadoraPorcentaje(numero,porcentaje){
    let result=numero*porcentaje; //local
    return {numero,porcentaje,result};
}
let resultado=calculadoraPorcentaje(100,0.4);
console.log("resultado tomando el return",resultado.result);