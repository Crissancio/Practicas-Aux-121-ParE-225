class Vehiculo:
    def __init__(self, placa, conductor):
        self.placa = placa
        self.conductor = conductor

    def mostrar(self):
        print(f"Placa: {self.placa} | Conductor: {self.conductor}")

class Auto(Vehiculo):
    pass

class Moto(Vehiculo):
    pass

# Ejemplo
a = Auto("123-ABC", "Carlos")
m = Moto("456-ZXC", "Luis")
a.mostrar()
m.mostrar()

# Cambiar conductor
a.conductor = "Ana"
print("Nuevo conductor del auto:", a.conductor)
