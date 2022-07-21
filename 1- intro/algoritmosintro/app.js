//---------------------------Comentarios-------------------------------
//para hacer comentarios de una línea

/*
para
comentarios
largos
atajo de teclado: seleccionar todo lo que quiero comentar
shift + alt + a

*/

//---------------Para pop up (ventanas emergentes)-----------------------
//alert("Me salió?");



/*---------------------------variables------------------------------------
let y const se utilizan para CREAR variables aunque de manera diferente,
const es para variables con valor fijo y nuuuunca cambiará
let es para variables que pueden cambiar de valor
*/
let miVariable = "Andrea";
miVariable="Jimena";
//imprimirá Jimena pues es el valor más reciente de esa variable con respecto a esa fila
console.log(miVariable)

const apellido="García";
console.log(miVariable,apellido);

/*------------------------------Tipos de Datos primitivos-------------------
STRING: "cadena_de_texto"
Number: números
Boolean: Booleado (dato lógico;true, falso)
null: ValorNulo
undefined: ausencia de valor; variable declarada sin asignación de valor

Undefined es un estado en el que se encuentra la var
Existen también los datoscompuestos (luego los vemos)
*/

let variableCadena="Variable tipo texto 1";
console.log(variableCadena);

let variableNumber=1234;
variableNumber=variableNumber+5;
console.log(variableNumber);

let verdadero=true;
let falso=false;
console.log("qué está pasando?",verdadero,falso)

let varNull=null;
console.log(varNull);


let varInfef;
console.log(varInfef);


/*para la operación "+";
con números suma
con strings concatena
*/
let a=1;
let b=2;
let c="3";
console.log("sumando",a+b); //dará 3
console.log("concatenando",a+c); //dará 13


/*--------------Operadores
typeof: tipo de dato
*/


let num1=456;
console.log(typeof num1)

let nombre="Pedro"
console.log("Mi nombre es: "+nombre)

let miNombre="Olivia";
let numFav=7;
let TengoMascotas=true;

console.log("Mi nombre es",miNombre+", mi número favorito es",numFav,"y ¿Tengo mascotas?",TengoMascotas)