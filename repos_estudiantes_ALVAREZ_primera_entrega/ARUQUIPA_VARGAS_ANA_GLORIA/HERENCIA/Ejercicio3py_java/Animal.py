class Animal:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def desplazarse(self):
        print(f"{self.nombre} se desplaza")

class Leon(Animal):
    def desplazarse(self):
        print(f"{self.nombre} camina")

class Pinguino(Animal):
    def desplazarse(self):
        print(f"{self.nombre} nada")

class Canguro(Animal):
    def desplazarse(self):
        print(f"{self.nombre} salta")

animales = [
    Leon("Simba", 5),
    Pinguino("Magu", 3),
    Canguro("Kanga", 4)
]

for animal in animales:
    animal.desplazarse()
