
class Celular:
    def __init__(self, nroTel, dueno, espacio, ram, nroApp):
        self.nroTel = nroTel
        self.dueno = dueno
        self.espacio = espacio
        self.ram = ram
        self.nroApp = nroApp

    def __pos__(self):
        self.nroApp += 10
        return self

    def __neg__(self):
        self.espacio -= 5
        return self

    def mostrar(self):
        print(self.nroTel, self.dueno, self.espacio, self.ram, self.nroApp)


c = Celular("77711122","Ana",64,8,15)
print("Antes:")
c.mostrar()
+c
-c
print("Despues:")
c.mostrar()
