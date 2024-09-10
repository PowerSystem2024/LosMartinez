# Lista pero ordenada de manera particular


#    KEY     :VALOR
# "Maradona" :10
# dict(key,valor)

diccionario = {
    "IDE"  : "Integrated Development Enviroment" ,
    "POO"  : "Programacion Orientada a Objetos" , 
    "SABD" : "Sistema de Administracion de Base de Datos"
}
print(diccionario)
print(len(diccionario))

# Acceder a un diccionario con la llave(key)
print(diccionario["IDE"])

# Otra forma de obtener un elemento
print(diccionario.get("POO"))
print(diccionario.get("hola")) # Dice NONE


# MODIFICAR ELEMENTOS
diccionario["IDE"] = "Entorno de Desarrollo Integrado"
print(diccionario["IDE"])

# Como recorred los elementos
for termino in diccionario: # SOLO ACCEDO A LAS LLAVES
    print(termino)
# Para recorrer el diccionario necesitamos la funcion ITEMS()
for termino, valor in diccionario.items():
    print(termino,valor)

# Otras maneras de acceder a un diccionario
for termino in diccionario.keys():
    print(termino) # MUESTRA SOLO LAS LLAVES

for valor in diccionario.values():
    print(valor) # SOLO MUESTRA LOS VALORES

# COMPROBAR LA EXISTENCIA DE ALGUN ELEMENTO
print("IDE" in diccionario) # Devuelve un BOOLEANO

# Agregar un elemento
# Si agrego un elemento con key existente, me sobreescribe el valor anterior
diccionario["PK"] = "Primaty Key"
print(diccionario)

# Eliminar elemento
diccionario.pop("SABD")
print(diccionario)

# Vaciar un diccionario
diccionario.clear()
print(diccionario)

# Eliminar diccionario
del diccionario
print(diccionario)