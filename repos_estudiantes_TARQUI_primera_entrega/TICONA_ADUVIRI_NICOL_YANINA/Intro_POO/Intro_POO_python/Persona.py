class Persona:
    def __init__(self, nombre, paterno, materno, edad, ci):
        self.nombre = nombre
        self.paterno = paterno
        self.materno = materno
        self.edad = edad
        self.ci = ci

    def mostrarDatos(self):
        print(f"Nombre: {self.nombre} {self.paterno} {self.materno}")
        print(f"Edad: {self.edad}")
        print(f"CI: {self.ci}")
        print("-------------------------")

    def mayorDeEdad(self):
        return self.edad >= 18

    def modificarEdad(self, nuevo):
        self.edad = nuevo


    def getPaterno(self):
        return self.paterno

if __name__ == "__main__":

    p1 = Persona("Carlos", "Perez", "Lopez", 20, "1234567")
    p2 = Persona("Ana", "Perez", "Gomez", 17, "9876543")

    p1.mostrarDatos()
    p2.mostrarDatos()

    print("Carlos es mayor de edad" if p1.mayorDeEdad() else "Carlos es menor de edad")
    print("Ana es mayor de edad" if p2.mayorDeEdad() else "Ana es menor de edad")

    p2.modificarEdad(18)
    print("Nueva edad de Ana: ")
    p2.mostrarDatos()

    if p1.getPaterno() == p2.getPaterno():
        print(f"Ambos tienen el mismo apellido paterno: {p1.getPaterno()}")
    else:
        print("Tienen diferentes apellidos paternos.")
