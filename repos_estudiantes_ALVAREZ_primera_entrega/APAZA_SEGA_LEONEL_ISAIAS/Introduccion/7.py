class Mascota:
    def __init__(self, nombre):
        self.nombre = nombre
        self.energia = 50

    def alimentar(self):
        self.energia = min(100, self.energia + 20)
        print(f"{self.nombre} fue alimentado. Energía actual: {self.energia}")

    def jugar(self):
        self.energia = max(0, self.energia - 15)
        print(f"{self.nombre} jugó. Energía actual: {self.energia}")

# Ejemplo
m1 = Mascota("Firulais")
m2 = Mascota("Michi")
m1.alimentar()
m1.jugar()
m2.alimentar()
m2.jugar()
