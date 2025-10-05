# Clase Producto
class Producto:
    # constructor
    def __init__(self, nombre, precio):
        self._nombre = nombre
        self._precio = precio
        print(f"Producto '{self._nombre}' creado.")

    # Destructor simulado
    def __del__(self):
        print(f"Producto '{self._nombre}' eliminado.")

    # Getter y Setter para nombre
    
    def nombre(self):
        return self._nombre

    def nombre(self, valor):
        if valor:
            self._nombre = valor

    # Getter y Setter para precio
    
    def precio(self):
        return self._precio

    def precio(self, valor):
        if valor >= 0:
            self._precio = valor

    # Método para mostrar datos
    def mostrar_producto(self):
        print(f"Producto: {self._nombre} | Precio: Bs. {self._precio}")


# Clase Pedido
class Pedido:
    def __init__(self, numero_pedido, estado):
        self._numero_pedido = numero_pedido
        self._estado = estado
        print(f"Pedido #{self._numero_pedido} creado.")

    # Destructor
    def __del__(self):
        print(f"Pedido #{self._numero_pedido} eliminado.")

    # Getter y Setter para numero_pedido
    
    def numero_pedido(self):
        return self._numero_pedido

    def numero_pedido(self, valor):
        self._numero_pedido = valor

    # Getter y Setter para estado
    def estado(self):
        return self._estado

    def estado(self, valor):
        if valor:
            self._estado = valor

    # Método para mostrar datos
    def mostrar_pedido(self):
        print(f"Pedido #{self._numero_pedido} | Estado: {self._estado}")


# ==========================
# Crear objetos y probar
# ==========================
if __name__ == "__main__":
    # Crear un objeto de cada clase (inciso c)
    prod1 = Producto("Café Latte", 12.5)
    ped1 = Pedido(101, "Registrado")

    # Mostrar información
    prod1.mostrar_producto()
    ped1.mostrar_pedido()

    # Modificar valores usando setters
    prod1.precio = 13.0
    ped1.estado = "Preparado"

    print("\nDespués de actualizar:")
    prod1.mostrar_producto()
    ped1.mostrar_pedido()
