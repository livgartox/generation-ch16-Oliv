const personas = ["Maria", "Dani", "Luis", "Juan", "Camila"];

//Escribe un comando para remover a "Dani" del arreglo
let remDani=personas.splice(1,1);
console.log(personas);
//splice también sirve para reemplazar
//remDani=personas.splice(1,1,"Beto")

//Escribe un comando para remover a "Juan del arreglo"
let remJuan=personas.splice(-1,1);
console.log("ejercicio duda",personas);
//Escribe un comando para agregar a "Luis" al inicio del arreglo
let addLuis=personas.unshift(personas.splice(1,1)[0]);
console.log("moviendo posisiciones",personas);
//Escribe el comando para agregar tu nombre al final del arreglo
let addnombre=personas.push("Maria");
console.log(personas);
//Escribe el comando para mostrar la posición de "Maria"
console.log(personas.indexOf("Maria"))
//Escribe el comando para mostrar la posición de tu nombre
console.log(personas.indexOf("Equipo 1"))

//también puedes usar valores negativos para las posiciones
let a=[1,2,3,4,5];
let rem2=a.splice(-2,2);
console.log("hey intento 2",a);

//arreglo muntidimensional
const newArr = [1,45,"Hola","Adiós",true,null,[1,2,3,4],["Azul", "Amarillo","rojo"]];

console.log(newArr[6][1]);
console.log(newArr[7][1]);

//-----------------------Objetos--------------------
//objetos
//estructura especial llamada objeto
//nos permiten guardar PARES de valores
// key=value (valor)

const obj={ 
    nombre : "Pedro",
    edad : 25,
    color : "Azul",
    hobbies : ["Leer","Cantar","Bailar"]
};

console.log("imprimiendo objetos",obj.hobbies[2]);