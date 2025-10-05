# === Clase base Persona ===
class Persona:
    def __init__(self, nombre="", edad=0):
        self.nombre = nombre
        self.edad = edad

    def mostrar(self):
        print(f"👤 Nombre: {self.nombre}, Edad: {self.edad}")


# === Subclase Estudiante ===
class Estudiante(Persona):
    def __init__(self, nombre="", edad=0, carrera=""):
        super().__init__(nombre, edad)
        self.carrera = carrera

    def mostrar(self):
        print(f"🎓 Estudiante -> Nombre: {self.nombre}, Edad: {self.edad}, Carrera: {self.carrera}")

    def modificarEdad(self, nueva_edad):
        print(f"🧍 Modificando edad de {self.nombre} de {self.edad} a {nueva_edad}...")
        self.edad = nueva_edad

    # Método estático para calcular promedio de edad
    @staticmethod
    def promedio(est1, est2):
        return (est1.edad + est2.edad) / 2


# === Subclase Docente ===
class Docente(Persona):
    def __init__(self, nombre="", edad=0, materia=""):
        super().__init__(nombre, edad)
        self.materia = materia

    def mostrar(self):
        print(f"👨‍🏫 Docente -> Nombre: {self.nombre}, Edad: {self.edad}, Materia: {self.materia}")


# === Programa principal ===
if __name__ == "__main__":
    # a) Instanciar a dos estudiantes y un docente
    est1 = Estudiante("Lucía Ramos", 20, "Informática")
    est2 = Estudiante("Pedro López", 22, "Sistemas")
    doc = Docente("Ana Morales", 22, "Programación II")

    # b) Mostrar información de todos
    print("=== Información inicial ===")
    est1.mostrar()
    est2.mostrar()
    doc.mostrar()

    # c) Calcular promedio de edad de los estudiantes
    promedio_edades = Estudiante.promedio(est1, est2)
    print(f"\n📊 Promedio de edad de los estudiantes: {promedio_edades:.1f} años")

    # d) Modificar edad de un estudiante
    print("\n=== Modificando edad de estudiante ===")
    est1.modificarEdad(21)
    est1.mostrar()

    # e) Verificar si alguno de los estudiantes tiene la misma edad que el docente
    print("\n=== Comparando edades ===")
    if est1.edad == doc.edad:
        print(f"{est1.nombre} tiene la misma edad que la docente {doc.nombre}.")
    elif est2.edad == doc.edad:
        print(f"{est2.nombre} tiene la misma edad que la docente {doc.nombre}.")
    else:
        print("Ningún estudiante tiene la misma edad que el docente.")
