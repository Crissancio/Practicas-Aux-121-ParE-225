class Persona:
    def __init__(self, nombre):
        self.nombre = nombre

class Empleado:
    def __init__(self, sueldo):
        self.sueldo = sueldo

class Policia:
    def __init__(self, grado):
        self.grado = grado

class JefePolicia(Persona, Empleado, Policia):
    def __init__(self, nombre, sueldo, grado):
        Persona.__init__(self, nombre)
        Empleado.__init__(self, sueldo)
        Policia.__init__(self, grado)

    def mostrar(self):
        print(f"Nombre: {self.nombre} | Sueldo: {self.sueldo} | Grado: {self.grado}")

# Ejemplo
j1 = JefePolicia("Mario", 4500, "Capitán")
j2 = JefePolicia("Carlos", 5000, "Teniente")
j1.mostrar()
j2.mostrar()
if j1.sueldo > j2.sueldo:
    print(f"{j1.nombre} gana más.")
else:
    print(f"{j2.nombre} gana más.")
#FALTA C