class Producto:
    def __init__(self, nombre, precio, stock):
        self.nombre = nombre
        self.precio = precio
        self.stock = stock

    def vender(self, cantidad):
        if cantidad <= self.stock:
            self.stock -= cantidad
            print(f"Venta realizada: {cantidad} unidades.")
        else:
            print("Stock insuficiente.")

    def reabastecer(self, cantidad):
        self.stock += cantidad
        print(f"Se reabasteció con {cantidad} unidades.")

    def mostrar_datos(self):
        print(f"Producto: {self.nombre} | Precio: {self.precio} | Stock: {self.stock}")

if __name__ == "__main__":
    p1 = Producto("Arroz", 20, 50)
    p1.mostrar_datos()
    p1.vender(10)
    p1.reabastecer(30)
    p1.mostrar_datos()
