
class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

class Estudiante(Persona):
    def __init__(self, nombre, edad, carrera):
        super().__init__(nombre, edad)
        self.carrera = carrera

    def mostrar(self):
        print(self.nombre, self.edad, self.carrera)


e = Estudiante("Luis",21,"Informatica")
e.mostrar()
