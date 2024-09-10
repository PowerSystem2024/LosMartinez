//Ejercicio 1: Iterar un rango de 0 a 10 e imprimir numeros divisibles entre 3.
// Ejemplo: 0,3,6,9

for(let i = 0; i<11;i++) {
    if(i % 3 == 0) {
       console.log(i);
    }
}

//Ejercicio 2: Crear un rango de 2 a 6 e imprimirlos

for (let i = 2; i < 7; i++) {
    console.log(i);
}

// Crear un rango de 3 a 10 pero con incremento de 2 en 2

for (let i = 3; i < 11; i=i+2) {
    console.log(i);
    
} 

// Dada la siguiente lista
lista = [13,1,8,3,2,5,8];
listaNueva = [];
// Crear una lista que solo incluya los numeros menores a 5 e  imprima por consola [1,3,2]
for (let i = 0; i < lista.length; i++) {
    if(lista[i] < 5) {
        listaNueva.push(lista[i]);
        console.log(lista[i])
    }     
}
