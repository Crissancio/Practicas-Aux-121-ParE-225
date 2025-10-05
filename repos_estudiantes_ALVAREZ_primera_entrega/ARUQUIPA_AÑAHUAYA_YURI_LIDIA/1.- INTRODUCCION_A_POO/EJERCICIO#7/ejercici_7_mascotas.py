class Mascota:
    def __init__(self, nombre, tipo, energia):
        self.nombre = nombre
        self.tipo = tipo
        self.energia = energia

    def alimentar(self):
        """
        Sube la energía en +20, pero el máximo es 100.
        """
        self.energia += 20
        if self.energia > 100:
            self.energia = 100
        print(self.nombre, "(" + self.tipo + ")", "fue alimentado. Energía actual:", self.energia)

    def jugar(self):
        """
        Baja la energía en -15, pero el mínimo es 0.
        """
        self.energia -= 15
        if self.energia < 0:
            self.energia = 0
        print(self.nombre, "(" + self.tipo + ")", "jugó. Energía actual:", self.energia)


# ----------------- Programa de prueba -----------------
def main():
    # c) Crear dos mascotas
    mascota1 = Mascota("Firulais", "Perro", 50)
    mascota2 = Mascota("Michi", "Gato", 80)

    # Alimentarlas
    mascota1.alimentar()
    mascota2.alimentar()

    # Hacerlas jugar
    mascota1.jugar()
    mascota2.jugar()


if __name__ == "__main__":
    main()
