class Producto:
    # a) 
    def __init__(self, nombre, precio, stock):
        self.nombre=nombre
        self.precio=precio
        self.stock=stock

    # b) 
    def vender(self, cantidad):
        if cantidad<=self.stock:
            self.stock-=cantidad
        else:
            print("Stock insuficiente")

    # c) 
    def reabastecer(self, cantidad):
        self.stock+=cantidad


prod=Producto("Manzanas", 2.5, 50)
print("actualmente tienes",prod.nombre," ",prod.stock)
prod.vender(10)  
print("vendiendo X ",prod.nombre,". . . .")
print("Stock ahora:", prod.stock)
prod.reabastecer(20)
print("reabasteciendo....")
print("Stock actual:", prod.stock)
