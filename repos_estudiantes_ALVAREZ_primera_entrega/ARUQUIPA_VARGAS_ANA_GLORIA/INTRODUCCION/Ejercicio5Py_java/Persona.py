class Persona:
    def __init__(self, nombre, paterno, materno, edad, ci):
        self.nombre = nombre
        self.paterno = paterno
        self.materno = materno
        self.edad = edad
        self.ci = ci

    def mostrarDatos(self):
        print(f"Nombre completo: {self.nombre} {self.paterno} {self.materno}")
        print(f"Edad: {self.edad}")
        print(f"CI: {self.ci}")

    def mayorDeEdad(self):
        if self.edad >= 18:
            print(f"{self.nombre} es mayor de edad.")
            return True
        else:
            print(f"{self.nombre} NO es mayor de edad.")
            return False

    def modificarEdad(self, nuevo):
        if nuevo >= 0:
            print(f"Edad modificada de {self.edad} a {nuevo}.")
            self.edad = nuevo
        else:
            print("Edad inválida. No se realizó el cambio.")

    def getApellidoPaterno(self):
        return self.paterno
