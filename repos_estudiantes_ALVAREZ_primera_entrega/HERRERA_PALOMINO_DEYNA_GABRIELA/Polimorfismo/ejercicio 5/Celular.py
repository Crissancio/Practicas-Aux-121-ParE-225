class Celular:
    def __init__(self, nroTel, dueño, espacio, ram, nroApp):
        self.nroTel = nroTel
        self.dueño = dueño
        self.espacio = espacio  
        self.ram = ram          
        self.nroApp = nroApp

    def mostrarDatos(self):
        print(f"Celular de {self.dueño} ({self.nroTel})")
        print(f"Espacio: {self.espacio} GB, RAM: {self.ram} GB, Apps instaladas: {self.nroApp}\n")

    def __add__(self, valor):
        if isinstance(valor, int):
            return Celular(self.nroTel, self.dueño, self.espacio, self.ram, self.nroApp + valor)
        raise TypeError("Se puede sumar solo un entero al número de apps")

    def __sub__(self, valor):
        if isinstance(valor, int):
            nuevo_espacio = max(0, self.espacio - valor)
            return Celular(self.nroTel, self.dueño, nuevo_espacio, self.ram, self.nroApp)
        raise TypeError("Se puede restar solo un entero al espacio")

    def agregarApps(self, cantidad):
        self.nroApp += cantidad

    def disminuirEspacio(self, cantidad):
        self.espacio = max(0, self.espacio - cantidad)
  
c1 = Celular("789654123", "Juan Perez", 64, 4, 25)
c2 = Celular("321654987", "Ana Lopez", 128, 8, 40)

print("Antes de operadores:")
c1.mostrarDatos()
c2.mostrarDatos()

c1 = c1 + 10
c2 = c2 + 5

print("Después de sumar apps:")
c1.mostrarDatos()
c2.mostrarDatos()

c1 = c1 - 5
c2 = c2 - 20

print("Después de disminuir espacio:")
c1.mostrarDatos()
c2.mostrarDatos()
