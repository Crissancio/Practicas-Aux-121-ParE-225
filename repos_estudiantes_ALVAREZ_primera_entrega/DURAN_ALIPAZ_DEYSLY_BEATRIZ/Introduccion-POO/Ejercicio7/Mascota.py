class Mascota:

    def __init__(self, nombre, tipo, energia):
        self.nombre = nombre
        self.tipo = tipo
        self.energia = energia

    def alimentar(self):
        self.energia += 20
        if self.energia > 100:
            self.energia = 100
        print(f"{self.nombre} ha sido alimentado. Energía actual: {self.energia}")

    def jugar(self):
        self.energia -= 15
        if self.energia < 0:
            self.energia = 0
        print(f"{self.nombre} jugó un rato. Energía actual: {self.energia}")

perro = Mascota("Firulais", "Perro", 60)
gato = Mascota("Mishi", "Gato", 45)

perro.alimentar()
gato.alimentar()

perro.jugar()
gato.jugar()


