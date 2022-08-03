//Funciones como objetos
function miFuncion (a,b){
    let res=0;
    res=(a*b);
    return(res);
}
console.log("hello",typeof miFuncion);
var miFuncionTexto=miFuncion.toString();
//Para ver la función y su structura
console.log(miFuncionTexto);