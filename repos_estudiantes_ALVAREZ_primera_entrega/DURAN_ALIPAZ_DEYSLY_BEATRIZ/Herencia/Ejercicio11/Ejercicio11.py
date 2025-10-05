class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

class Empleado:
    def __init__(self, sueldo, antiguedad):
        self.sueldo = sueldo
        self.antiguedad = antiguedad

class Policia:
    def __init__(self, grado, años_servicio):
        self.grado = grado
        self.años_servicio = años_servicio


class JefePolicia(Persona, Empleado, Policia):
    def __init__(self, nombre, edad, sueldo, antiguedad, grado, años_servicio):
        Persona.__init__(self, nombre, edad)
        Empleado.__init__(self, sueldo, antiguedad)
        Policia.__init__(self, grado, años_servicio)

    def mostrar_info(self):
        print(f"Nombre: {self.nombre}, Edad: {self.edad}, Sueldo: {self.sueldo}, Antigüedad: {self.antiguedad}, Grado: {self.grado}, Años de servicio: {self.años_servicio}")

jefe1 = JefePolicia("Juan Perez", 50, 5000, 25, "Mayor", 20)
jefe2 = JefePolicia("Maria Lopez", 45, 6000, 20, "Mayor", 18)

print("Datos de los Jefes de Policía:")
jefe1.mostrar_info()
jefe2.mostrar_info()

if jefe1.sueldo > jefe2.sueldo:
    print(f"\nEl que tiene mayor sueldo es: {jefe1.nombre}")
elif jefe2.sueldo > jefe1.sueldo:
    print(f"\nEl que tiene mayor sueldo es: {jefe2.nombre}")
else:
    print("\nAmbos tienen el mismo sueldo.")

if jefe1.grado == jefe2.grado:
    print(f"Ambos tienen el mismo grado: {jefe1.grado}")
else:
    print(f"Tienen grados diferentes: {jefe1.grado} y {jefe2.grado}")
