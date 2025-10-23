class Crucero:
    def __init__(self, nombre):
        self.nombre = nombre
        self.pasajeros = []

    def agregar_pasajero(self, pasajero):
        self.pasajeros.append(pasajero)

    def __eq__(self, otro):
        total = sum(p.costo for p in self.pasajeros)
        total2 = sum(p.costo for p in otro.pasajeros)
        return total == total2

    def __add__(self, otro):
        return len(self.pasajeros) == len(otro.pasajeros)

# FALTA B Y E

class Pasajero:
    def __init__(self, nombre, sexo, costo):
        self.nombre = nombre
        self.sexo = sexo
        self.costo = costo

# Ejemplo
c1 = Crucero("Titanic")
c2 = Crucero("Perla del Mar")
c1.agregar_pasajero(Pasajero("Juan", "M", 500))
c2.agregar_pasajero(Pasajero("Ana", "F", 500))
print("¿Costo total igual?", c1 == c2)
print("¿Misma cantidad de pasajeros?", c1 + c2)
