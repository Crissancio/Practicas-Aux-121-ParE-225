from abc import ABC , abstractmethod

#Clase Abstracta
class Animal(ABC):
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    @abstractmethod
    def desplazarse(self):
        pass

class Leon(Animal):
    def __init__(self, nombre, edad):
        super().__init__(nombre, edad)

    def desplazarse(self):
        print("El leon " + self.nombre + " esta caminando con fuerza por la sabana.")

class Pinguino(Animal):
    def __init__(self, nombre, edad):
        super().__init__(nombre, edad)

    def desplazarse(self):
        print("El pingüino " + self.nombre + " se desliza sobre el hielo.")

class Canguro(Animal):
    def __init__(self, nombre, edad):
        super().__init__(nombre, edad)

    def desplazarse(self):
        print("El canguro " + self.nombre + " salta con sus patas traseras.")

leon = Leon("Simba", 5)
pinguino = Pinguino("Pingu", 3)
canguro = Canguro("Kangy", 4)

leon.desplazarse()
pinguino.desplazarse()
canguro.desplazarse()