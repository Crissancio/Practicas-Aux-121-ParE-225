class Bus:
    def __init__(self, capacidad, costo_pasaje=1.50):
        self.capacidad = capacidad
        self.pasajeros = 0
        self.costo_pasaje = costo_pasaje

    def subir_pasajeros(self, cantidad):
        if self.pasajeros + cantidad <= self.capacidad:
            self.pasajeros += cantidad
            print(f"Subieron {cantidad} pasajeros.")
        else:
            print("No hay suficientes asientos disponibles.")

    def cobrar_pasaje(self):
        return self.pasajeros * self.costo_pasaje

    def asientos_disponibles(self):
        return self.capacidad - self.pasajeros

    def mostrar_datos(self):
        print(f"Capacidad: {self.capacidad}")
        print(f"Pasajeros actuales: {self.pasajeros}")
        print(f"Asientos disponibles: {self.asientos_disponibles()}")
        print(f"Total recaudado: {self.cobrar_pasaje():.2f}")
if __name__ == "__main__":
    bus1 = Bus(50)
    bus1.subir_pasajeros(20)
    bus1.subir_pasajeros(15)
    bus1.mostrar_datos()
