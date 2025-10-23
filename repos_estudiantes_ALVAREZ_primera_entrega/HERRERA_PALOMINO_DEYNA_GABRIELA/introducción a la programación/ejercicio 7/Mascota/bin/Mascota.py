class Mascota:
    def __init__(self, nombre,tipo, energia=50):
        self.nombre = nombre
        self.tipo=tipo
        self.energia = energia
    def alimentar(self):
        self.energia += 20
        if self.energia > 100:
            self.energia = 100
        print(f"{self.nombre} fue alimentado. Energía actual: {self.energia}")
    def jugar(self):
        self.energia -= 15
        if self.energia < 0:
            self.energia = 0
        print(f"{self.nombre} jugó. Energía actual: {self.energia}")
    def mostrar_energia(self):
        print(f"Energía de {self.nombre}: {self.energia}")
if __name__ == "__main__":
    m1 = Mascota("coco","gato", 45)
    m2 = Mascota("cookie", "gato", 62)

    m1.mostrar_energia()
    m2.mostrar_energia()

    m1.alimentar()
    m2.alimentar()

   