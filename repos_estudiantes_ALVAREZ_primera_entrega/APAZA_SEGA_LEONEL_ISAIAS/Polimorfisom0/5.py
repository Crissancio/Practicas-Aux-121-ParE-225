class Celular:
    def __init__(self, nroTel, dueño, espacio, ram, nroApp):
        self.nroTel = nroTel
        self.dueño = dueño
        self.espacio = espacio
        self.ram = ram
        self.nroApp = nroApp

    def __str__(self):
        return f"{self.dueño} | Apps: {self.nroApp} | Espacio: {self.espacio}GB"

    def __add__(self, otro):
        # Solo demostración, podría fusionar datos
        return f"Comparando {self.dueño} y {otro.dueño}"

    def __iadd__(self, val):
        self.nroApp += 10
        return self

    def __isub__(self, val):
        self.espacio -= 5
        return self

# Ejemplo
c1 = Celular(77711122, "Ana", 64, 8, 25)
print("Antes:", c1)
c1 += 1   # ++
c1 -= 1   # --
print("Después:", c1)
