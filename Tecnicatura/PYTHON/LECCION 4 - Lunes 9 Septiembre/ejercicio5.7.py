# Menu interactivo - Cajero automatico
# Saldo inicial de $1000
# Debera ingresar dinero, retirar,mostrar y salir
monto = 0
saldo = 1000
opcion = 0

def opcion1(saldo):
    print("Ingre monto: ")
    monto = int(input())
    saldo +=monto
    return saldo

def opcion2(saldo):
    print("Ingre monto a retirar: ")
    monto = int(input())
    saldo -= monto
    return saldo

def opcion3(saldo):
    print(f"Su saldo es: {saldo}")

def opcion4():
    print("HA SALIDO!!!")

diccionario = {
    1: opcion1,
    2: opcion2,
    3: opcion3,
    4: opcion4
}

while opcion != 4:
    print("1. Ingresar dinero -")
    print("2. Retirar dinero -")
    print("3. Mostrar dinero -")
    print("4. SALIR -")
    print("INGRESE OPCION: ")
    opcion = int(input())

    if opcion in diccionario:
        if opcion in [1,2]:
            saldo = diccionario[opcion](saldo)
        elif opcion in [3]:
            diccionario[opcion](saldo)
        else:
            diccionario[opcion]
    else:
        print("OPCION INVALIDA!!!!")

    