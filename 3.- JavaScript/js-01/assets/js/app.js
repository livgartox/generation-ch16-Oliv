let cadena="hola";
console.log(cadena);
let numero=13;
console.log(numero)
let boolean1=true;
console.log(boolean1);
//tratar de realizar alguna operación aritmética con algún dato que no es un número

/* Plantillas literales
      template strings
      literal strings
      interpolación
*/
// console.log(`Esta es una cadena ${5 + 4}`);
// console.log("Esta es una cadena normal ${5+4}");

let nombre = 'Raul';

// let presentacion = ``;
/* console.log("Mi nombre es " + nombre);
console.log(`Yo me llamo ${nombre}`);


console.log("<h1>Hola</h1>");
console.log(`<h1>Hola</h1>`); */

//Arreglos
//Forma 1 de declarar un arreglo
let arr=[1,"a",null,undefined,[true,false]];
//console.log(arr);
//console.log(arr[4][0]);

//Forma 2 de declarar un arreglo
let arr2=new Array();

//-------------Objetos---------
const persona={
    nombre: "Raúl",
    //fijate si pasa algo al no poner el espacio
    edad:12,
    hobbies:["Leer","Ver shrek","Comer"],
    auto: {
        marca: "VW",
        modelo: "Pointer",
        year:2000,
    },
    saludar: function(){
        return "Hola"
    }
}
//Notación de punto
console.log(`Mi hobbie es ${persona.hobbies[1]}`);
//imprimir elemento del arreglo dentro del objeto
console.log(`La marca de mi auto es ${persona.auto.marca}`)
//imprimir la función dentro del arreglo
console.log(persona.saludar());