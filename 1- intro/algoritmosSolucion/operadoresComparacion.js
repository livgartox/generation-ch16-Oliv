//alert("prueba diaria");

/*
Caso igual (==); no sensible a tipo de dato y otros casos
vs
Estrictamente igual (===): sensible a todo

Ejemplo:
5=="5" --> da verdadero
5==="5" --> da falso, por el tipo de dato

Se debe tener especial cuidado con el operador de igualdad (==), 
El operador == se utiliza para comparar el valor de dos variables, 
el operador = se utiliza para asignar un valor a una variable:


*/

//Igualdad
console.log("Igualdad")
console.log(5=="5");
console.log(5==="5");

//Desigualdad
console.log("Desigualdad")
console.log(5 != "5"); //Desigual
console.log(5 !== "5"); //estrc-ictamente desigual

//Mayor
console.log("Mayor");
console.log(10>5);


//Menor 
console.log("Menor");
console.log(5<7);

//Comparaciones en cadena:
//usa el código asci
//las mayusc están antes que las min
console.log("Comp en cadenas");
console.log("a es menor que b? ","a"<"b");
console.log("A es menor que a? ","A"<"a");