/*
Declara un array llamado carreritas con los siguiente valores: Lucia, Roberto, Maria, Jesus, Andrea y Jose (este será el orden de sus posiciones dentro de una carrera).
Deberás imprimir en consola la clasificación actual.

La carrera continua y se van modificando esas posiciones:
Andrea adelanta a Maria
Jose es descalificado de la carrera
Detrás de Lucia y antes de Roberto se clasifican tres nuevo corredores: Cristobal, Fernanda y Armando
Hay un nuevo concursante que toma el primer puesto: Federico.

Imprime en consola la clasificación final con las posiciones que se han modificado.
*/
let carreritas=["Lucia", "Roberto", "Maria", "Jesus", "Andrea", "Jose"];
console.log(carreritas);
//Andrea adelanta a Maria
carreritas.splice(4,1);
carreritas.splice(2,0,"Andrea");
//Jose es descalificado de la carrera
carreritas.pop()
//Detrás de Lucia y antes de Roberto se clasifican tres nuevo corredores: Cristobal, Fernanda y Armando
carreritas.shift()
carreritas.unshift("Lucia","Cristobal","Fernanda","Armando");
//Hay un nuevo concursante que toma el primer puesto: Federico.
carreritas.unshift("Federico");
console.log(carreritas);

