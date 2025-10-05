#Nicol Yanina Ticona Aduviri
#R.U: 1855987
class Animal:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def desplazarse(self):
        print(f"{self.nombre} se desplaza de alguna forma.")
class Canguro(Animal):
    def __init__(self, nombre, edad):
        super().__init__(nombre, edad)

    def desplazarse(self):
        print(f"{self.nombre} salta con fuerza sobre sus patas traseras.")
class Leon(Animal):
    def __init__(self, nombre, edad):
        super().__init__(nombre, edad)

    def desplazarse(self):
        print(f"{self.nombre} camina majestuosamente por la sabana.")
class Pinguino(Animal):
    def __init__(self, nombre, edad):
        super().__init__(nombre, edad)

    def desplazarse(self):
        print(f"{self.nombre} nada ágilmente en el agua.")

if __name__ == "__main__":
    a1 = Canguro("Jack", 5)
    a2 = Leon("Simba", 8)
    a3 = Pinguino("Pingu", 3)

    a1.desplazarse()
    a2.desplazarse()
    a3.desplazarse()
