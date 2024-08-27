# La lista se puede MODIFICAR
# La TUPLA NO se puede MODIFICAR
# No tiene un orden y NO se puede MODIFICAR, pero si se puede agregar o eliminar elementos
# No mantiene un INDICE, es aleatorio.

# Es una lista sin orden


#EJECUTAR VARIAS VECES, se podra ver que NO mantiene un orden
planetas = {"Marte", "Jupiter","Venus"}
print(len(planetas)) #Usamos la funcion len.

# Revisar si un elemento existe dentro del SET
print("Marte" in planetas) #ver si existe marte es planetas, es tipo boleano
print("Marte" not in planetas)

# Agregar ELEMENTO
planetas.add("Tierra")
planetas.add("Tierra") # NO SE PUEDE AGREGAR ELEMENTOS DUPLICADOS
print(planetas)

# SET nos servira cuando queremos una lista donde no se puedan duplicar elementos por ejemplo el DNI

# Eliminar elementos, puede arrojar error si el elemento no existe
planetas.remove("Marte") # Esta tira error si el elemento no existe 
print(planetas)

planetas.discard("Tierra") # Esta no hace nada, si el elemento no existe
planetas.discard("Tierra")
print(planetas)

# LIMPIAR SET
planetas.clear() # LO DEJA VACIO
print(planetas)

# PARA ELIMINAR
del planetas
# print(planetas) 