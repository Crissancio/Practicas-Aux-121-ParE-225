class Bus:
    def __init__(self, capacidad):
        self.capacidad = capacidad
        self.pasajeros = 0
        self.recaudacion = 0.0
    def subir(self, cantidad):
        disponibles = self.capacidad - self.pasajeros
        subir = cantidad if cantidad <= disponibles else disponibles
        self.pasajeros += subir
        return subir
    def cobrar_pasaje(self):
        costo = 1.5
        total = self.pasajeros * costo
        self.recaudacion += total
        return total
    def asientos_disponibles(self):
        return self.capacidad - self.pasajeros

if __name__ == "__main__":
    b = Bus(40)
    print(b.subir(25))
    print(b.cobrar_pasaje())
    print(b.asientos_disponibles())
