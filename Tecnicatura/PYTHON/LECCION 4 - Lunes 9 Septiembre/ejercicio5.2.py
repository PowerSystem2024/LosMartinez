#Factorial de numero positivo.

numero = int(input("Ingrese un positivo: "))
factorial = 1

for i in range(numero,1,-1):
    factorial *= i; 

print(f"El factorial de {numero} es {factorial}")