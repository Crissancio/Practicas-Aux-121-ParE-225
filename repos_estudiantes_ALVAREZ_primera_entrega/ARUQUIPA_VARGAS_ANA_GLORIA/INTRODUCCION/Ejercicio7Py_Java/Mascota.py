class Mascota:
    def __init__(self, nombre, tipo, energia):
        self.nombre = nombre
        self.tipo = tipo
        self.energia = energia

    def alimentar(self):
        energia_antes = self.energia
        self.energia = min(self.energia + 20, 100)
        print(f"{self.nombre} fue alimentado. Energía: {energia_antes} , {self.energia}")

    def jugar(self):
        energia_antes = self.energia
        self.energia = max(self.energia - 15, 0)
        print(f"{self.nombre} jugó. Energía: {energia_antes} , {self.energia}")

    def mostrarEnergia(self):
        print(f"Energía de {self.nombre}: {self.energia}")
