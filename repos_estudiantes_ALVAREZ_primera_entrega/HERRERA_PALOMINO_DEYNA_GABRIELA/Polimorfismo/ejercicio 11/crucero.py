class Pasajero:
    def __init__(self, nombre="Desconocido", edad=0, genero="N", nroHabitacion="N/A", costoPasaje=0.0):
        self.nombre = nombre
        self.edad = edad
        self.genero = genero  
        self.nroHabitacion = nroHabitacion
        self.costoPasaje = costoPasaje

    def __iadd__(self, datos):
        self.nombre, self.edad, self.genero, self.nroHabitacion, self.costoPasaje = datos
        return self

    def __isub__(self, other):
        print(f"Pasajero: {self.nombre} | Edad: {self.edad} | Género: {self.genero} | "
              f"Habitación: {self.nroHabitacion} | Costo: ${self.costoPasaje}")
        return self

    def get_costo(self):
        return self.costoPasaje

    def get_genero(self):
        return self.genero
class Crucero:
    def __init__(self, nombre="Desconocido", paisOrigen="N/A", paisDestino="N/A"):
        self.nombre = nombre
        self.paisOrigen = paisOrigen
        self.paisDestino = paisDestino
        self.pasajeros = []

    def __iadd__(self, pasajero):
        self.pasajeros.append(pasajero)
        return self

    def __isub__(self, other):
        print(f"\nCrucero: {self.nombre} ({self.paisOrigen} → {self.paisDestino})")
        for p in self.pasajeros:
            p -= 1  
        return self

    def __eq__(self, other):
        total = sum(p.get_costo() for p in self.pasajeros)
        print(f"Suma total de pasajes en {self.nombre}: ${total}")
        return total

    def __add__(self, other):
        if len(self.pasajeros) == len(other.pasajeros):
            print(f"Ambos cruceros tienen la misma cantidad de pasajeros ({len(self.pasajeros)}).")
        else:
            diff = abs(len(self.pasajeros) - len(other.pasajeros))
            print(f"Diferencia de pasajeros: {diff}")
        return self

    def __sub__(self, other):
        hombres = sum(1 for p in self.pasajeros if p.get_genero().upper() == "M")
        mujeres = sum(1 for p in self.pasajeros if p.get_genero().upper() == "F")
        print(f"Crucero {self.nombre} → Hombres: {hombres}, Mujeres: {mujeres}")
        return self
if __name__ == "__main__":
    p1 = Pasajero("Carlos", 30, "M", "H101", 500)
    p2 = Pasajero("Lucía", 25, "F", "H102", 600)
    p3 = Pasajero("Miguel", 40, "M", "H103", 700)
    p4 = Pasajero("Ana", 22, "F", "H104", 550)
    p5 = Pasajero("Sofía", 29, "F", "H105", 650)

    c1 = Crucero("Oceania", "España", "Brasil")
    c2 = Crucero("Titanic II", "Francia", "Italia")

    c1 += p1
    c1 += p2
    c1 += p3

    c2 += p4
    c2 += p5

    c1 -= 1
    c2 -= 1

    c1 == c2 

    c1 + c2

    c1 - c2
    c2 - c1
