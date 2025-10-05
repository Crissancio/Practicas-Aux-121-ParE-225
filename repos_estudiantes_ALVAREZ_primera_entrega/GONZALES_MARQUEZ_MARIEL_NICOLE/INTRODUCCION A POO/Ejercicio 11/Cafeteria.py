class Producto:
    def __init__(self, nombre, precio):
        self.__nombre = nombre
        self.__precio = precio
        print(f"Producto '{self.__nombre}' creado.")

    def __del__(self):
        print(f"Producto '{self.__nombre}' eliminado de memoria.")

    def get_nombre(self):
        return self.__nombre

    def get_precio(self):
        return self.__precio

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def set_precio(self, precio):
        self.__precio = precio

    def mostrar(self):
        print(f"Producto: {self.__nombre} - Precio: Bs {self.__precio}")


class Pedido:
    def __init__(self, numero, estado):
        self.__numero = numero
        self.__estado = estado
        print(f"Pedido N°{self.__numero} creado.")

    def __del__(self):
        print(f"Pedido N°{self.__numero} eliminado de memoria.")


    def get_numero(self):
        return self.__numero

    def get_estado(self):
        return self.__estado

    def set_numero(self, numero):
        self.__numero = numero

    def set_estado(self, estado):
        self.__estado = estado

    def mostrar(self):
        print(f"Pedido N°{self.__numero} - Estado: {self.__estado}")


producto1 = Producto("Café Latte", 15.5)
pedido1 = Pedido(101, "Registrado")

producto1.mostrar()
pedido1.mostrar()
