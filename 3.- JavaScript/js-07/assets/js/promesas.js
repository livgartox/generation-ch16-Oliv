//variable que simula los datos pedidos
const saludo="Hola mundo"
const datos=[
    {
        nombre: "Jonathan",
        apellido: "Vazquez",
    },
    {
        nombre: "Jonathan",
        apellido: "Vazquez",
    },
    {
        nombre: "Jonathan",
        apellido: "Vazquez",
    }
]
//función para simular una petición
function obtenerDatos(){
    //resolve == regresa el resultado exitoso
    //reject == lo que te hizo tu ex (rechazar)

    return new Promise( (resolve, reject) => {
        setTimeout( ()=>{
            if(false){
                resolve(datos);
            }else{
                reject("Nunca te quiso")
            }
        }, 2000)
    })
}
//pues la promesa regresa un objeto, que se debe procesar
//Las siguientes formas son para darle seguimiento a la promesa y que me devuelva lo que quiero
//Forma 1
obtenerDatos().then( (datos)=>{
    console.log("forma 1")
    console.log(datos)
}).catch( (error)=>{
    console.log("existe un error en la petición 1")
    console.log(error);
})

//Forma #2 -funciones asincronas -await async
async function funcionAsincrona(){

    try{
        const datos= await obtenerDatos();//sólo me retorna una promesa
        console.log(datos)

    }catch(error){
        console.log(error)

    }
}

funcionAsincrona()