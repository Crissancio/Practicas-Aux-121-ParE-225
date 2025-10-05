class Persona:
    def __init__(self, nombre, apellido, ci):
        self.nombre = nombre
        self.apellido = apellido
        self.ci = ci

    def method(self, tipo):
        print(f"Método ejecutado con tipo: {tipo}")

    def mostrar_info(self):
        print(f"{self.nombre} {self.apellido}, CI: {self.ci}")


class Cliente(Persona):
    def __init__(self, nombre, apellido, ci, nro_compra, id_cliente):
        super().__init__(nombre, apellido, ci)
        self.nro_compra = nro_compra
        self.id_cliente = id_cliente

    def mostrar_info(self):
        print(f"Cliente: {self.nombre} {self.apellido}, CI: {self.ci}, Nº Compra: {self.nro_compra}, ID Cliente: {self.id_cliente}")


class Jefe(Persona):
    def __init__(self, nombre, apellido, ci, sucursal, tipo):
        super().__init__(nombre, apellido, ci)
        self.sucursal = sucursal
        self.tipo = tipo

    def mostrar_info(self):
        print(f"Jefe: {self.nombre} {self.apellido}, CI: {self.ci}, Sucursal: {self.sucursal}, Tipo: {self.tipo}")
