class Mascota:
    def __init__(self, nombre, tipo, energia):
        self.nombre = nombre
        self.tipo = tipo
        self.energia = energia

    def alimentar(self):
        """Aumenta la energía en +20, sin pasar de 100."""
        self.energia += 20
        if self.energia > 100:
            self.energia = 100
        print(f"{self.nombre} fue alimentado. Energía actual: {self.energia}")

    def jugar(self):
        """Disminuye la energía en -15, sin bajar de 0."""
        self.energia -= 15
        if self.energia < 0:
            self.energia = 0
        print(f"{self.nombre} jugó un rato. Energía actual: {self.energia}")

if __name__ == "__main__":
    mascota1 = Mascota("Luna", "Gato", 50)
    mascota2 = Mascota("Rocky", "Perro", 70)
    print(f"\nEnergía inicial de {mascota1.nombre}: {mascota1.energia}")
    print(f"Energía inicial de {mascota2.nombre}: {mascota2.energia}\n")
    mascota1.alimentar()
    mascota2.alimentar()
    mascota1.jugar()
    mascota2.jugar()
