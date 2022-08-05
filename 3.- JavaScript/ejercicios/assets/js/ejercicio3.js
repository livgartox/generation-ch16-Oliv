/*
– Repeatedly print the value of the variable xValue, decreasing it by 0.5 each time,
as long as xValue remains positive.
- Print all the odd numbers between 1 - 100.
- Write a method with a while loop to print 1 through n in square brackets. 
For example, if n = 6 print [1] [2] [3] [4] [5] [6]
- Write a method with a while loop that computes the sum of first n positive integers: 
sum = 1 + 2 + 3 + … + n
Examples:
n = 5 sum = 15
n = 19 sum = 190
*/

//------------------------------------1
/*
let xValue=Number(prompt("Ingrese el núm"));
while (xValue>0){
    console.log(xValue);
    xValue=xValue-0.5;
}
*/
//-------------------------2
/*
console.log("Segundo código")
let tipo;
for(let i=1;i<=100;i++){
    if (i%2==0){
        console.log(i);
    }
}
*/
//---------------------------------------3
/*let arrNumbers=[];
n=Number(prompt("Ingrese n"));
for (let j=1;j<=n;j++){
    arrNumbers.push(j);
}
console.log(arrNumbers);
//----------------------------------------------4
let suma=0;
n=Number(prompt("Ingrese n"));
for (let j=1;j<=n;j++){
    suma=suma+j;
}
console.log(suma)
*/
//----------------------------------------tres correcto
let suma2="";
n=Number(prompt("Ingrese n"));
for (let j=1;j<=n;j++){
    suma2=suma2+"["+j+"]";
}
console.log(suma2);