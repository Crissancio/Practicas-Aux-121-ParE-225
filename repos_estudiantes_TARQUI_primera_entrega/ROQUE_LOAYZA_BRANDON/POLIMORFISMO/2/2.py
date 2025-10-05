class Videojuego:
    def __init__(self, nombre="", plataforma="", cantidadJugadores=0):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidadJugadores = cantidadJugadores

    @classmethod
    def crear_con_nombre(cls, nombre):
        return cls(nombre)

    @classmethod
    def crear_completo(cls, nombre, plataforma, cantidad):
        return cls(nombre, plataforma, cantidad)

    def agregarJugadores(self, cantidad=None):
        if cantidad is None:
            self.cantidadJugadores += 1
        else:
            self.cantidadJugadores += cantidad

    def mostrar(self):
        print(self.nombre, self.plataforma, self.cantidadJugadores)


v1 = Videojuego.crear_con_nombre("Zelda")
v1.plataforma = "Switch"
v1.agregarJugadores()
v1.mostrar()

v2 = Videojuego.crear_completo("FIFA", "PlayStation", 2)
v2.agregarJugadores(3)
v2.mostrar()
