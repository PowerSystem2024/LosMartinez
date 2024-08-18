#Ejercicio 1: Iterar un rango de 0 a 10 e imprimir numeros divisibles entre 3.
# Ejemplo: 0,3,6,9

# range(INICIO(no hace falta),FIN,INCREMENTO(no hace falta))
for numero in range(11):
    if numero % 3 == 0:
        print(numero)
