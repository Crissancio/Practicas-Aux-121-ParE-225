class Mascota:
    def __init__(self, nombre, tipo):
        self.nombre = nombre
        self.tipo = tipo
        self.energia = 50  

    def alimentar(self):
        self.energia += 20
        if self.energia > 100:
            self.energia = 100
        print(f"{self.nombre} fue alimentada. Energía: {self.energia}")

    def jugar(self):
        self.energia -= 15
        if self.energia < 0:
            self.energia = 0
        print(f"{self.nombre} jugó. Energía: {self.energia}")

    def mostrar_energia(self):
        print(f"{self.nombre} ({self.tipo}) tiene energía: {self.energia}")



if __name__ == "__main__":
    m1 = Mascota("Firulais", "Perro")
    m2 = Mascota("Michi", "Gato")

    m1.mostrar_energia()
    m2.mostrar_energia()

    m1.alimentar()
    m2.alimentar()

    
    m1.jugar()
    m2.jugar()

    m1.mostrar_energia()
    m2.mostrar_energia()
