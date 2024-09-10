// let autos = new Array("Ferrari", "Volkswagen", "BMW"); SINTAXIS VIEJA

let autos = ["Ferrari", "Volkswagen", "BMW"];
console.log(autos);

// RECORREMOS LOS ELEMENTOS
console.log(autos[0]);

for (let i = 0; i < autos.length; i++) {
    console.log(i+1 + ": " + autos[i]);
}

// Lo modificacmos
autos[0] = "Porsche";
console.log(autos);

// Agregamos un nuevo valor
autos.push("Audi");
console.log(autos);

// Eliminar el ultimo elemento
autos.pop();
console.log(autos);

// Otra forma de agregar elementos
autos[autos.length] = "Fiat"
console.log(autos);

// Como preguntar si es un Array 
let prueba = 1;
console.log(Array.isArray(autos)); // Devuelve BOOLEANO
console.log(Array.isArray(prueba));