class VideoJuego:
    def __init__(self, nombre, plataforma, cantidad_jugadores=1):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidad_jugadores = cantidad_jugadores

    def agregaJugadores(self):
        self.cantidad_jugadores += 1
        print("Se agregó 1 jugador.")

    def agregarJugadoresDesdeTeclado(self):
        try:
            cantidad = int(input("Ingrese la cantidad de jugadores a agregar: "))
            if cantidad > 0:
                self.cantidad_jugadores += cantidad
                print(f"Se agregaron {cantidad} jugadores.")
            else:
                print("La cantidad debe ser mayor que cero.")
        except ValueError:
            print("Entrada inválida. Debe ingresar un número entero.")

    def mostrarInfo(self):
        print(f"Nombre: {self.nombre}")
        print(f"Plataforma: {self.plataforma}")
        print(f"Cantidad de jugadores: {self.cantidad_jugadores}")
