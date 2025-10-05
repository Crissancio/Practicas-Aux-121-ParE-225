
class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def mostrar(self):
        print(self.nombre, self.edad)

class Estudiante(Persona):
    def modificarEdad(self, nueva):
        self.edad = nueva

class Docente(Persona):
    def __init__(self, nombre, edad, materia):
        super().__init__(nombre, edad)
        self.materia = materia

def promedio(e1, e2):
    return (e1.edad + e2.edad) / 2


e1 = Estudiante("Juan", 20)
e2 = Estudiante("Maria", 22)
d1 = Docente("Carlos", 22, "POO")
e1.mostrar()
e2.mostrar()
d1.mostrar()
print("Promedio:", promedio(e1, e2))
if e1.edad == d1.edad or e2.edad == d1.edad:
    print("Misma edad")
