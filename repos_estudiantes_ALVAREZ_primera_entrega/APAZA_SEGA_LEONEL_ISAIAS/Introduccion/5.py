class Persona:
    def __init__(self, nombre, paterno, materno, edad, ci):
        self.nombre = nombre
        self.paterno = paterno
        self.materno = materno
        self.edad = edad
        self.ci = ci

    def mostrarDatos(self):
        print(f"{self.nombre} {self.paterno} {self.materno}, {self.edad} años, CI: {self.ci}")

    def mayorDeEdad(self):
        return self.edad >= 18

    def modificarEdad(self, nueva_edad):
        self.edad = nueva_edad

# Ejemplo
p1 = Persona("Ana", "López", "García", 22, 12345)
p2 = Persona("Juan", "López", "Mendoza", 17, 67890)
p1.mostrarDatos()
print("¿Mayor de edad?", p1.mayorDeEdad())
print("¿Mismo apellido paterno?", p1.paterno == p2.paterno)
