/*let texto="hoy parece que va a salir el sol";
let buscar=/sol/;
console.log(buscar.test(texto));

let texto01="la espero en el aeropuesto de LA";
let buscar01=/LA/;
console.log(buscar01.test(texto01));
*/
//Los corchetes buscan alguna de las "letras" que están
let texto02="Te marqué anoche";
let buscar=/[eo]/;
console.log(buscar.test(texto02))

let texto03="a=4.567";
let buscar03=/[aeiou]/;
console.log(buscar03.test(texto03))

let texto04="o=9";
let buscar04=/[1-5]/;
console.log(buscar04.test(texto04))

let texto05="los números primos son 2 3 5 7 dentro de los 10 primeros números";
let buscar05=/\d{3}/
console.log("busqueda más puntual ",buscar05.test(texto05))

let texto06="usuario@servidor.com"
let buscar06=/[\w]+@{1}[w]+\.[a-z]{2,3}/;