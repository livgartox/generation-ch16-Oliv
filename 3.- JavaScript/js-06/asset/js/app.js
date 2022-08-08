//Estamos modificando la copia más no lo original

//console.log(document.URL);
//getElementById()

console.log(document.getElementById("parrafo1").textContent);
const parrafo1=document.getElementById("parrafo1");
parrafo1.textContent="Hola desde el párrafo 1"; //se reemplaza el contenido por eso
console.log(parrafo1.textContent);

console.log(parrafo1.style);
parrafo1.style.color="red";
parrafo1.style.backgroundColor="yellow"

//querySelector()
//usa esta misma sintaxys, más unas comillas
//etiqueta=p
//clase=.parrafo
//id=#parrafo
const parrafo2=document.querySelector(".parrafo");
console.log(parrafo2.textContent);
parrafo2.textContent +="\n\n\n \tModificando el contenido de Javascript";
parrafo2.style.backgroundColor="pink";
console.log(parrafo2.textContent);

// \n Inserta un salto de línea === <br>
// \t Inserta una tabulación

//querySelectorAll()
//Lista de nodos
const parrafos=document.querySelectorAll('p');
//funciona parecido a los arreglos
console.log(parrafos[2])

parrafos[2].style.fontSize="2rem";

//css - font-size
//js - fontsize   -- Lower camel case

//Modificar los atributos de html
const enlace=document.getElementById("enlace");
console.log(enlace.href);

enlace.href="https://www.youtube.com/";
enlace.target="_blank";
enlace.textContent='Enlace de Youtube';

/*Reemplazar contenido */
const parrafo4=document.getElementById("parrafo4")

console.log(parrafo4.nodeName);
console.log(parrafo4.textContent);
console.log(parrafo4.innerHTML);//innerHTML: Muestra el html que haya en el interior del elemento
console.log(parrafo4.outerHTML);//muestra el contenido de html, incluyendo al elemento

//Reemplaza el contenido del elemento
//parrafo4.innerHTML='<a href="http://google.com">Enlace que agregué desde js</a>'

//Reemplaza el elemento completo
//parrafo4.outerHTML='<a href="http://google.com">Enlace que agregué desde js</a>'

//parrafo4.innerHTML="este es un texto normal";
//parrafo4.innerHTML='<div class="elemento">Este es un div</div>';

//parrafo4.outerHTML='<div class="elemento">Este es un div</div>';

//JS permite modificar las clases css
//utilizando style
console.log(parrafo4.classList.contains("elemento"));
parrafo4.classList.add('elemento');
const cambiarColor=()=>{
    parrafo4.classList.toggle('elemento')//toggle permite agregar si el elemento no tiene eso, quitar si ya lo tiene
}
cambiarColor(); //se quita la clase (si la tuviera ya)
cambiarColor(); //se agrega la clase (si no la tuviera )
