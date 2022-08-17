function calcularFactorial(num){
    return (num===0)?1:num*calcularFactorial(num-1)
}
console.log(calcularFactorial(4));