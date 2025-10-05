class Pasajero:
    def __init__(self, nombre="", edad=0, genero=""):
        self.nombre = nombre
        self.edad = edad
        self.genero = genero

    # Sobrecarga del operador ++ para leer (en Python no existe ++, usamos un método)
    def leer(self):
        self.nombre = input("Nombre del pasajero: ")
        self.edad = int(input("Edad del pasajero: "))
        self.genero = input("Género del pasajero (M/F): ")

    # Sobrecarga del operador -- para mostrar (en Python no existe --, usamos un método)
    def mostrar(self):
        print(f"Nombre: {self.nombre}, Edad: {self.edad}, Género: {self.genero}")


class Crucero:
    def __init__(self, nombre="", paisOrigen="", paisDestino="", nroPasajeros=0):
        self.nombre = nombre
        self.paisOrigen = paisOrigen
        self.paisDestino = paisDestino
        self.nroPasajeros = nroPasajeros
        # Lista de tuplas: (Pasajero, nroHabitacion, costoPasaje)
        self.pasajeros = []

    # Sobrecarga del operador ++ para leer
    def leer(self):
        self.nombre = input("Nombre del crucero: ")
        self.paisOrigen = input("País de origen: ")
        self.paisDestino = input("País destino: ")
        self.nroPasajeros = int(input("Número de pasajeros: "))
        self.pasajeros = []
        for i in range(self.nroPasajeros):
            print(f"\nDatos del pasajero {i+1}:")
            p = Pasajero()
            p.leer()
            nroHabitacion = input("Número de habitación: ")
            costoPasaje = float(input("Costo del pasaje: "))
            self.pasajeros.append((p, nroHabitacion, costoPasaje))

    # Sobrecarga del operador -- para mostrar
    def mostrar(self):
        print(f"Crucero: {self.nombre}")
        print(f"Origen: {self.paisOrigen}")
        print(f"Destino: {self.paisDestino}")
        print(f"Número de pasajeros: {self.nroPasajeros}")
        print("Pasajeros:")
        for i, (p, nroHab, costo) in enumerate(self.pasajeros, 1):
            print(f" Pasajero {i}:")
            p.mostrar()
            print(f"  Habitación: {nroHab}")
            print(f"  Costo pasaje: {costo}")

    # Sobrecarga del operador == para sumar costo de pasajes
    def __eq__(self, otro):
        if not isinstance(otro, Crucero):
            return False
        total_self = sum(costo for (_, _, costo) in self.pasajeros)
        total_otro = sum(costo for (_, _, costo) in otro.pasajeros)
        print(f"Suma total costo pasajes crucero 1: {total_self}")
        print(f"Suma total costo pasajes crucero 2: {total_otro}")
        return total_self == total_otro

    # Sobrecarga del operador + para comparar cantidad de pasajeros
    def __add__(self, otro):
        if not isinstance(otro, Crucero):
            return False
        misma_cantidad = self.nroPasajeros == otro.nroPasajeros
        print(f"¿Los cruceros tienen la misma cantidad de pasajeros? {misma_cantidad}")
        return misma_cantidad

    # Sobrecarga del operador - para contar hombres y mujeres
    def __sub__(self, otro=None):
        # Contar en self
        hombres = sum(1 for (p, _, _) in self.pasajeros if p.genero.upper() == "M")
        mujeres = sum(1 for (p, _, _) in self.pasajeros if p.genero.upper() == "F")
        print(f"Crucero {self.nombre} - Mujeres: {mujeres}, Hombres: {hombres}")
        return (mujeres, hombres)


crucero1 = Crucero("Titanic", "Inglaterra", "Nueva York", 3)
crucero1.pasajeros = [
    (Pasajero("Juan Vargas", 30, "M"), "502", 500),
    (Pasajero("Martina Vasques", 25, "F"), "603", 1000),
    (Pasajero("Wilmer Montero", 40, "M"), "401", 925),
]

crucero2 = Crucero("Queen Mary", "Reino Unido", "Estados Unidos", 2)
crucero2.pasajeros = [
    (Pasajero("Ana López", 28, "F"), "201", 800),
    (Pasajero("Carlos Pérez", 35, "M"), "202", 750),
]

print("\n Crucero 1:")
crucero1.mostrar()

print("\n Crucero 2:")
crucero2.mostrar()

print("\nSuma total de pasajes:")
crucero1 == crucero2

print("\nMisma cantidad de pasajeros:")
crucero1 + crucero2

print("\nConteo con - (mujeres y hombres):")
crucero1 - None
crucero2 - None

