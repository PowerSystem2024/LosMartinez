let x = 10 // Variable tipo primitiva
//console.log(x.lenght);

// OBJETO PERSONA
let persona = {
    nombre: "Ale",
    apellido: "Martinez",
    mail: "alecsmartinez5@gmail.com",
    edad: 24,

    nombreCompleto: function() {
        return this.nombre + " " + this.apellido;
    }
}
console.log(persona.nombreCompleto())
console.log(persona.nombre)
console.log(persona)

let persona2 = new Object(); //Crea un nuevo objeto en memoria.
persona2.nombre = "Juan";
persona2.direccion = "Salada 14"

console.log(persona2.direccion)
console.log("%%%%%")
console.log(persona["apellido"])
// FOR IN
for(propiedad in persona) {
    console.log(propiedad)
    console.log(persona[propiedad])
}

// Agregar y eliminar propiedades a un objeto
persona.apellido = "CAMBIAZO"


