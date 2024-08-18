nombres = ["Ale","Facu","Manu","Contar","Francis"]
print(nombres)
print(nombres[1:2])
print(nombres[:2])

nombres [0] = "Cambio de nombre"

print(nombres)

for nombre in nombres: #nombre en singular, nombres en plural porq es una lista
    print(nombre)
else:
    print("No hay mas nombres")

# Preguntamos cuando elementos tiene la lista
print(len(nombres)) #como parametro pasamos la lista

#Agregar un ELEMENTO
nombres.append("Nombre INSERTADO")
print(nombres)

# Agregar elemento en un INDICE ESPECIFICO
nombres.insert(2,"AGREGADO EN INDICE 2")
print(nombres)

# Eliminar un ELEMENTO
nombres.remove("Facu")
print(nombres)

#Eliminar el ultimo elemento
nombres.pop()
print(nombres)

# Eliminar indice especifico
del nombres[0]
print(nombres)

#Eliminar todos los elementos de la lista
nombres.clear()
print(nombres)

# ELIMINAR LA LIST
del nombres
print(nombres)