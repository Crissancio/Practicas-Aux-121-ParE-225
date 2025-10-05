class Persona:
    def __init__(self, nombre, apellido, ci):
        self.nombre = nombre
        self.apellido = apellido
        self.ci = ci
    def mostrarInfo(self):
        print(f"Nombre: {self.nombre} {self.apellido}, CI: {self.ci}")
class Cliente(Persona):
    def __init__(self, nombre, apellido, ci, nroCompra, idCliente):
        super().__init__(nombre, apellido, ci)
        self.nroCompra = nroCompra
        self.idCliente = idCliente
    def mostrarInfo(self):
        super().mostrarInfo()
        print(f"Nro Compra: {self.nroCompra}, ID Cliente: {self.idCliente}")
class Jefe(Persona):
    def __init__(self, nombre, apellido, ci, sucursal, tipo):
        super().__init__(nombre, apellido, ci)
        self.sucursal = sucursal
        self.tipo = tipo
    def mostrarInfo(self):
        super().mostrarInfo()
        print(f"Sucursal: {self.sucursal}, Tipo: {self.tipo}")
c1 = Cliente("Juan", "Vargas", "1234567", "C-001", "CL-10")
j1 = Jefe("María", "Gómez", "7654321", "Sucursal Norte", "General")

print("Información del cliente:")
c1.mostrarInfo()
print("\nInformación del jefe:")
j1.mostrarInfo()
