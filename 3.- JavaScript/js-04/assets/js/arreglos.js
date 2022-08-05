//Arreglos
//coleccion de elementos
//Cada elemento ocupa una posición
//esa posición se conoce como indice e inicia en 0
let arr=[1,2,3,4];
console.log(arr);

//propiedades - describen el objeto
//métodos - acciones que puede realizar un objeto
console.log(arr[2]);
arr[4]=190;
arr[4]="Hola";
console.log(arr);

//Métodos de arreglos
//push
//agrega un elemento al final
const arreglo=["hey"];
arreglo.push(2);
console.log(arreglo);
//Unshift
//Agrega un elemento al inicio
arreglo.unshift("aver");
arreglo.unshift("aver")
console.log(arreglo);
//typeof
console.log(typeof(arreglo[3]));
//pop
//Quita el último elemento y lo retorna
quitado=arreglo.pop();
console.log(arreglo);
console.log(quitado);
//shift()
//Quita el primer elemento y lo retorna
console.log(arreglo.shift);
//splice
//Quita un elemento de cualquier elemento
//splice(
//  posición de inicio,
// cantidad de elementos a afectar,
//  elemento/s que queremos insertar)
arreglo.splice(1,0,"uno","dos")
console.log(arreglo);

//Métodos que no modifican al arreglo original
let dato3=arreglo.slice(1,2);
console.log("entender el arreglo",arreglo);
console.log(dato3)
