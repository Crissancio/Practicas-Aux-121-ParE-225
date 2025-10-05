
class Persona:
    def __init__(self, nombre, ci):
        self.nombre = nombre
        self.ci = ci

class Estudiante(Persona):
    def __init__(self, nombre, ci, carrera):
        super().__init__(nombre, ci)
        self.carrera = carrera

    def mostrar(self):
        print(f"Estudiante: {self.nombre} | CI: {self.ci} | Carrera: {self.carrera}")

# Ejemplo
e1 = Estudiante("Ana López", 123456, "Informática")
e1.mostrar()
