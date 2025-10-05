class Videojuego:
    def __init__(self, nombre=None, plataforma=None, cantidad_jugadores=0):
        if nombre is None and plataforma is None:
               self.nombre="Desconocido"
               self.plataforma="Desconocido"
               self.cantidad_jugadores=0
        elif plataforma is None:
               self.nombre=nombre
               self.plataforma="Desconocida"
               self.cantidad_jugadores=0
        else:
               self.nombre=nombre
               self.plataforma=plataforma
               self.cantidad_jugadores=cantidad_jugadores
    def agregarJugadores(self, cantidad=None):
        if cantidad is None:
                self.cantidad_jugadores+=1
        else:
            self.cantidad_jugadores+=cantidad
    def __str__(self):
        return f"Videojuego: {self.nombre}, Plataforma: {self.plataforma}, Jugadores: {self.cantidad_jugadores}"
    
juego1= Videojuego()
juego2= Videojuego("FIFA 23")
juego3=Videojuego("Mario Kart", "Nintendo Switch", 24)

juego1.agregarJugadores()
juego2.agregarJugadores(17)

print(juego1)
print(juego2)
print(juego3)