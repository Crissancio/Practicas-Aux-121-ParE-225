class Empleado:
    def __init__(self, nombre, sueldomes):
        self.nombre = nombre
        self.sueldomes = sueldomes

    def mostrar(self):
        print(f"Nombre: {self.nombre}, Sueldo mensual: {self.sueldomes}")

    def sueldoTotal(self):
        return self.sueldomes

class Administrativo(Empleado):
    def __init__(self, nombre, sueldomes, cargo):
        super().__init__(nombre, sueldomes)
        self.cargo = cargo

    def mostrar(self):
        super().mostrar()
        print(f"Cargo: {self.cargo}")

    def sueldoTotal(self):
        return self.sueldomes

class Chef(Empleado):
    def __init__(self, nombre, sueldomes, horaExtra, tipo, sueldoHora):
        super().__init__(nombre, sueldomes)
        self.horaExtra = horaExtra
        self.tipo = tipo
        self.sueldoHora = sueldoHora

    def mostrar(self):
        super().mostrar()
        print(f"Tipo: {self.tipo}, Horas extra: {self.horaExtra}, Sueldo por hora: {self.sueldoHora}")

    def sueldoTotal(self):
        return self.sueldomes + (self.horaExtra * self.sueldoHora)

class Mesero(Empleado):
    def __init__(self, nombre, sueldomes, propina, horaExtra, sueldoHora):
        super().__init__(nombre, sueldomes)
        self.propina = propina
        self.horaExtra = horaExtra
        self.sueldoHora = sueldoHora

    def mostrar(self):
        super().mostrar()
        print(f"Propina: {self.propina}, Horas extra: {self.horaExtra}, Sueldo por hora: {self.sueldoHora}")

    def sueldoTotal(self):
        return self.sueldomes + (self.horaExtra * self.sueldoHora) + self.propina


chef1 = Chef("Remy", 2500, 10, "Principal", 20)
mesero1 = Mesero("Linguini", 1200, 150, 5, 15)
mesero2 = Mesero("Colette", 1300, 200, 8, 15)
admin1 = Administrativo("Anton", 2000, "Contador")
admin2 = Administrativo("Skinner", 2200, "Gerente")

empleados = [chef1, mesero1, mesero2, admin1, admin2]

X = 2200
print(f"=== Empleados con sueldo mensual igual a {X} ===")
for e in empleados:
    if e.sueldomes == X:
        e.mostrar()

print("\n=== Sueldo total de todos los empleados ===")
for e in empleados:
    e.mostrar()
    print(f"Sueldo Total: {e.sueldoTotal():.2f}\n")
