//------------------CONTROL DE FLUJO----------------
/*
Cuando hay muchas alternativas,
switch-case

El programa se detiene en la condición que cumple, lo demás no lo se ejecuta 
*/

//para ingresar el nombre del usuario
let nombre=prompt("nombre"); //un "=" porque estamos asignando
//parseInt funciona para convertir a número
//aunque el multiplicar por 1, funciona
let edad=parseInt(prompt("ingresa la edad"));
let varexp=prompt("ingresa el número");
console.log(varexp*1);
console.log(typeof(varexp*1));

if(nombre === "Jona"){
    console.log("Admin");
}else if(nombre==="Magali"){
    console.log("Mentora");
}
else{
    console.log("No admin");
}

console.log("Fin del programa")
console.log()