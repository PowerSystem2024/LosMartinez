seleccionArgentina = {
    10: {"Nombre": "Lionel Messi", "Edad": 36, "Altura": 1.70, "Precio": "50 Millones", "Posicion": "Extremo Derecho"},
    11: {"Nombre": "Angel Di Maria", "Edad": 38, "Altura": 1.80, "Precio": "12 Millones", "Posicion": "Extremo Derecho"},
    24: {"Nombre": "Dybala", "Edad": 28, "Altura": 1.77, "Precio": "5 Millones", "Posicion": "Delantero"},
    19: {"Nombre": "Otamendi", "Edad": 27, "Altura": 1.75, "Precio": "3 Millones", "Posicion": "Defensor"},
    1: {"Nombre": "Higuain", "Edad": 29, "Altura": 1.92, "Precio": "4 Millones", "Posicion": "Delantero Centro"},
    1: {"Nombre": "Armani", "Edad": 40, "Altura": 1.94, "Precio": "1 Millon", "Posicion": "Arquero"},
    3: {"Nombre": "Julian Alvarez", "Edad": 24, "Altura": 1.85, "Precio": "20 Millones", "Posicion": "Delantero"},
    5: {"Nombre": "Scaloni", "Edad": 45, "Altura": 1.76, "Precio": "4 Millones", "Posicion": "DT"},
    6: {"Nombre": "De Paul", "Edad": 32, "Altura": 1.80, "Precio": "6 Millones", "Posicion": "Medio"}
}

#print(seleccionArgentina)
#print(seleccionArgentina[10])

#for jugador in seleccionArgentina:
#    print(jugador)

#for jugador in seleccionArgentina.values():
#    print(jugador)

for  llave, jugador in seleccionArgentina.items():
    print(llave, jugador)

print("Tenemos cargados la cantidad de jugadores: " + str(len(seleccionArgentina)))