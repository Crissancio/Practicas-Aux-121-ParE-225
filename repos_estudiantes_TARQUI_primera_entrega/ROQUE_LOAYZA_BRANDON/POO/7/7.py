class Mascota:
    def __init__(self, nombre, energia=50):
        self.nombre = nombre
        self.energia = energia
    def alimentar(self):
        self.energia += 20
        if self.energia > 100:
            self.energia = 100
        return self.energia
    def jugar(self):
        self.energia -= 15
        if self.energia < 0:
            self.energia = 0
        return self.energia

if __name__ == "__main__":
    m1 = Mascota("Fido", 80)
    m2 = Mascota("Luna", 10)
    print(m1.energia)
    print(m1.alimentar())
    print(m1.jugar())
    print(m2.energia)
    print(m2.alimentar())
    print(m2.jugar())
