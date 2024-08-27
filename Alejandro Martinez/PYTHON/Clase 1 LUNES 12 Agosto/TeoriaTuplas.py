# En una TUPLA no se puede MODIFICAR como en una lista, no existe el insert,remove,pop. etc.

# En las TUPLAS se usa PARENTESIS, no corchete como en la LISTA
cocina = ("cachara","cuchillo","tenedor")

print(cocina)
print(len(cocina))

#Acceder a un elemento, para esto utilizamos CORCHETE
print(cocina[0])
#Mostrar de manera inversa
print(cocina[-1])

#Acceder a un RANGO
print(cocina[1:2])

#Recorremos la TUPLA
for utensillo in cocina:
    #print(utensillo)
    print(utensillo, end=", ") #Usamos end= para borrar los saltos de linea

# Unica manera de modificar una TUPLA, es convertirla a LISTA y luego devuelta TUPLA
print("\n")
cocinaLista = list(cocina)
cocinaLista[0] = "Cambio TUPLA porq es LISTA"
cocina = tuple(cocinaLista)
print(cocina)

# ELIMIAR TUPLA
del cocina
# print(cocina)