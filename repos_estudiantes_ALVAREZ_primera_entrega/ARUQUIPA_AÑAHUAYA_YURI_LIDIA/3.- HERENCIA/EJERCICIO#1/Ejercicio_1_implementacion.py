# === Clase base Persona ===
class Persona:
    def __init__(self, nombre="", apellido="", ci=""):
        self.nombre = nombre
        self.apellido = apellido
        self.ci = ci

    def mostrar(self):
        print(f"Persona -> {self.nombre} {self.apellido} | CI: {self.ci}")


# === Estudiante (hereda Persona) ===
class Estudiante(Persona):
    def __init__(self, nombre="", apellido="", ci="", carnet="", materia="", nota=0.0):
        super().__init__(nombre, apellido, ci)
        self.carnet = carnet
        self.materia = materia
        self.nota = float(nota)

    def mostrar(self):
        super().mostrar()
        print(f"  [Estudiante] Carnet: {self.carnet} | Materia: {self.materia} | Nota: {self.nota}")


# === Empleado (hereda Persona) ===
class Empleado(Persona):
    def __init__(self, nombre="", apellido="", ci="", carnet="", cargo="", salario=0.0):
        super().__init__(nombre, apellido, ci)
        self.carnet = carnet
        self.cargo = cargo
        self.salario = float(salario)

    def mostrar(self):
        super().mostrar()
        print(f"  [Empleado] Carnet: {self.carnet} | Cargo: {self.cargo} | Salario: {self.salario}")


# === Administrativo (hereda Empleado) ===
class Administrativo(Empleado):
    def __init__(self, nombre="", apellido="", ci="", carnet="", cargo="", salario=0.0, departamento=""):
        super().__init__(nombre, apellido, ci, carnet, cargo, salario)
        self.departamento = departamento

    def mostrar(self):
        super().mostrar()
        print(f"    (Administrativo) Departamento: {self.departamento}")


# === Docente (hereda Empleado) ===
class Docente(Empleado):
    def __init__(self, nombre="", apellido="", ci="", carnet="", cargo="", salario=0.0, materia_imparte=""):
        super().__init__(nombre, apellido, ci, carnet, cargo, salario)
        self.materia_imparte = materia_imparte

    def mostrar(self):
        super().mostrar()
        print(f"    (Docente) Imparte: {self.materia_imparte}")


# === Cliente (hereda Persona) ===
class Cliente(Persona):
    def __init__(self, nombre="", apellido="", ci="", nroCompra="", idCliente=""):
        super().__init__(nombre, apellido, ci)
        self.nroCompra = nroCompra
        self.idCliente = idCliente

    def mostrar(self):
        super().mostrar()
        print(f"  [Cliente] NroCompra: {self.nroCompra} | ID Cliente: {self.idCliente}")


# === Jefe (hereda Persona) ===
class Jefe(Persona):
    def __init__(self, nombre="", apellido="", ci="", sucursal="", tipo=""):
        super().__init__(nombre, apellido, ci)
        self.sucursal = sucursal
        self.tipo = tipo

    def mostrar(self):
        super().mostrar()
        print(f"  [Jefe] Sucursal: {self.sucursal} | Tipo: {self.tipo}")


# === Ejemplo de uso (instanciación y polimorfismo) ===
if __name__ == "__main__":
    e = Estudiante("Ana", "Lopez", "7890123", "E-123", "Matemáticas", 85.5)
    emp = Empleado("Luis", "Perez", "4567890", "EMP-01", "Asistente", 3500.0)
    admin = Administrativo("María", "Gomez", "1234567", "EMP-02", "Admin", 4200.0, "RRHH")
    prof = Docente("Carlos", "Diaz", "2345678", "EMP-03", "Docente", 4800.0, "Física")
    cli = Cliente("Pedro", "Suarez", "3456789", "C-100", "ID-55")
    jefe = Jefe("Rosa", "Torres", "5678901", "Sucursal Central", "Regional")

    lista = [e, emp, admin, prof, cli, jefe]
    for obj in lista:
        obj.mostrar()
        print("-" * 40)
