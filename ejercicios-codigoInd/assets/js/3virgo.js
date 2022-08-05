/*Una juguetería tiene mucho éxito en dos productos: payasos y muñecas. Suele hacer venta por  correo y la empresa de logística les cobra por paquete, así que deben calcular el peso de los paquetes que se enviaran. Cada payaso pesa 112 gramos y cada muñeca 75 gramos.

Escribe un programa que lea el número de payasos y muñecas vendidos y calcula el peso total del pedido que será enviado, considerando que el peso máximo del paquete es de 1kg.

Muestra en alertas el peso total por cada artículo
Muestra en alertas cuántos paquetes se enviaran 
*/


let cantPayasos=prompt("Ingresa la cantidad de payasos vendidos");
let cantDolls=prompt("Ingresa la cantidad de muñecas vendidos");
// 1 payaso pesa 112gr
let pesoTotalPayasos=112*cantPayasos;
// 1 muñeca pesa 75gr
let pesoTotalDolls=75*cantDolls;
let pesoTotal=pesoTotalDolls+pesoTotalPayasos;
// 1 kg tiene 1000gr
let cantPaquetes=Math.ceil(pesoTotal/1000);

//1 paquete puede tener cómo máximo 8 payasos
//1 paquete puede tener como máximo 13 muñecas

//la ecuación que debe satisfacer es:
//min 112x+75y<=1000z, x,y,z enteros >=0, x es cant de payasos, y cant de dolls
//Falta mínimizar esto

