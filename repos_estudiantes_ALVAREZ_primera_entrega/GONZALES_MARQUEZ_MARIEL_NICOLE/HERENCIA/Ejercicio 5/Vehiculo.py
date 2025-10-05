

class Vehiculo:
    def __init__(self, conductor: str, placa: str, id: int):
        self._conductor = conductor      
        self._placa = placa
        self._id = id

    def mostrar_datos(self):
        print(f"Placa: {self._placa} | Conductor: {self._conductor}")

    def cambiar_conductor(self, nuevo_conductor: str):
        print(f"Cambiando conductor de {self._conductor} a {nuevo_conductor}")
        self._conductor = nuevo_conductor


class Bus(Vehiculo):
    def __init__(self, conductor: str, placa: str, id: int, capacidad: int, sindicato: str):
        super().__init__(conductor, placa, id)
        self.capacidad = capacidad
        self.sindicato = sindicato


class Auto(Vehiculo):
    def __init__(self, conductor: str, placa: str, id: int, caballos_fuerza: int, descapotable: bool):
        super().__init__(conductor, placa, id)
        self.caballos_fuerza = caballos_fuerza
        self.descapotable = descapotable


class Moto(Vehiculo):
    def __init__(self, conductor: str, placa: str, id: int, cilindrada: int, casco: bool):
        super().__init__(conductor, placa, id)
        self.cilindrada = cilindrada
        self.casco = casco



if __name__ == "__main__":
    bus = Bus("Carlos López", "ABC-123", 1, 50, "Sindicato A")
    auto = Auto("María Pérez", "XYZ-789", 2, 150, True)
    moto = Moto("Luis Díaz", "MOT-456", 3, 250, True)

    print("=== Información de Vehículos ===")
    bus.mostrar_datos()
    auto.mostrar_datos()
    moto.mostrar_datos()

    print("\n=== Cambio de Conductor ===")
    bus.cambiar_conductor("Pedro Gómez")
    bus.mostrar_datos()
