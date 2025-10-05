class Pedido:
    def __init__(self, idPedido, estado):
        self.idPedido = idPedido
        self.estado = estado

    # Getters
    def getIdPedido(self):
        return self.idPedido

    def getEstado(self):
        return self.estado

    # Setters
    def setIdPedido(self, idPedido):
        self.idPedido = idPedido

    def setEstado(self, estado):
        self.estado = estado

    def __del__(self):
        print("Pedido con ID", self.idPedido, "ha sido eliminado.")

    def __str__(self):
        return f"Pedido(ID={self.idPedido}, Estado={self.estado})"


class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    # Getters
    def getNombre(self):
        return self.nombre

    def getPrecio(self):
        return self.precio

    # Setters
    def setNombre(self, nombre):
        self.nombre = nombre

    def setPrecio(self, precio):
        self.precio = precio

    def __del__(self):
        print("Producto", self.nombre, "ha sido eliminado.")

    def __str__(self):
        return f"Producto(Nombre={self.nombre}, Precio={self.precio})"


# ----------------- Programa de prueba -----------------
def main():
    pedido1 = Pedido(1, "Registrado")
    producto1 = Producto("Café", 12.5)

    print(pedido1)
    print(producto1)


if __name__ == "__main__":
    main()
