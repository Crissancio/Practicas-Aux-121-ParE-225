

class Videojuego:
    def __init__(self, nombre="Desconocido", plataforma="Sin definir", jugadores=0):
        self.nombre = nombre
        self.plataforma = plataforma
        self.jugadores = jugadores

    @classmethod
    def crear_sin_jugadores(cls, nombre, plataforma):
        return cls(nombre, plataforma, 0)

    @classmethod
    def crear_solo_nombre(cls, nombre):
        return cls(nombre, "Sin definir", 0)

    def mostrar(self):
        print(f"Nombre: {self.nombre}")
        print(f"Plataforma: {self.plataforma}")
        print(f"Jugadores: {self.jugadores}")

    def agregarJugadores(self, cantidad=None):
        if cantidad is None:
            self.jugadores += 1
        else:
            self.jugadores += cantidad


v1 = Videojuego("Minecraft", "PC", 5)
v2 = Videojuego.crear_sin_jugadores("FIFA 25", "PlayStation")
v3 = Videojuego.crear_solo_nombre("Mario Kart")

v1.mostrar()
v2.mostrar()
v3.mostrar()

print("\n--- Agregando jugadores ---")
v1.agregarJugadores()
v2.agregarJugadores(3)

v1.mostrar()
v2.mostrar()