class Empleado:
    def __init__(self, nombre, sueldomes):
        self.nombre = nombre
        self.sueldomes = sueldomes
    def sueldo_total(self):
        return self.sueldomes
    def __str__(self):
        return f"{self.__class__.__name__}: {self.nombre}, Sueldo mensual: {self.sueldomes}"
class Administrativo(Empleado):
    def __init__(self, nombre, sueldomes, cargo):
        super().__init__(nombre, sueldomes)
        self.cargo = cargo
class Chef(Empleado):
    def __init__(self, nombre, sueldomes, hora_extra, sueldo_hora, tipo):
        super().__init__(nombre, sueldomes)
        self.hora_extra = hora_extra
        self.sueldo_hora = sueldo_hora
        self.tipo = tipo
    def sueldo_total(self):
        return self.sueldomes + (self.hora_extra * self.sueldo_hora)
    
class Mesero(Empleado):
    def __init__(self, nombre, sueldomes, hora_extra, sueldo_hora, propina):
        super().__init__(nombre, sueldomes)
        self.hora_extra = hora_extra
        self.sueldo_hora = sueldo_hora
        self.propina = propina
    def sueldo_total(self):
        return self.sueldomes + (self.hora_extra * self.sueldo_hora) + self.propina

empleados = [
    Chef("Remy", 2500, 10, 15, "Francés"),
    Mesero("Alfredo", 1800, 5, 10, 120),
    Mesero("Colette", 1900, 6, 12, 150),
    Administrativo("Anton", 2200, "Contabilidad"),
    Administrativo("Linguini", 2000, "Recursos Humanos")]
X = 2000
print(f"\nEmpleados con sueldo mensual = {X}:")
for e in empleados:
    if e.sueldomes == X:
        print(f" - {e.nombre} ({e.__class__.__name__})")

print("\nSueldos totales:")
for e in empleados:
    print(f"{e.nombre}: {e.sueldo_total()}")
