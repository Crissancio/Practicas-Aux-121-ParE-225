class Producto:
    def __init__(self, nombre, precio, stock):
        self.nombre = nombre
        self.precio = precio
        self.stock = stock
    def vender(self, cantidad):
        if cantidad <= 0:
            return False
        if cantidad > self.stock:
            return False
        self.stock -= cantidad
        return True
    def reabastecer(self, cantidad):
        if cantidad > 0:
            self.stock += cantidad
            return True
        return False

if __name__ == "__main__":
    p = Producto("Jugo", 5.0, 10)
    ok1 = p.vender(3)
    print(ok1, p.stock)
    ok2 = p.reabastecer(5)
    print(ok2, p.stock)
    ok3 = p.vender(20)
    print(ok3, p.stock)
