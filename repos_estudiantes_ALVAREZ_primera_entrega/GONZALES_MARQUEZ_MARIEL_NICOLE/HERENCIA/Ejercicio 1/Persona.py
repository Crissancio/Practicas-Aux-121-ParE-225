
class Persona:
    def __init__(self, nombre: str, apellido: str, ci: str):
        self.nombre = nombre
        self.apellido = apellido
        self.ci = ci

    def mostrar_datos(self):
        print(f"Nombre: {self.nombre} {self.apellido}")
        print(f"CI: {self.ci}")


class Cliente(Persona):
    def __init__(self, nombre: str, apellido: str, ci: str, nro_compra: str):
        super().__init__(nombre, apellido, ci)
        self.nro_compra = nro_compra

    def mostrar_datos(self):
        super().mostrar_datos()
        print(f"Número de compra: {self.nro_compra}")


class Jefe(Persona):
    def __init__(self, nombre: str, apellido: str, ci: str, sucursal: str, tipo: str):
        super().__init__(nombre, apellido, ci)
        self.sucursal = sucursal
        self.tipo = tipo

    def mostrar_datos(self):
        super().mostrar_datos()
        print(f"Sucursal: {self.sucursal}")
        print(f"Tipo: {self.tipo}")


if __name__ == "__main__":
    cliente1 = Cliente("Juan", "Pérez", "1234567", "C-001")
    jefe1 = Jefe("Ana", "Gómez", "7654321", "Central", "General")

    print("=== Cliente ===")
    cliente1.mostrar_datos()

    print("\n=== Jefe ===")
    jefe1.mostrar_datos()
