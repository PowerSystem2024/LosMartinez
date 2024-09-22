# Sumar numeros pares dentro de un rango
# Hacer un programa para sumar numeros pares dengo de un rango.
# Ejemplo: suma de pares del 2 al 30
# Suma = 240.

numero1 = int(input("Ingrese el primer numero: "));
numero2 = int(input("Ingrese el segundo numero: "));
suma = 0

for i in range(numero1,numero2 +1):
    if i % 2 == 0:
        suma += i

print(f"La suma es: {suma}")