class Cliente:
    def __init__(self, nombre, pedido):
        self._nombre = nombre
        self._pedido = pedido
    
    def __del__(self):
        print(f"Cliente {self._nombre} eliminado.")

    def get_nombre(self):
        return self._nombre
    
    def get_pedido(self):
        return self._pedido
    
    def set_nombre(self, nombre):
        self._nombre = nombre
    
    def set_pedido(self, pedido):
        self._pedido = pedido

class Pedido:
    def __init__(self, productos, estado):
        self._productos = productos
        self._estado = estado
    
    def __del__(self):
        print(f"Pedido con productos {self._productos} eliminado.")

    def get_productos(self):
        return self._productos
    
    def get_estado(self):
        return self._estado
    
    def set_productos(self, productos):
        self._productos = productos
    
    def set_estado(self, estado):
        self._estado = estado

pedido1 = Pedido(["Café", "Pastel"], "Registrado")
print(f"Pedido: {pedido1.get_productos()}, Estado: {pedido1.get_estado()}")

cliente1 = Cliente("Gabriela", pedido1.get_productos())
print(f"Cliente: {cliente1.get_nombre()}, Pedido: {cliente1.get_pedido()}")
