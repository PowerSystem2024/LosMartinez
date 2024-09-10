# Hacer programa que pida num por teclado y lo guarde en una lista su tabla de multiplica
# hata el 10
#Si pongo 5 la lista tendra: 5,10,15,20,25,30,35,40,45,50

numero = int(input("Ingrese un numero: "))
lista = []

for i in range(1,11,1):
    lista.append(i*numero)

print(lista)