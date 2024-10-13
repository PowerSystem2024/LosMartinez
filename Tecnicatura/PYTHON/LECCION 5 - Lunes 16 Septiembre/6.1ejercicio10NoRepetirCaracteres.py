# Ejercicio 10: No repetir caracteres
# Hacer un programa que pida una cadena y luego meter los caracteres
# en una nueva lista sin repetirlos


frase1 = input("Digite una frase: ")
frase2 = ""
agregar = True

for i in frase1:
    agregar = True
    for j in frase2:
        if i == j:
            agregar = False
    if agregar:
        frase2 += i 


print(f"Frase original: {frase1}")
print(f"Nueva frase   : {frase2}")
