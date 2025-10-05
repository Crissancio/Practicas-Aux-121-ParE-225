# Clase base
class Animal:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def desplazarse(self):
        print(f"{self.nombre} se desplaza de alguna manera.")
class Leon(Animal):
    def desplazarse(self):
        print(f"{self.nombre} camina con fuerza por la sabana.")
class Pinguino(Animal):
    def desplazarse(self):
        print(f"{self.nombre} nada y se desliza por el hielo.")
class Canguro(Animal):
    def desplazarse(self):
        print(f"{self.nombre} salta ágilmente por el terreno.")
animales = [
    Leon("Simba", 5),
    Pinguino("Pingu", 3),
    Canguro("Jack", 6)]
for animal in animales:
    animal.desplazarse()
