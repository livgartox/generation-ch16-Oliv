/*
Andrea adelanta a Maria
Jose es descalificado de la carrera
Detrás de Lucia y antes de Roberto se clasifican tres nuevo corredores: Cristobal, Fernanda y Armando
Hay un nuevo concursante que toma el primer puesto: Federico.
*/
let carreritas = ["Lucia", "Roberto", "Maria", "Jesus", "Andrea", "Jose"];
console.log(carreritas);

/* Andrea adelanta a Maria */
carreritas.splice(2,4);

carreritas.push("Andrea");
carreritas.push("Maria");
carreritas.push("Jesus");
carreritas.push("Jose");
console.log(carreritas);

/* Jose es descalificado de la carrera */
carreritas.pop();
console.log(carreritas);

/* Detras de Lucia y antes de Roberto se clasifican tres nuevos corredores: Cristobal, Fernanda y Armando */
carreritas.shift();

carreritas.unshift("Lucia", "Cristobal", "Fernanda", "Armando" );
console.log(carreritas);

/* Hay un nuevo concursante que toma el primer puesto: Federico */
carreritas.unshift("Federico");
console.log(carreritas);
