# === Clase base Vehiculo ===
class Vehiculo:
    def __init__(self, placa="", conductor=""):
        self.placa = placa
        self.conductor = conductor

    def mostrar(self):
        print(f"Vehículo con placa {self.placa} conducido por {self.conductor}")

    def cambiarConductor(self, nuevo_conductor):
        print(f"🧍 Cambiando conductor de {self.placa} de '{self.conductor}' a '{nuevo_conductor}'...")
        self.conductor = nuevo_conductor


# === Subclase Auto ===
class Auto(Vehiculo):
    def __init__(self, placa="", conductor="", modelo=""):
        super().__init__(placa, conductor)
        self.modelo = modelo

    def mostrar(self):
        print(f"🚗 Auto -> Placa: {self.placa} | Conductor: {self.conductor} | Modelo: {self.modelo}")


# === Subclase Moto ===
class Moto(Vehiculo):
    def __init__(self, placa="", conductor="", cilindrada=0, casco=False):
        super().__init__(placa, conductor)
        self.cilindrada = cilindrada
        self.casco = casco  # True si lleva casco

    def mostrar(self):
        casco_str = "Sí" if self.casco else "No"
        print(f"🏍️ Moto -> Placa: {self.placa} | Conductor: {self.conductor} | "
              f"Cilindrada: {self.cilindrada}cc | Casco: {casco_str}")


# === Subclase Bus ===
class Bus(Vehiculo):
    def __init__(self, placa="", conductor="", capacidad=0):
        super().__init__(placa, conductor)
        self.capacidad = capacidad  # número de pasajeros

    def mostrar(self):
        print(f"🚌 Bus -> Placa: {self.placa} | Conductor: {self.conductor} | Capacidad: {self.capacidad} pasajeros")


# === Programa principal ===
if __name__ == "__main__":
    # a) Instanciar un vehículo de cada tipo
    auto = Auto("ABC-123", "Carlos Pérez", "Toyota Corolla")
    moto = Moto("XYZ-789", "Lucía Ramos", 150, True)
    bus = Bus("FGH-456", "Ana Morales", 40)

    # b) Mostrar información de cada vehículo
    print("=== Información de los vehículos ===")
    for v in [auto, moto, bus]:
        v.mostrar()

    # c) Cambiar conductor de un vehículo
    print("\n=== Cambio de conductor ===")
    moto.cambiarConductor("Pedro López")
    moto.mostrar()
