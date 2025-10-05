class Persona:
    def __init__(self, nombre, paterno, materno, edad, ci):
        self.nombre = nombre
        self.paterno = paterno
        self.materno = materno
        self.edad = edad
        self.ci = ci

    def mostrarDatos(self):
        print("Nombre completo:", self.nombre, self.paterno, self.materno)
        print("Edad:", self.edad)
        print("CI:", self.ci)

    def mayorDeEdad(self):
        if self.edad >= 18:
            print(self.nombre, "es mayor de edad.")
            return True
        else:
            print(self.nombre, "NO es mayor de edad.")
            return False

    def modificarEdad(self, nuevo):
        self.edad = nuevo
        print("La edad de", self.nombre, "fue modificada a", self.edad)


# ----------------- Programa de prueba -----------------
def main():
    # a) Instanciar dos personas
    persona1 = Persona("Juan", "Perez", "Lopez", 20, "1234567")
    persona2 = Persona("Maria", "Perez", "Gomez", 16, "7654321")

    # b) Mostrar datos
    persona1.mostrarDatos()
    print("-------------------------")
    persona2.mostrarDatos()
    print("----------------------")
    # c) Verificar si son mayores de edad
    persona1.mayorDeEdad()
    persona2.mayorDeEdad()

    # d) Modificar edad de una persona
    persona2.modificarEdad(19)
    persona2.mayorDeEdad()

    # e) Verificar si tienen el mismo apellido paterno
    if persona1.paterno == persona2.paterno:
        print("Ambas personas tienen el mismo apellido paterno:", persona1.paterno)
    else:
        print("No tienen el mismo apellido paterno.")


if __name__ == "__main__":
    main()
