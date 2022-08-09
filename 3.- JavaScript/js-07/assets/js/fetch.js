const url="https://dog.ceo/api/breeds/image/random"
//Respuesta de la petición
fetch(url).then((respuesta)=>{
    console.log(respuesta);
})


//obtener la información de la petición
//FORMA 1
//como la conversión a json demora un poco, me regresará otra promesa Y por ello usamos dos then
fetch(url)
.then((respuesta)=>respuesta.json())
.then ((datos)=>{
    console.log(datos);
}).catch((error)=>{
    console.log(error);
})
//obtener la información de la petición
//-------------------------FORMA 2
async function obtenerPerritoAleatorio(){

    try{
        const respuesta=await fetch(url);
        const datos=await respuesta.json()
        console.log(datos);
        
    }catch(error){
        console.log(error)
    }


}
obtenerPerritoAleatorio()