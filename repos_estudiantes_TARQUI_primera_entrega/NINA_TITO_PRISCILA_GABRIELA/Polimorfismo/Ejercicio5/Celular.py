class Celular:
    def __init__(self, nroTel, dueño, espacio, ram, nroApp):
        self.nroTel = nroTel
        self.dueño = dueño
        self.espacio = espacio
        self.ram = ram
        self.nroApp = nroApp 

    def mostrarDatos(self):
        print(f"Celular de: {self.dueño}")
        print(f"Numero: {self.nroTel}")
        print(f"Espacio: {self.espacio} GB")
        print(f"RAM: {self.ram} GB")
        print(f"Nro de Apps: {self.nroApp}")
        print("-" * 30)
    def __pos__(self):
        self.nroApp = self.nroApp + 10
        return self
    def __neg__(self):
        self.espacio = self.espacio - 5
        return self 

c1 = Celular("76543210", "Gabriela", 64, 4, 20)
print("Antes de aplicar operadores:")
c1.mostrarDatos()
+c1 #aumenta apps en 10
-c1 #disminuye espacio en 5GB
print("Después de aplicar operadores:")
c1.mostrarDatos()