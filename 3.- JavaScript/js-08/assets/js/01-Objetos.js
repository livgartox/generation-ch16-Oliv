let x=10;
//console.log(x.lenght); //No se puede por como declaramos la variable, no tenemos métodos

//Objeto persona e instanciar sus atributos:
//nombre, apellido, correo y edad

let persona=new Object();
persona.nombre="Olivia";
persona.apellido="García";
persona.correo='olitoxqui@gmail.com';
persona.edad=24;
//console.log(persona)
//console.log(persona['nombre'])

let persona01={
    nombre: 'Juan',
    apellido: 'Hernandez',
    edad: 24,
    email: 'usuario@servidor.com',
    /*nombreCompleto: function(){
        return this.nombre + ' ' +this.apellido;
    }*/
    idioma: 'es',
    get leng (){
        return this.idioma.toUpperCase(); //toUpperCase converte a Mayusc
    },
    set leng (Lang){
        this.idioma=Lang.toLowerCase();
    }
}

persona01.tel='5567348510';
//persona01.tel='5267348510'; //Esto reemplaza al dato anterior
//console.log(persona01.nombreCompleto())
console.log(persona01)

//for-in

for (varPropiedad in persona01){
    console.log(persona01[varPropiedad]);
}
let personaString=JSON.stringify(persona01);
console.log(personaString);
console.log(persona01.idioma)