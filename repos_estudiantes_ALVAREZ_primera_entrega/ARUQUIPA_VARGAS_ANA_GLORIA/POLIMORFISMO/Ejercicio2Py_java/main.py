from Videojuegos import VideoJuego
if __name__ == "__main__":
    juego1 = VideoJuego("Mobile Legends", "Android", 10)
    juego2 = VideoJuego("Wild Rift","ps5") 

    print("\nJuego 1")
    juego1.mostrarInfo()

    print("\nJuego 2")
    juego2.mostrarInfo()

    print("\nAgregando un jugador a Juego 1:")
    juego1.agregaJugadores()

    print("\nAgregando jugadores a Juego 2:")
    juego2.agregarJugadoresDesdeTeclado()

    print("\nDatos actualizados")
    juego1.mostrarInfo()
    print()
    juego2.mostrarInfo()
