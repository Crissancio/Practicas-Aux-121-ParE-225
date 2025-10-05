class Producto:
    def __init__(self, nombre, precio, stock):
        self.nombre = nombre
        self.precio = precio
        self.stock = stock

    def vender(self, cantidad):
        if cantidad <= self.stock:
            self.stock -= cantidad
            total = cantidad * self.precio
            print(f"Se vendieron {cantidad} unidades de {self.nombre}.")
            print(f"Ingreso total: Bs. {total:.2f}")
        else:
            print(f"No hay suficiente stock de {self.nombre}. Stock disponible: {self.stock}")

    def reabastecer(self, cantidad):
        self.stock += cantidad
        print(f"Se reabastecieron {cantidad} unidades de {self.nombre}. Stock actual: {self.stock}")

p1 = Producto("Gaseosa", 8.50, 20)

p1.vender(5)        
p1.reabastecer(10) 
p1.vender(30)      
