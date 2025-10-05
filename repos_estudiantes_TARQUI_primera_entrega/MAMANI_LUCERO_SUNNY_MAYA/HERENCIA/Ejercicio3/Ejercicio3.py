#Ejercicio 3. Crea una clase base Animal y subclases Leon, Pinguino, y Canguro. Agrega
#un método desplazarse().
#a) Crea la clase Animal con atributos nombre y edad, y el método desplazarse().
class Animal:
    def __init__(self,nombre,edad):
        self.nombre=nombre
        self.edad=edad
    def desplazarse(self):
        print(self.nombre+" se esta moviendo")
#b) Cada subclase debe redefinir el método desplazarse() con su forma particular
#(caminar, saltar, nadar).
class Leon(Animal):
    def desplazarse(self):
        print(self.nombre+" esta caminando")
class Pinguino(Animal):
    def desplazarse(self):
        print(self.nombre+" esta nadando")
class Canguro(Animal):
    def desplazarse(self):
        print(self.nombre+" esta saltando")
a1=Leon("Mufasa",3)
a2=Pinguino("Mumble",4)
a3=Canguro("Kanga",5)
#c) Crea un arreglo de animales y haz que cada uno se desplace.
Animales=[a1,a2,a3]
for i in range(3):
    Animales[i].desplazarse()
