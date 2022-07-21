/*
se recomienda usar siempre un alert
para hacer la prueba de que esté funcionando
alert("hola")
*/

/*
---------------Operadores aritmeticos-------------
*/

let suma=10+2;
console.log("La suma da: ",suma);

let resta=8-2-1;
console.log("la resta da:",resta);

let multiplicacion=2*5;
console.log("La multiplicación da: ",multiplicacion)

/*
Para truncar los decimales
usa:
nombrevariable.toFixed(cantidad de decimales)
ejemplo
let numero = 9.46789; 
let conDecimal = numero.toFixed(2); // Igual a 9.47

Nota: Convierte a string!!!!!

*/
let division=10/3;
console.log("La división da: ",division.toFixed(2)*1);

let modulo=7%2;
console.log("El modulo da: ",modulo);

let invertido=10;
console.log("El inverso aditivo del número es: ",-invertido);

//Incrementos y decrementos
let edad=23;
edad++;
console.log("La edad de Jona será ",edad);
//si quiero hacer incrementos mayores sigue la estruct
//también funciona en restas, mult y div
// edad+=5
edad+=5;
console.log("La edad de Jona en 6 años será ",edad);

