class Empleado:
    def __init__(self, nombre, sueldomes):
        self.nombre = nombre
        self.sueldomes = sueldomes

    def sueldo_total(self):
        return self.sueldomes

class Administrativo(Empleado):
    def __init__(self, nombre, sueldomes, cargo):
        super().__init__(nombre, sueldomes)
        self.cargo = cargo

class Chef(Empleado):
    def __init__(self, nombre, sueldomes, horaExtra, tipo, sueldoHora):
        super().__init__(nombre, sueldomes)
        self.horaExtra = horaExtra
        self.tipo = tipo
        self.sueldoHora = sueldoHora

    def sueldo_total(self):
        return self.sueldomes + self.horaExtra * self.sueldoHora

class Mesero(Empleado):
    def __init__(self, nombre, sueldomes, propina, horaExtra, sueldoHora):
        super().__init__(nombre, sueldomes)
        self.propina = propina
        self.horaExtra = horaExtra
        self.sueldoHora = sueldoHora

    def sueldo_total(self):
        return self.sueldomes + (self.horaExtra * self.sueldoHora) + self.propina

def mostrar_empleados_por_sueldo(empleados, sueldo_busqueda):
    print(f"\nEmpleados con sueldo mensual igual a {sueldo_busqueda}:")
    for emp in empleados:
        if emp.sueldomes == sueldo_busqueda:
            print(f"- {emp.nombre} ({type(emp).__name__})")

def main():
    empleados = [
        Chef("Carlos", 3000, horaExtra=10, tipo="Ejecutivo", sueldoHora=50),
        Mesero("Ana", 2000, propina=150, horaExtra=5, sueldoHora=30),
        Mesero("Luis", 2100, propina=100, horaExtra=4, sueldoHora=35),
        Administrativo("Sofía", 2500, cargo="Recursos Humanos"),
        Administrativo("Pedro", 2500, cargo="Contabilidad")
    ]

    print("Sueldo total de cada empleado:")
    for emp in empleados:
        print(f"{emp.nombre} ({type(emp).__name__}): {emp.sueldo_total()}")

    X = 2500
    mostrar_empleados_por_sueldo(empleados, X)

if __name__ == "__main__":
    main()
