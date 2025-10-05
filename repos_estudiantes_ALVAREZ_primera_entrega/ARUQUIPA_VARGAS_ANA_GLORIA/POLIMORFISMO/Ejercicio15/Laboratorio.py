
from Ordenador import Ordenador

class Laboratorio:
    def __init__(self, nombre, capacidad):
        self.nombre = nombre
        self.capacidad = capacidad
        self.ordenadores = []

    def agregar_ordenador(self, ordenador):
        if len(self.ordenadores) < self.capacidad:
            self.ordenadores.append(ordenador)
        else:
            print(f" Capacidad máxima alcanzada en {self.nombre}")

    def informacion(self, criterio=None):
        print(f"\n Información del laboratorio {self.nombre}")
        if criterio == "activo" or criterio == "inactivo":
            print(f" Ordenadores en estado '{criterio}':")
            for o in self.ordenadores:
                if o.estado == criterio:
                    o.mostrar()
        elif criterio == "ram>8":
            print(" Ordenadores con RAM > 8 GB:")
            for o in self.ordenadores:
                if o.ram > 8:
                    o.mostrar()
        else:
            print("Todos los ordenadores:")
            for o in self.ordenadores:
                o.mostrar()
