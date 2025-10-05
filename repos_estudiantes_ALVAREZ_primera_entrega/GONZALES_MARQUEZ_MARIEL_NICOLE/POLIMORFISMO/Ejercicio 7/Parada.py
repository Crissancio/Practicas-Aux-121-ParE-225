class Celular:
    def __init__(self, nroTel, dueño, espacio, ram, nroApp):
        self.nroTel = nroTel
        self.dueño = dueño
        self.espacio = espacio
        self.ram = ram
        self.nroApp = nroApp

    def __iadd__(self, other):
        self.nroApp += 10
        return self

    def __isub__(self, other):
        self.espacio -= 5
        return self

    def mostrar(self):
        print("Número:", self.nroTel)
        print("Dueño:", self.dueño)
        print("Espacio:", self.espacio, "GB")
        print("RAM:", self.ram, "GB")
        print("Número de Apps:", self.nroApp)
        print()

c = Celular("7654321", "Mariel", 64, 4, 15)

print("Antes de los operadores:")
c.mostrar()

c += 1
c -= 1

print("Después de los operadores:")
c.mostrar()
