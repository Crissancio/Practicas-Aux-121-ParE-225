class Bus:
    def __init__(self, capacidad):
        self.capacidad = capacidad
        self.pasajeros = 0
        self.costo_pasaje = 1.50

    def subir_pasajeros(self, cantidad):
        if self.pasajeros + cantidad <= self.capacidad:
            self.pasajeros += cantidad
        else:
            print("⚠️ No hay suficientes asientos disponibles.")

    def cobrar_pasaje(self):
        total = self.pasajeros * self.costo_pasaje
        print(f"Total cobrado: Bs. {total:.2f}")

    def asientos_disponibles(self):
        print(f"Asientos disponibles: {self.capacidad - self.pasajeros}")

# Ejemplo
bus = Bus(30)
bus.subir_pasajeros(20)
bus.cobrar_pasaje()
bus.asientos_disponibles()
