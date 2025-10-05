class Videojuego:
    # Constructor con sobrecarga simulada
    def __init__(self, nombre=None, plataforma=None, cantidad_jugadores=0):
        if nombre is None and plataforma is None:
            # Constructor vacío
            self.nombre = "Desconocido"
            self.plataforma = "Desconocida"
            self.cantidad_jugadores = 0
        elif plataforma is None:
            # Constructor con 1 parámetro (nombre)
            self.nombre = nombre
            self.plataforma = "Desconocida"
            self.cantidad_jugadores = 0
        else:
            # Constructor completo
            self.nombre = nombre
            self.plataforma = plataforma
            self.cantidad_jugadores = cantidad_jugadores

    # Método para mostrar información
    def mostrar_info(self):
        print(f"Videojuego: {self.nombre} | Plataforma: {self.plataforma} | Jugadores: {self.cantidad_jugadores}")

    # Sobrecarga del método agregarJugadores()
    def agregarJugadores(self, jugadores=None):
        if jugadores is None:
            # Si no se pasa argumento → agregar 1 jugador
            self.cantidad_jugadores += 1
            print(f"Se agregó 1 jugador. Total actual: {self.cantidad_jugadores}")
        else:
            # Si se pasa un número → agregar esa cantidad
            self.cantidad_jugadores += jugadores
            print(f"Se agregaron {jugadores} jugadores. Total actual: {self.cantidad_jugadores}")


# ----------------- Programa de prueba -----------------
def main():
    # a) Instanciar al menos 2 videojuegos con distintos constructores
    juego1 = Videojuego()  # Constructor vacío
    juego2 = Videojuego("Mario Kart")  # Constructor con 1 parámetro
    juego3 = Videojuego("FIFA 25", "PlayStation", 2)  # Constructor completo

    # Mostrar información inicial
    print("\n--- Lista de videojuegos ---")
    juego1.mostrar_info()
    juego2.mostrar_info()
    juego3.mostrar_info()

    # c) Sobrecarga del método agregarJugadores()
    print("\n--- Agregando jugadores ---")
    juego1.agregarJugadores()         # Agrega 1 jugador
    juego2.agregarJugadores(3)        # Agrega 3 jugadores
    juego3.agregarJugadores()         # Agrega 1 jugador

    # Mostrar resultados finales
    print("\n--- Estado final ---")
    juego1.mostrar_info()
    juego2.mostrar_info()
    juego3.mostrar_info()


if __name__ == "__main__":
    main()
