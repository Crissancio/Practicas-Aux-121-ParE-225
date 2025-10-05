class Videojuego:
    def __init__(self, nombre="", plataforma="", jugadores=1):
        self.nombre = nombre
        self.plataforma = plataforma
        self.jugadores = jugadores

    # Sobrecarga simulada de constructor (Python no permite múltiples constructores)
    @classmethod
    def crear_con_datos(cls, nombre, plataforma):
        return cls(nombre, plataforma, 1)

    def agregar_jugadores(self, cantidad=None):
        if cantidad is None:
            self.jugadores += 1
        else:
            self.jugadores += cantidad

    def mostrar(self):
        print(f"{self.nombre} ({self.plataforma}) - Jugadores: {self.jugadores}")

# Ejemplo
v1 = Videojuego("Minecraft", "PC", 5)
v2 = Videojuego.crear_con_datos("GTA V", "PlayStation")
v1.agregar_jugadores()
v2.agregar_jugadores(3)
v1.mostrar()
v2.mostrar()
