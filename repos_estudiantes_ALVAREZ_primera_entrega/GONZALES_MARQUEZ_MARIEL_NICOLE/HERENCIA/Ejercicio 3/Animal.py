

class Animal:
    def __init__(self, nombre: str, edad: int):
        self.nombre = nombre
        self.edad = edad

    def desplazarse(self):
        print(f"{self.nombre} se desplaza de alguna manera.")


class Leon(Animal):
    def desplazarse(self):
        print(f"{self.nombre} camina y corre por la sabana.")


class Pinguino(Animal):
    def desplazarse(self):
        print(f"{self.nombre} nada y se desliza sobre el hielo.")


class Canguro(Animal):
    def desplazarse(self):
        print(f"{self.nombre} se desplaza saltando.")



if __name__ == "__main__":
    
    animales = [
        Leon("Simba", 5),
        Pinguino("Pingu", 3),
        Canguro("Kangy", 4)
    ]

    for animal in animales:
        animal.desplazarse()
