//crear un elemento
const imagen=document.createElement("img");
console.log(imagen);

//modificar los atributos html del elemento
imagen.src = 'https://placeimg.com/200/200/animals'
imagen.alt='Imágenes aleatorias de animales';

//Lo insertamos en un elemento Padre
document.body.appendChild(imagen);
document.body.insertAdjacentElement("afterbegin",imagen);
document.body.insertAdjacentElement("afterend",imagen);
document.body.insertAdjacentElement("afterend",imagen);
document.body.insertAdjacentElement("beforebegin",imagen);
document.body.insertAdjacentElement("beforeend",imagen);

//  FORMA CORRECTA
//1.- se crea el elemento que contendrá la imagen
//2.- seleccionar el elemento padre
const padreImg=document.getElementById('padreImg') //no es necesario que se llame igual que el id

//3.- crear el elemento
const imagen2=document.createElement('img');

//4.- modificamos los atributos del elemento
imagen2.src='https://placeimg.com/200/200/nature'
imagen.alt="imagenes de naturaleza"

//5.- insertar elemento
padreImg.appendChild(imagen2);

//Utilizar forEach para pintar datos
const frutas=["Toronja","Manzana","Mandarina","Limón","Granada","Melón"];
const listaFrutas= document.getElementById('frutas');
//forma 1
/*frutas.forEach((element) => {
    const li= document.createElement('li');
    li.textContent = element
    listaFrutas.appendChild(li);
})
*/

//forma 2
frutas.forEach((el)=>{
    listaFrutas.innerHTML +=`<li>${el}</li>  `

})

