#Nicol Yanina Ticona Aduviri
#R.U: 1855987
class Persona:
    def __init__(self, nombre, apellido, ci):
        self.nombre = nombre
        self.apellido = apellido
        self.ci = ci

    def mostrar_datos(self):
        print(f"Nombre: {self.nombre} {self.apellido}")
        print(f"CI: {self.ci}")
class Cliente(Persona):
    def __init__(self, nombre, apellido, ci, nro_compra, id_cliente):
        super().__init__(nombre, apellido, ci)
        self.nro_compra = nro_compra
        self.id_cliente = id_cliente

    def mostrar_datos(self):
        super().mostrar_datos()
        print(f"Nro de Compra: {self.nro_compra}")
        print(f"ID Cliente: {self.id_cliente}")
        print("-----------------------------")
class Jefe(Persona):
    def __init__(self, nombre, apellido, ci, sucursal, tipo):
        super().__init__(nombre, apellido, ci)
        self.sucursal = sucursal
        self.tipo = tipo

    def mostrar_datos(self):
        super().mostrar_datos()
        print(f"Sucursal: {self.sucursal}")
        print(f"Tipo: {self.tipo}")
        print("-----------------------------")

if __name__ == "__main__":
    cliente1 = Cliente("Juan", "Perez", "123456", "C001", "CL1001")
    jefe1 = Jefe("Ana", "Gomez", "789012", "Sucursal Central", "General")

    cliente1.mostrar_datos()
    jefe1.mostrar_datos()
