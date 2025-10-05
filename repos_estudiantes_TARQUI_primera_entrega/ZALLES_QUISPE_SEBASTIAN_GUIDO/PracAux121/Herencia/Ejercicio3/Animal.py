class Animal:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def desplazarse(self):
        print(f"{self.nombre} se está desplazando.")

class Leon(Animal):
    def desplazarse(self):
        print(f"{self.nombre} camina o corre.")

class Pinguino(Animal):
    def desplazarse(self):
        print(f"{self.nombre} nada o camina.")

class Canguro(Animal):
    def desplazarse(self):
        print(f"{self.nombre} salta o camina.")

animales = [
    Leon("Simba", 5),
    Pinguino("Pingu", 3),
    Canguro("Kanga", 4)
]

for animal in animales:
    animal.desplazarse()