class Videojuego:
    def __init__(self, nombre, plataforma, cantidadJugadores=0):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidadJugadores = cantidadJugadores

    def agregarJugadores(self):
        self.cantidadJugadores += 1

    def agregarJugadoresCantidad(self, cantidad):
        self.cantidadJugadores += cantidad

    def mostrar(self):
        print("Nombre:", self.nombre)
        print("Plataforma:", self.plataforma)
        print("Cantidad de jugadores:", self.cantidadJugadores)
        print("------------------------------")

if __name__ == "__main__":
    v1 = Videojuego("The Last of Us", "PS4", 3)
    v2 = Videojuego("FIFA 21", "PC")

    v1.agregarJugadores()          # suma 1 jugador
    v2.agregarJugadoresCantidad(5) # suma 5 jugadores

    v1.mostrar()
    v2.mostrar()
