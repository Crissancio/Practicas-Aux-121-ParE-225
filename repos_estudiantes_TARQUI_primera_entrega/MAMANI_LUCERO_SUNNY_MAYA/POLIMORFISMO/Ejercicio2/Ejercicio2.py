class Videojuego:
    def __init__(self,nombre=None,plataforma=None,nroJugadores=0):
        self.nombre=nombre
        self.plataforma=plataforma
        self.nroJugadores=nroJugadores
    def agregarJugadores(self,x=1):
        self.nroJugadores+=x
vd1=Videojuego("Minecraft","PC",4)
vd2=Videojuego("FIFA","PlayStation")
print(vd2.nombre,":",vd2.nroJugadores)
print(vd1.nombre,":",vd1.nroJugadores)
vd1.agregarJugadores()
print(vd1.nombre,":",vd1.nroJugadores)
x=int(input("Ingresar numero de jugadores a agregar: "))
vd2.agregarJugadores(x)
print(vd2.nombre,":",vd2.nroJugadores)
        
