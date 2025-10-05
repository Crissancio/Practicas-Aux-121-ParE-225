class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def mostrar(self):
        print(f"{self.nombre}, {self.edad} años")

class Estudiante(Persona):
    def modificarEdad(self, nueva):
        self.edad = nueva

class Docente(Persona):
    pass

# Ejemplo
e1 = Estudiante("Luis", 20)
e2 = Estudiante("María", 22)
d1 = Docente("Profesor Pérez", 30)

e1.mostrar()
e2.mostrar()
d1.mostrar()
promedio = (e1.edad + e2.edad) / 2
print("Promedio edad estudiantes:", promedio)
print("¿Edad igual a docente?", e1.edad == d1.edad)
