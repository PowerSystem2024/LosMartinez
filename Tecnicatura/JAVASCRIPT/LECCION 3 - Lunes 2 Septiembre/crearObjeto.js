// PASO POR REFERENCIA

const persona = {
    nombre: "Juan",
    apellido: "Martinez",
    edad: 24
}

console.log(persona)
function cambiarValorObjeto(p1) {
    p1.nombre = "Facundo"
    p1.apellido = "Perez"
}

cambiarValorObjeto(persona)
console.log(persona)