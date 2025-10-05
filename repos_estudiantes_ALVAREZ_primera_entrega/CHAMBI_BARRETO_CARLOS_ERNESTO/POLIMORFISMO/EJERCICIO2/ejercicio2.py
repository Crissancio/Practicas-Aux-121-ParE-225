#EJERCICIO 2 POLIMORFISMO
class Videojuego:
    def __init__(self, nombre=None, plataforma=None, jugadores=0):
        self.nombre = nombre
        self.plataforma = plataforma
        self.jugadores = jugadores
        
    @classmethod
    def solo_nombre(cls, nombre):
        return cls(nombre=nombre)

    @classmethod
    def nombre_plataforma(cls, nombre, plataforma):
        return cls(nombre=nombre, plataforma=plataforma)

    def agregarJugadores(self, cantidad=None):
        if cantidad is None:
            self.jugadores += 1
        else:
            self.jugadores += cantidad

    def __str__(self):
        return f"{self.nombre} ({self.plataforma}) - Jugadores: {self.jugadores}"
v1 = Videojuego("FIFA 25", "PS5", 2)
v2 = Videojuego.nombre_plataforma("Minecraft", "PC")
v3 = Videojuego.solo_nombre("Tetris")
v1.agregarJugadores()       
v2.agregarJugadores(3)   

print(v1)
print(v2)
print(v3)
