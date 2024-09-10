# Realizar un juego para adivinar un numero.
# Para ello se debe generar un aleatorio entre 1 a 100.
# Luego ir pidiendo numeros indicando "es mayor" "es menor"
# Termina cuando acierte mostrando la cantidad de intentos
import random

numeroRandom = random.randint(1,100)
numero = 0
contador = 0

while numero != numeroRandom:
    numero = int(input(f"({contador})Ingrese num: "))

    if numero > numeroRandom:
        print("es Menor")
    else: 
        print("es Mayor")
    contador+=1;

print(f"Adivinaste!!! El numero era {numeroRandom}, con {contador} intentos")
    