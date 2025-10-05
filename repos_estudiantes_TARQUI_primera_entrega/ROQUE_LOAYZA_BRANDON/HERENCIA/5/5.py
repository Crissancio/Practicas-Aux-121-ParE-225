
class Vehiculo:
    def __init__(self, placa, conductor):
        self.placa = placa
        self.conductor = conductor

    def mostrar(self):
        print(self.placa, self.conductor)

    def cambiarConductor(self, nuevo):
        self.conductor = nuevo

class Auto(Vehiculo):
    pass

class Moto(Vehiculo):
    pass


a = Auto("123ABC","Luis")
m = Moto("777ZZZ","Carlos")
a.mostrar()
m.mostrar()
a.cambiarConductor("Pedro")
a.mostrar()
