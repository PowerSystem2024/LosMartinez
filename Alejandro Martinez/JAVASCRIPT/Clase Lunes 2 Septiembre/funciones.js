miFuncion(5,19);

function miFuncion(a,b) {
    //console.log("Sumamos: " + a+b);
    //console.log("Sumamos: " + (a+b));
    return a + b
}

// Llamamos a la funcion
miFuncion(2,3);

let resultado = miFuncion(7,5);
console.log("Resultado " +  resultado);

///////////////////////////
// Funcion de tipo ANONIMA o funcion de tipo EXPRESION.
///////////////////////////
console.log("///// FUNCION TIPO EXPRESION O ANONIMA /////")

let x = function(a,b) {
            return a + b}
        ;

resultado = x(2,2)
console.log(resultado)

///////////////////////////
// Funcion de tipo SELF e INVOKING
///////////////////////////
console.log("///// FUNCION TIPO SELF o INVOKING /////");
(function(a,b) {
    console.log("Ejecutando la funcion " + (a+b))
    console.log("Argumentos en la funcion: ")
    console.log(arguments[0])
    console.log(arguments)
    console.log("Cantidad de argumentos: " +  arguments.length)
})(10,523
);

console.log(typeof miFuncion);
console.log(typeof let);

///////////////////////////
// FUNCIONES FLECHA
///////////////////////////

console.log("///// FUNCIONES FLECHA /////")
// USAMOS CONST ya que no va a cambiar
const sumarFuncionFlecha = (a,b) => a+b;
resultado = sumarFuncionFlecha(2,10);
console.log(resultado)


/////////////////////////////
// EJERCICIO DE SUMAR TODO //
/////////////////////////////
console.log("/////// EJERCICIO SUMAR TODO ///////")

let rta = sumarTodo(1,2,3,4,5,6,7,8,9,10);
console.log(rta);
function sumarTodo() {
    let suma = 0;
    for (let i = 0; i < arguments.length; i++) {
        suma += arguments[i];
    }
    return suma;
}