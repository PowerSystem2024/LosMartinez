# Las listas,tuplas o diccionarios SON ARRAYS

# Las LISTAS pueden guardar varios tipos de datos
lista1 = ["hola",1,4.5, True]

#Concatenamos LISTAS
lista2 = ["chauuuu", False,1]

lista3 = lista1 + lista2

print(lista3)

# Agregar varios elementos a una lista
lista3.extend("h")
print(lista3)

# Saber INDICE de algun elemento
print(lista3.index("hola"))

# Saber cuantos valores repetidos hay dentro de una lista
print(lista3.count(1))

# Para poner la lista al reves
lista3.reverse()
print(lista3)

# Para que una lista se multiplique repitiendo sus elementos
lista4 = [1,2,3,4] * 2
print(lista4)

# Metodo de ordenamiento 
lista4.sort()
print(lista4)

lista4.sort(reverse=True)
print(lista4)