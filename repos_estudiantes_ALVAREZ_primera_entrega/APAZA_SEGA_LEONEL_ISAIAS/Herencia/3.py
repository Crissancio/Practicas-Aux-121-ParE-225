class Animal:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def desplazarse(self):
        print(f"{self.nombre} se mueve de forma genérica.")

class Leon(Animal):
    def desplazarse(self):
        print(f"{self.nombre} camina majestuosa y poderosamente.")

class Pinguino(Animal):
    def desplazarse(self):
        print(f"{self.nombre} nada y se desliza sobre el hielo.")

class Canguro(Animal):
    def desplazarse(self):
        print(f"{self.nombre} salta grandes distancias.")

# Ejemplo
animales = [Leon("Simba", 5), Pinguino("Pingo", 3), Canguro("Jack", 6)]
for a in animales:
    a.desplazarse()
