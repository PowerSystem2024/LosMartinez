// NO SE PUEDE PORQ ANTES HAY Q CREAR LA CLASE
// let perosna3 = new Persona("Carlos","Joyst",66)

class Persona { // CLASE PADRE
    constructor(nombre,apellido,edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // GETTERS Y SETTERS
    get nombre() {
        return this._nombre
    }
    set nombre(nombre) {
        this._nombre = nombre;
    }
    // EJERCICIO
    get apellido() {
        return this._apellido
    }
    set apellido(apellido) {
        this._apellido = apellido;
    }
}

class Empleado extends Persona { // CLASE HIJA, HEREDA DE PERSONA 
    constructor(nombre,apellido,edad,departamento) {
        super(nombre,apellido,edad);
        this._departamento = departamento;
    }
    get departamento() {
        return this._departamento
    }
    set departamento(departamento) {
        this._departamento = departamento;
    }
}

// Crear el método get y set para el atributo de apellido, luego modificar el apellido a través del  set y 
// mostrar con un console.log lo que es el get donde muestra el resultado obtenido.

let persona1 = new Persona("Ale", "Martinez", 24);
let persona2 = new Persona("Carlos", "ASDASD", 40);

persona1.apellido = "CAMBIOAPELLIDO"
console.log(persona1.apellido);

let empleado1 = new Empleado("Jose","Perez",35,"1C");
console.log(empleado1)