class Producto:
    def __init__(self, nombre, precio, stock):
        self.nombre = nombre
        self.precio = precio
        self.stock = stock

    def vender(self, cantidad):
        if cantidad <= self.stock:
            self.stock -= cantidad
            print(f"✅ Venta realizada de {cantidad} {self.nombre}(s).")
        else:
            print("❌ No hay suficiente stock.")

    def reabastecer(self, cantidad):
        self.stock += cantidad
        print(f"Se reabastecieron {cantidad} unidades.")

    def mostrar(self):
        print(f"{self.nombre} - Precio: {self.precio} Bs - Stock: {self.stock}")

# Ejemplo
p1 = Producto("Lapicero", 2.5, 10)
p1.vender(3)
p1.reabastecer(5)
p1.mostrar()
