class Producto:
    def __init__(self,nombre,precio,stock):
        self.nombre=nombre
        self.precio=precio
        self.stock=stock
    def vender(self,x):
        if x>self.stock:
            print("no hay suficiente cantidad del producto")
        else:
            print("Se cobro: "+str(x*self.precio))
            self.stock-=x
    def reabastecer(self,x):
        self.stock+=x
producto1=Producto("licuadora",500,10);
producto2=Producto("escoba",15,20);
producto1.vender(1)
producto2.vender(3)
producto1.reabastecer(5)
producto2.reabastecer(3)
print(producto1.nombre+" : "+str(producto1.stock))
print(producto2.nombre+" : "+str(producto2.stock))
