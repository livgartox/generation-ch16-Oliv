/* URL a consumir*/
const urlPokemon="https://pokeapi.co/api/v2/pokemon/";

/*Elementos del DOM */
const imgPokemon=document.getElementById("img-pokemon");

const idPokemon=document.getElementById("id-pokemon");

const nombrePokemon=document.getElementById("nombre-pokemon");

const listaHabilidades=document.getElementById("lista-habilidades");

const listaTipos=document.getElementById("lista-tipos")

const formulario=document.getElementById("buscador-pokemon")
console.log("hello",formulario);

/* Eventos */
formulario.addEventListener("submit",(e)=>{//submit recarga la página
    e.preventDefault()
    const inputPokemon=document.getElementById("busqueda-pokemon");
    console.log("valor",inputPokemon.value);

    const nuevaBusquedad=urlPokemon+inputPokemon.value
    
    console.log(nuevaBusquedad);
    obtenerPokemon(nuevaBusquedad)
})

/* Funciones */
async function obtenerPokemon(url){
    try {
        const respuesta=await fetch(url)
    const datos=await respuesta.json()
    const pokemon={
        nombre: datos.forms[0].name,
        habilidades:datos.abilities,
        id:datos.id,
        tipos:datos.types,
        imagen:datos.sprites.other["official-artwork"].front_default
    }

    //imagen, nombre y id
    //console.log(pokemon.imagen)
    imgPokemon.src=pokemon.imagen;
    idPokemon.textContent=`ID: ${pokemon.id}`;
    nombrePokemon.textContent=pokemon.nombre;

    //Habilidades
    template=``;
    for(let i=0;i<pokemon.habilidades.length;i++){
        const nombreHabilidad=pokemon.habilidades[i].ability.name;

        template+=`<li class="list-group-item">${nombreHabilidad}</li>`;
        
    }
    listaHabilidades.innerHTML=template;



    //TIPOS
    let templateTipos='';
    //console.log("otro",pokemon.tipos)
    pokemon.tipos.forEach((tipo)=>{
        const nombreTipo=tipo.type.name
        console.log(tipo.type.name);
        templateTipos+=`<li class="list-group-item">${nombreTipo}</li>`;
    })
    listaTipos.innerHTML=templateTipos;
    } catch (error) {
        alert("pokemon no valido")
    }
    
}

//obtenerPokemon(urlPokemon)