`use strict`
function miFuncion(a,b){
    return (a+b);
}
let resultado=miFuncion(1,2);
console.log(resultado);

//----------Función expresión-----------
//funciones anónimas: porque no tiene nombre
let suma=function (a,b){
    return (a+b)
};
let res=suma(2,3);
console.log("La suma es: "+res);




//-----------------------resta
let resta=function (a,b){return [(a-b),a,b]};
let res2=resta(2,3);
console.log("La resta "+res2[1]+" - "+res2[2]+" da como resultado "+res2[0]);

//------------------------------Multiplicación
let mult=function (a,b){return [(a*b),a,b]};
let res3=mult(2,3);
console.log("La multiplicación de "+res3[1]+" x "+res3[2]+" da como resultado "+res3[0]);

//------------------------------------------------------División
let div=function (a,b){
    if (b==0){
        return ["no se puede dividir",a,b]
    }
    return [(a/b).toFixed(2),a,b]};
let res4=div(10,3);
console.log("El resultado de dividir "+res4[1]+" / "+res4[2]+" da como resultado "+res4[0]);

//---------------Función autoinvocable
//self Invoking
//no es reutilizable; sólo se llama a sí misma una vez.
//Se usa sobretodo para no consumir tanta memoría

(function (a, b){
    console.log("El resultado de Self Invoking es: "+(a+b));
})(3,4)
