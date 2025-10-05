class Producto:
    def __init__(self, nombre, precio, stock):
        self.nombre = nombre
        self.precio = precio
        self.stock = stock

    def vender(self, cantidad):
        if cantidad <= self.stock:
            self.stock -= cantidad
            print(f"Se vendieron {cantidad} unidades de {self.nombre}. Stock restante: {self.stock}")
        else:
            print(f"No hay suficiente stock para vender {cantidad} unidades de {self.nombre}. Stock disponible: {self.stock}")

    def reabastecer(self, cantidad):
        self.stock += cantidad
        print(f"Se reabastecieron {cantidad} unidades de {self.nombre}. Stock actual: {self.stock}")

producto1 = Producto("Camiseta", 20.0, 50)
print(f"Producto: {producto1.nombre}, Precio: {producto1.precio}, Stock: {producto1.stock}")
producto1.vender(10)
producto1.reabastecer(20)
print(f"Producto: {producto1.nombre}, Precio: {producto1.precio}, Stock: {producto1.stock}")