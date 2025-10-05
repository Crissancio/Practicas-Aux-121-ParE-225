
class Animal:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def desplazarse(self):
        print("Desplazamiento generico")

class Leon(Animal):
    def desplazarse(self):
        print("Camina")

class Pinguino(Animal):
    def desplazarse(self):
        print("Nada")

class Canguro(Animal):
    def desplazarse(self):
        print("Salta")


animales = [Leon("Simba",5), Pinguino("Pingo",3), Canguro("Kang",4)]
for a in animales:
    a.desplazarse()
