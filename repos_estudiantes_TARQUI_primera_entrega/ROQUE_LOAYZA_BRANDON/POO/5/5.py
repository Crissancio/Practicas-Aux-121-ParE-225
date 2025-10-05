class Persona:
    def __init__(self, nombre, paterno, materno, edad, ci):
        self.nombre = nombre
        self.paterno = paterno
        self.materno = materno
        self.edad = edad
        self.ci = ci
    def mostrarDatos(self):
        return f"{self.nombre} {self.paterno} {self.materno} {self.edad} {self.ci}"
    def mayorDeEdad(self):
        return self.edad >= 18
    def modificarEdad(self, nuevo):
        self.edad = nuevo

if __name__ == "__main__":
    p1 = Persona("Ana", "Lopez", "Gomez", 17, "1234567")
    p2 = Persona("Carlos", "Lopez", "Perez", 20, "7654321")
    print(p1.mostrarDatos())
    print(p2.mostrarDatos())
    print(p1.mayorDeEdad(), p2.mayorDeEdad())
    p1.modificarEdad(18)
    print(p1.mayorDeEdad())
    print(p1.paterno == p2.paterno)
