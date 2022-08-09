const num=10
console.log(num);

console.log(2);
setTimeout( ()=>{
    console.log("Hola");
},2000)

//para que lo demás se ejecute después
console.log(3);

setTimeout(()=>{
    console.log("Adiós");
},0)
console.log(4);

for(let i=0; i<100;i++){
    console.log("Estoy procesando")
}

console.log(5);
