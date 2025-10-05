
class Persona:
    def __init__(self, nombre, paterno, materno, edad):
        self.nombre = nombre
        self.paterno = paterno
        self.materno = materno
        self.edad = edad

    def mostrar(self):
        print(f"Nombre: {self.nombre} {self.paterno} {self.materno}, Edad: {self.edad}")


class Docente(Persona):
    def __init__(self, nombre, paterno, materno, edad, sueldo, regProfesional):
        super().__init__(nombre, paterno, materno, edad)
        self.sueldo = sueldo
        self.regProfesional = regProfesional

    def mostrar(self):
        super().mostrar()
        print(f"Sueldo: {self.sueldo}, Registro Profesional: {self.regProfesional}")


class Estudiante(Persona):
    def __init__(self, nombre, paterno, materno, edad, ru, matricula):
        super().__init__(nombre, paterno, materno, edad)
        self.ru = ru
        self.matricula = matricula

    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru}, Matrícula: {self.matricula}")

    def modificarEdad(self, nueva_edad):
        self.edad = nueva_edad


def promedio(estudiantes):
    if not estudiantes:
        return 0
    suma = sum(e.edad for e in estudiantes)
    return suma / len(estudiantes)


def verificar_edad(estudiantes, docente):
    for e in estudiantes:
        if e.edad == docente.edad:
            print(f"El estudiante {e.nombre} tiene la misma edad que el docente.")
            return
    print("Ningún estudiante tiene la misma edad que el docente.")
