# Dada la siguiente tupla
tupla = (13,1,8,3,2,5,8)
#Crear una lista que solo incluya los numeros menores a 5 e  imprima por consola [1,3,2]

listaNueva = []

for numerito in tupla:
    if numerito < 5:
        listaNueva.append(numerito)
    
print(listaNueva)