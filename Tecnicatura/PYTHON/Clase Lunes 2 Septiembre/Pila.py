# Pilas usando listas

pila = [1,2,3]

# Agregar elementos a la pila por el final

pila.append(4)
pila.append(5)
print(pila)

# Sacar elementos a la pila por el final (saca siempre el ultimo elemento)
pila.pop()
print(pila)

numeroBorrado = pila.pop()
print(f"Sacamos el elemento {numeroBorrado}")
print(f"La lista quedo como: {pila}")

# Cola con listas
# Estrictura de datos de tipo FIFO(Fisrt input / first output) primero en entrar, primero en salir.
# Funciona como la cola de un banco, el primero que llego, lo atienden y se va, y asi...
cola = ["Ariel","Osvaldo", "Liliana", "Pilar"]
print(cola)
# Agregamos Elementos.
cola.append("Facu")
cola.append("Jose")
print(cola)

# Ahora sacamos elementos
seRetira = cola.pop(1)
print(f"Se fue de la cola: {seRetira}")
print(f"La cola quedo como: {cola}")
