class Persona{
    constructor(nombre, apellido){
        this._nombre=nombre;
        this._apellido=apellido;
    }
    get nombre(){
        return this._nombre+' '+this._apellido//el _ es para volverlo público, ya que está encapsulado
    }
    set nombre(parametronombre){
        this._nombre=parametronombre;
    }
}

let persona1=new Persona('Adriana','García');

let persona2=new Persona('Andrea','García');
console.log(Persona);
console.log(persona1);
console.log(persona2);
persona1.nombre='Lupita Toxqui';
console.log(persona1);