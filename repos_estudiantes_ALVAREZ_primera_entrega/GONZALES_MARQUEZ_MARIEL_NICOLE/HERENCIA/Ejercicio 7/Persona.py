class Persona:
    def __init__(self, nombre, paterno, materno, edad):
        self._nombre = nombre
        self._paterno = paterno
        self._materno = materno
        self._edad = edad

    def mostrar(self):
        print(f"Nombre: {self._nombre} {self._paterno} {self._materno}, Edad: {self._edad}")


class Docente(Persona):
    def __init__(self, nombre, paterno, materno, edad, sueldo, reg_profesional):
        super().__init__(nombre, paterno, materno, edad)
        self.sueldo = sueldo
        self.reg_profesional = reg_profesional

    def mostrar(self):
        super().mostrar()
        print(f"Sueldo: {self.sueldo}, Registro Profesional: {self.reg_profesional}")


class Estudiante(Persona):
    def __init__(self, nombre, paterno, materno, edad, ru, matricula):
        super().__init__(nombre, paterno, materno, edad)
        self.ru = ru
        self.matricula = matricula

    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru}, Matrícula: {self.matricula}")

    def modificarEdad(self, nueva_edad):
        self._edad = nueva_edad

    @staticmethod
    def promedio(estudiantes):
        if len(estudiantes) == 0:
            return 0
        return sum(e._edad for e in estudiantes) / len(estudiantes)


if __name__ == "__main__":
    e1 = Estudiante("Luis", "Pérez", "Gómez", 20, "RU001", "MAT100")
    e2 = Estudiante("Ana", "López", "Díaz", 22, "RU002", "MAT200")
    d1 = Docente("Carlos", "Mendoza", "Rojas", 22, 5000, "PROF123")

    e1.mostrar()
    e2.mostrar()
    d1.mostrar()

    print("Promedio edad estudiantes:", Estudiante.promedio([e1, e2]))

    e1.modificarEdad(23)
    print("Edad modificada de estudiante 1:", e1._edad)

    if e1._edad == d1._edad or e2._edad == d1._edad:
        print("Uno de los estudiantes tiene la misma edad que el docente.")
    else:
        print("Ningún estudiante tiene la misma edad que el docente.")
