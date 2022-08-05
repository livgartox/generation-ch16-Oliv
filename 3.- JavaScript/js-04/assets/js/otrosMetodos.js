//sort()
//ordenar los elementos de un arreglo

const arr=["X","A","H","a","W","b"];
console.log(arr);
arr.sort();
console.log(arr);
const arr2 = ["Hola", "adiós", "bienvenido", "Calle"];
console.log(arr2.sort())
console.log("con números")
const arr3=[3,5,589,2,8,500,300,-1,-300,"x","a"];
arr3.sort()
arr3.sort((a,b)=>a-b);
console.log(arr3);

//forEach()
//ciclo que recorre en automatico todo nuestro arreglo
//sólo puede recibir 3 parametros
//La ventaja de este tipo de bucles es que el código es mucho más mantenible ya que no tienes que declarar contadores todo el rato, sobre todo si es para recorrer arrays y listas

const arrNumeros=[1,4,6,8,10]
for (let i=0;i<=arrNumeros.length-1;i++){
    arrNumeros[i]=arrNumeros[i]*2
}
console.log(arrNumeros);
arrNumeros.forEach((elemento,index)=>console.log(elemento,index,arr));
//for each(elemento, indice, arreglo completo)
//hace lo mismo que hicimos con el for
console.log("x2 más corto")
arrNumeros.forEach((elemento)=>console.log(elemento*=2)
)//
/*
//función declarada
//hace hoisting: Proceso de reacomodo automático del código; hace que pueda llamar este tipo de funciones antes de hacer la declaración
let a=5;
console.log(a);

//función expresada
//hoisting no funciona i.e no se puede llamar antes de declararla
const multiplicar=function(a,b){
    return (a*b);
}
//funciones flecha
const dividir1=(a,b)=>{
    return a/b
}
const dividir = (a,b) => a/b;
*/