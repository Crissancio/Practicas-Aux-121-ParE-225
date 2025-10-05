
class Persona:
    def __init__(self, nombre, ci):
        self.nombre = nombre
        self.ci = ci

class Empleado:
    def __init__(self, sueldo):
        self.sueldo = sueldo

class Policia:
    def __init__(self, grado):
        self.grado = grado

class JefePolicia(Persona, Empleado, Policia):
    def __init__(self, nombre, ci, sueldo, grado):
        Persona.__init__(self, nombre, ci)
        Empleado.__init__(self, sueldo)
        Policia.__init__(self, grado)

    def mostrar(self):
        print(self.nombre, self.ci, self.sueldo, self.grado)


j1 = JefePolicia("Juan",123,5000,"Teniente")
j2 = JefePolicia("Carlos",456,4500,"Sargento")
j1.mostrar()
j2.mostrar()
if j1.sueldo > j2.sueldo:
    print(j1.nombre,"mayor sueldo")
if j1.grado == j2.grado:
    print("Mismo grado")
