class Cliente:
    def __init__(self, nombre):
        self.nombre = nombre

class Pedido:
    def __init__(self, cliente, productos):
        self.cliente = cliente
        self.productos = productos
        self.estado = "registrado"

    def cambiar_estado(self, nuevo_estado):
        self.estado = nuevo_estado

    def mostrar(self):
        print(f"Pedido de {self.cliente.nombre}: {', '.join(self.productos)} - Estado: {self.estado}")

# Ejemplo
c1 = Cliente("Carlos")
p1 = Pedido(c1, ["Café", "Pastel"])
p1.mostrar()
p1.cambiar_estado("entregado")
p1.mostrar()
