
class Animal:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def desplazarse(self):
        print(f"{self.nombre} se desplaza.")


class Leon(Animal):
    def desplazarse(self):
        print(f"{self.nombre} c leon nomas camina.")

class Pinguino(Animal):
    def desplazarse(self):
        print(f"{self.nombre} nada y es un pinguimo OMG .")

class Canguro(Animal):
    def desplazarse(self):
        print(f"{self.nombre} salta demasiado alto xd .")



if __name__ == "__main__":
    animales = [
        Leon("Simba", 5),
        Pinguino("Pingu", 3),
        Canguro("Kangoo", 6)
    ]

    for animal in animales:
        animal.desplazarse()
