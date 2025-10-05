
class Ordenador:
    def __init__(self, codigo, numero, ram, procesador, estado):
        self.codigo = codigo
        self.numero = numero
        self.ram = ram
        self.procesador = procesador
        self.estado = estado

    def mostrar(self):
        print(self.codigo, self.numero, self.ram, self.procesador, self.estado)

class Laboratorio:
    def __init__(self, nombre, capacidad):
        self.nombre = nombre
        self.capacidad = capacidad
        self.ordenadores = []

    def agregar(self, o):
        if len(self.ordenadores) < self.capacidad:
            self.ordenadores.append(o)

    def informacion(self, tipo):
        if tipo == "estado":
            for o in self.ordenadores:
                if o.estado == "activo":
                    o.mostrar()
        elif tipo == "ram":
            for o in self.ordenadores:
                if o.ram > 8:
                    o.mostrar()
        elif tipo == "laboratorio":
            for o in self.ordenadores:
                print(self.nombre, o.codigo)

    def mover(self, destino):
        mover = self.ordenadores[:2]
        destino.ordenadores.extend(mover)
        self.ordenadores = self.ordenadores[2:]


l1 = Laboratorio("Lasin1",5)
l2 = Laboratorio("Lasin2",5)
o1 = Ordenador("A1",1,16,"Intel","activo")
o2 = Ordenador("A2",2,4,"AMD","inactivo")
o3 = Ordenador("A3",3,12,"Intel","activo")
l1.agregar(o1)
l1.agregar(o2)
l1.agregar(o3)
print("Antes:")
l1.informacion("laboratorio")
l1.mover(l2)
print("Despues:")
l2.informacion("laboratorio")
