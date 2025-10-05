# Ejercicio 3 - Introducción a POO (Producto)

class Producto:
    def __init__(self, nombre, precio, stock):
        self.nombre = nombre
        self.precio = precio
        self.stock = stock

    def vender(self, cantidad):
        """
        Vende una cierta cantidad de productos.
        Resta del stock si hay suficiente.
        """
        if cantidad <= self.stock:
            self.stock -= cantidad
            print("Se vendieron", cantidad, self.nombre + "(s).")
            print("Ingresos generados: Bs.", cantidad * self.precio)
        else:
            print("No hay suficiente stock. Solo hay", self.stock, "unidades disponibles.")

    def reabastecer(self, cantidad):
        """
        Aumenta el stock en la cantidad indicada.
        """
        self.stock += cantidad
        print("Se reabasteció el stock con", cantidad, "unidades.")
        print("Stock actual:", self.stock)

    def __str__(self):
        return ("Producto(nombre=" + self.nombre +
                ", precio=" + str(self.precio) +
                ", stock=" + str(self.stock) + ")")


# ----------------- Programa de prueba -----------------
def main():
    # a) Crear producto con datos iniciales
    prod1 = Producto("Gaseosa", 10.0, 50)
    print(prod1)

    # b) Vender productos
    cantidad = int(input("¿Cuántas unidades deseas vender?: "))
    prod1.vender(cantidad)
    print(prod1)

    # c) Reabastecer productos
    cantidad = int(input("¿Cuántas unidades deseas reabastecer?: "))
    prod1.reabastecer(cantidad)
    print(prod1)


if __name__ == "__main__":
    main()
