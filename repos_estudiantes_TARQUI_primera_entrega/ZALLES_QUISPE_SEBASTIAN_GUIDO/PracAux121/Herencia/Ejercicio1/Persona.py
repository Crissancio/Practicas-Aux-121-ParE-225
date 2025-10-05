class Persona:
    def __init__(self, nombre, apellido, ci):
        self.nombre = nombre
        self.apellido = apellido
        self.ci = ci

    def metodo_generico(self, dato):
        return f"Procesando {dato}"

class Cliente(Persona):
    def __init__(self, nombre, apellido, ci, nroCompra, idCliente):
        super().__init__(nombre, apellido, ci)
        self.nroCompra = nroCompra
        self.idCliente = idCliente

class Jefe(Persona):
    def __init__(self, nombre, apellido, ci, sucursal, tipo):
        super().__init__(nombre, apellido, ci)
        self.sucursal = sucursal
        self.tipo = tipo

cliente1 = Cliente("Ana", "Gomez", "12345678", "001", "C1001")
jefe1 = Jefe("Luis", "Perez", "87654321", "Sucursal Centro", "Gerente")

print(f"Cliente: {cliente1.nombre} {cliente1.apellido}, Compra: {cliente1.nroCompra}, ID: {cliente1.idCliente}")
print(f"Jefe: {jefe1.nombre} {jefe1.apellido}, Sucursal: {jefe1.sucursal}, Tipo: {jefe1.tipo}")
print(cliente1.metodo_generico("datos cliente"))
print(jefe1.metodo_generico("datos jefe"))