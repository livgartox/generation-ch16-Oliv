/* const array=[1,2,3,4,5]
console.log(array.length);

console.log(mensaje[mensaje.length-1]);
const cadena='parangaricutirimicuaro';

const otraCadena='hola'
console.log(otraCadena.split('o').length-1)

function contador(cadena,valor){
    return cadena.split(valor).length-1
} */
let cadena='paranga';
let caracter="a";
let enumerar=(cadena,caracter)=>cadena.split(caracter).length-1;
console.log(enumerar(cadena,caracter))