
class Empleado:
    def __init__(self, nombre, sueldo_mes):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes

    def mostrar_datos(self):
        print(f"Empleado - Nombre: {self.nombre}, Sueldo mensual: {self.sueldo_mes}")

    def sueldo_total(self):
        return self.sueldo_mes


class Administrativo(Empleado):
    def __init__(self, nombre, sueldo_mes, cargo):
        super().__init__(nombre, sueldo_mes)
        self.cargo = cargo

    def mostrar_datos(self):
        print(f"Administrativo - Nombre: {self.nombre}, Cargo: {self.cargo}, Sueldo mensual: {self.sueldo_mes}")

    def sueldo_total(self):
        return self.sueldo_mes


class Chef(Empleado):
    def __init__(self, nombre, sueldo_mes, hora_extra, sueldo_hora, tipo):
        super().__init__(nombre, sueldo_mes)
        self.hora_extra = hora_extra
        self.sueldo_hora = sueldo_hora
        self.tipo = tipo

    def mostrar_datos(self):
        print(f"Chef - Nombre: {self.nombre}, Tipo: {self.tipo}, "
              f"Sueldo mensual: {self.sueldo_mes}, Horas extra: {self.hora_extra}, Sueldo por hora: {self.sueldo_hora}")

    def sueldo_total(self):
        return self.sueldo_mes + (self.hora_extra * self.sueldo_hora)


class Mesero(Empleado):
    def __init__(self, nombre, sueldo_mes, hora_extra, sueldo_hora, propina):
        super().__init__(nombre, sueldo_mes)
        self.hora_extra = hora_extra
        self.sueldo_hora = sueldo_hora
        self.propina = propina

    def mostrar_datos(self):
        print(f"Mesero - Nombre: {self.nombre}, Sueldo mensual: {self.sueldo_mes}, "
              f"Horas extra: {self.hora_extra}, Sueldo por hora: {self.sueldo_hora}, Propina: {self.propina}")

    def sueldo_total(self):
        return self.sueldo_mes + (self.hora_extra * self.sueldo_hora) + self.propina

def main():
    chef1 = Chef("Juan", 2000, 10, 50, "Italiano")
    mesero1 = Mesero("Pedro", 1200, 5, 30, 150)
    mesero2 = Mesero("Luis", 1100, 8, 25, 200)
    admin1 = Administrativo("Ana", 1800, "Contabilidad")
    admin2 = Administrativo("Marta", 1800, "Recepción")

    empleados = [chef1, mesero1, mesero2, admin1, admin2]

    X = 1800
    print(f"\nEmpleados con sueldo mensual igual a {X}:")
    encontrados = False
    for e in empleados:
        if e.sueldo_mes == X:
            e.mostrar_datos()
            encontrados = True
    if not encontrados:
        print("Ningún empleado tiene ese sueldo.")

    print("\nSueldo total de cada empleado:")
    for e in empleados:
        print(f"{e.nombre} - Sueldo total: {e.sueldo_total()}")


if __name__ == "__main__":
    main()
