//todo esto es sólo para un kilo
//payaso 112 hasta 8 payasos como máx
//muñeca 75gr hasta 13 muñecas como máximo
let a=[];
for(let i=1;i<=8;i++){
    a=[]
    b=0;
    for(j=1;j<13;j++){
        //aquí pondremos que lo restante debe ser menor a 75 el más chico de esos, es el min
        b=1000-(112*i+75*j);
        if (b<75 && b>=0){
            a.push(b);
        }
        //console.log(i*j)
    }
    console.log(a);
    console.log("min: "+Math.min(a))
}
//tomar al más peque