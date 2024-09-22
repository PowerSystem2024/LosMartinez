# Ejercicio 11: Agenda telefonica
# Hacer un programa que simule agenda de contactos
# Crear diccionario donde la clave sea el nombre del usuario
# y el valor el telefono, el programa tendra el siguiente menu de opciones:
#   1. Nuevo contacto
#   2. Borrar contacto
#   3. Ver contactos existentes
#   4. Salir

opcion = 0
numeroTelefono = 0
nombre = ""

mi_agenda = {
    "Ale"  : "1128449525",
    "Facu" : "1126789544",
    "Odin" : "4554567889"
}

def opcion1():
    print(" - - - AGREGAR CONTACTO - - - ")
    nombre = input("Indique nombre del contacto: ")
    if nombre in mi_agenda:
        print("NOMBRE YA EN LA AGENDA, VOLVERA AL MENU")
    else:
        numeroTelefono = input("Ingrese el número de teléfono: ")
        mi_agenda[nombre] = numeroTelefono

def opcion2():
    print(" - - - BORRAR CONTACTO - - - ")
    nombre = input("Nombre a borrar: ")
    mi_agenda.pop(nombre)
def opcion3():
    print(" - - - TODOS LOS CONTACTOS - - -")
    if mi_agenda:  # Verificar si hay contactos en la agenda
        print("Nombre  |  Telefono")
        for nombre, numero in mi_agenda.items():
            print(f" {nombre}       {numero}")
            print("-" * 30)  # Línea separadora
    else:
        print("La agenda está vacía.")


def opcion4():
    print("HA SALIDO!!!")

switch = {
    1: opcion1,
    2: opcion2,
    3: opcion3,
    4: opcion4
}

while opcion != 4:
    print("1. Agregar contacto -")
    print("2. Borrar contacto -")
    print("3. Ver contactos existentes -")
    print("4. SALIR -")
    print("INGRESE OPCION: ")
    opcion = int(input())

    if opcion in switch:
        switch[opcion]()  # Ejecutar la función correspondiente a la opción
    else:
        print("OPCIÓN INVÁLIDA!!!!")
