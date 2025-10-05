class Cliente:
    def __init__(self, nombre, mesa):
        self.nombre = nombre
        self.mesa = mesa
    def __del__(self):
        pass
    def get_nombre(self):
        return self.nombre
    def set_nombre(self, nombre):
        self.nombre = nombre
    def get_mesa(self):
        return self.mesa
    def set_mesa(self, mesa):
        self.mesa = mesa

class Pedido:
    def __init__(self, id_pedido, productos, estado="registrado"):
        self.id_pedido = id_pedido
        self.productos = productos
        self.estado = estado
    def __del__(self):
        pass
    def get_id(self):
        return self.id_pedido
    def set_id(self, id_pedido):
        self.id_pedido = id_pedido
    def get_productos(self):
        return self.productos
    def set_productos(self, productos):
        self.productos = productos
    def get_estado(self):
        return self.estado
    def set_estado(self, estado):
        self.estado = estado

if __name__ == "__main__":
    c = Cliente("Sofia", 5)
    p = Pedido(1, ["Cafe","Tostada"], "preparado")
    print(c.get_nombre(), c.get_mesa())
    print(p.get_id(), p.get_productos(), p.get_estado())
