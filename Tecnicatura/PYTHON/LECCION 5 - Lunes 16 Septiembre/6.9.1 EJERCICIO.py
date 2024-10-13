# Ejercicio 01: Crear una función para sumar los valores recibidos de tipo
# numéricos, utilizando argumentos variables *args como parámetro de la
# función y agregar como resultado la suma de todos los valores pasados
# como argumentos.

def multiplicarTodo(*nums):
    multiplicacion = 1
    for i in nums:
        multiplicacion *= i
    return multiplicacion


lista = []

for i in range(5):
    numero = int(input("Agregar numero: "))
    lista.append(numero)

resul = multiplicarTodo(*lista)

print(resul)

