class Producto:
   
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def __del__(self):
        print(f"El producto {self.nombre} ha sido eliminado del sistema.")

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_precio(self):
        return self.precio

    def set_precio(self, precio):
        self.precio = precio

    def mostrar_info(self):
        print(f"Producto: {self.nombre} | Precio: Bs. {self.precio}")

class Pedido:
    def __init__(self, id_pedido, estado):
        self.id_pedido = id_pedido
        self.estado = estado

    def __del__(self):
        print(f"El pedido #{self.id_pedido} ha sido eliminado del sistema.")

    def get_id_pedido(self):
        return self.id_pedido

    def set_id_pedido(self, id_pedido):
        self.id_pedido = id_pedido

    def get_estado(self):
        return self.estado

    def set_estado(self, estado):
        self.estado = estado

    def mostrar_info(self):
        print(f"Pedido #{self.id_pedido} | Estado: {self.estado}")


producto1 = Producto("Café Latte", 18.50)

pedido1 = Pedido(101, "Registrado")


print("=== Información del Producto ===")
producto1.mostrar_info()

print("\n=== Información del Pedido ===")
pedido1.mostrar_info()
