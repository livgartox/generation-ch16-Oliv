/*
Crea una calculadora para convertir un valor ingresado por el usuario a grados Celsius, Fahrenheit y Kelvin.

Considera:

Solicitar el valor por medio de un prompt
Crear funciones para realizar los cálculos
Mostrar los resultados mediante alertas
*/
/*
Crea una calculadora para convertir un valor ingresado por el usuario a grados Celsius, Fahrenheit y Kelvin.

Considera:

Solicitar el valor por medio de un prompt
Crear funciones para realizar los cálculos
Mostrar los resultados mediante alertas

*/

/* Crea una calculadora para convertir un valor ingresado por el usuario a grados Celsius, Fahrenheit y Kelvin.

Considera:

Solicitar el valor por medio de un prompt
Crear funciones para realizar los cálculos
Mostrar los resultados mediante alertas
 */

let grados = parseFloat(prompt("Ingresa los grados: "));
let medicion = parseInt (prompt("Selecciona 1 para Celsius. \n Selecciona 2 para Fahrenheit. \n Selecciona 3 para Kelvin."))

switch(medicion){
    case 1:
        function gCelsius(grados) {
            f= (1.8*grados)+32;
            k= grados + 273.15;
            alert("La conversión a farenheit es "+f+" a kelvin "+k);
        }
        gCelsius(grados)
        break
    case 2: 
        function gFahrenheit(grados) {
            c= (grados - 32) * (5/9)
            k= (grados - 32) * (5/9) + 273.16
            alert("La conversión a celcius es "+c+" a kelvin "+k);
        
        }  
        gFahrenheit(grados)
        break
    
    case 3:
        function gKelvin(grados) {
            f= (1.8*(grados/273.15)) * 32
            c= grados - 273.15
            alert("La conversión a farenheit es "+f+" a celcius "+c);
        }
        gKelvin(grados)
        break

    default:
        alert("opción no disponible")
}
