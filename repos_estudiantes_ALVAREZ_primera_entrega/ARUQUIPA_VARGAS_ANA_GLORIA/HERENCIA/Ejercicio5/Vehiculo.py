class Vehiculo:
    def __init__(self, id, placa, conductor):
        self.id = id
        self.placa = placa
        self.conductor = conductor

    def mostrar_info(self):
        print(f"Placa: {self.placa}, Conductor: {self.conductor}")

    def cambiar_conductor(self, nuevo_conductor):
        self.conductor = nuevo_conductor

class Bus(Vehiculo):
    def __init__(self, id, placa, conductor, capacidad, sindicato):
        super().__init__(id, placa, conductor)
        self.capacidad = capacidad
        self.sindicato = sindicato

class Auto(Vehiculo):
    def __init__(self, id, placa, conductor, caballos_fuerza, descapotable):
        super().__init__(id, placa, conductor)
        self.caballos_fuerza = caballos_fuerza
        self.descapotable = descapotable

class Moto(Vehiculo):
    def __init__(self, id, placa, conductor, cilindrada, casco):
        super().__init__(id, placa, conductor)
        self.cilindrada = cilindrada
        self.casco = casco


def main():
    bus = Bus(1, "BUS-001", "Carlos", 50, "Sindicato A")
    auto = Auto(2, "AUTO-002", "Ana", 120, True)
    moto = Moto(3, "MOTO-003", "Luis", 250, False)

    for vehiculo in [bus, auto, moto]:
        vehiculo.mostrar_info()

    print("\nCambiando conductor del Auto...\n")
    auto.cambiar_conductor("María")

    auto.mostrar_info()

if __name__ == "__main__":
    main()
