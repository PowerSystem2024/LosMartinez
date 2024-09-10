# Mostrar una frase sin espacion y contar su longitud
# El usuario ingresa una frase y se le devuelve la misma SIN espacion
# y un contador de cuantos caracteres tiene la frase.

frase1 = input("Digite una frase: ")
frase2 = ""

for i in frase1:
    if i != " ":
        frase2 += i 
print(f"Nueva frase: {frase2}")
print(f"Cantidad de caracteres: {len(frase2)}")