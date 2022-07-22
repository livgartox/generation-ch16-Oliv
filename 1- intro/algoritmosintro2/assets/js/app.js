function saludar(){
    console.log("hola mundo");
}

//saludar();

//--------------------Arreglos-----------------
//manera uno para crear arreglos:
let num=[];
console.log(num);

//manera dos para crear arreglos
let arr1=new Array();
console.log(arr1);

//para estructuras de números complejas, se suele usar const
//es posible hacer modificaciones
//porque el arreglo siempre será un arreglo
const arr=[1,2,3,4]
//notación corchetes
//acceder a un elemento
console.log(arr[3]);
//agregar valores
arr[6]=4
console.log(arr);

//si agregamos elementos en una posición muy por delante de la última
arr[10]=12;
console.log(10);

//Propiedades de los arreglos
//descripción de nuestro arreglo
console.log(arr.length);

//Métodos
//acciones que puede realizar un arreglo
const frutas=["Manzana", "platano"];
console.log(frutas);
console.log(frutas.length);

//push()
//permite agregar un valor al arreglo
frutas.push("pera");
console.log(frutas);

//pop()
//quita un elemento del final del arreglo

let elementoBorrado=frutas.pop();
console.log(frutas);
console.log(elementoBorrado);

//unshift()
//agrega un elemento al inicio del arreglo
frutas.unshift("Fresa","Platano");
console.log(frutas);
console.log("hey",getBoundingClientRect());