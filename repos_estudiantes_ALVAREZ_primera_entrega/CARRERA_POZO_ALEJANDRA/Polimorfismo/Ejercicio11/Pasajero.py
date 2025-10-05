class Pasajero:
    def __init__(self, nombre, edad, genero, nroHabitacion, costoPasaje):
        self.nombre = nombre
        self.edad = edad
        self.genero = genero
        self.nroHabitacion = nroHabitacion
        self.costoPasaje = costoPasaje
    def __str__(self):
        return (f"Nombre: {self.nombre}, Edad: {self.edad}, Género: {self.genero}, "
                f"Habitación: {self.nroHabitacion}, Costo: ${self.costoPasaje}")
    def __iadd__(self, otro):
        self.nombre = input("Nombre: ")
        self.edad = int(input("Edad: "))
        self.genero = input("Género (M/F): ")
        self.nroHabitacion = int(input("N° Habitación: "))
        self.costoPasaje = float(input("Costo del pasaje: "))
        return self
    def __isub__(self, otro):
        print(self)
        return self


class Crucero:
    def __init__(self, nombre, paisOrigen, paisDestino):
        self.nombre = nombre
        self.paisOrigen = paisOrigen
        self.paisDestino = paisDestino
        self.pasajeros = []
    def __iadd__(self, otro):
        print(f"\nIngresando pasajero para el crucero '{self.nombre}':")
        p = Pasajero("", 0, "", 0, 0)
        p += 1 
        self.pasajeros.append(p)
        return self
    def __isub__(self, otro):
        print(f"\nPasajeros del crucero '{self.nombre}':")
        for p in self.pasajeros:
            p -= 1
        return self
    def __eq__(self, otro):
        total = sum(p.costoPasaje for p in self.pasajeros)
        print(f"\nTotal del costo de los pasajes en {self.nombre}: ${total}")
        return total == sum(p.costoPasaje for p in otro.pasajeros)
    def __add__(self, otro):
        if len(self.pasajeros) == len(otro.pasajeros):
            print(f"Ambos cruceros tienen la misma cantidad de pasajeros ({len(self.pasajeros)}).")
        else:
            print(f"Los cruceros tienen diferente cantidad de pasajeros.")
        return None
    def __sub__(self, otro):
        hombres = sum(1 for p in self.pasajeros if p.genero.upper() == "M")
        mujeres = sum(1 for p in self.pasajeros if p.genero.upper() == "F")
        print(f"\nEn el crucero {self.nombre}: {hombres} hombres y {mujeres} mujeres.")
        return None

if __name__ == "__main__":
    c1 = Crucero("Caribe Azul", "México", "Bahamas")
    c2 = Crucero("Sol del Mar", "España", "Italia")
    p1 = Pasajero("Juan Vargas", 35, "M", 502, 500)
    p2 = Pasajero("Martina Vasques", 28, "F", 603, 1000)
    p3 = Pasajero("Wilmer Montero", 42, "M", 401, 925)
    p4 = Pasajero("Lucía Pérez", 30, "F", 702, 875)
    p5 = Pasajero("Carlos Ruiz", 37, "M", 505, 720)
    c1.pasajeros = [p1, p2, p3]
    c2.pasajeros = [p4, p5]
    c1 -= 1  
    c2 -= 1  
    c1 == c2
    c1 + c2
    c1 - c2
