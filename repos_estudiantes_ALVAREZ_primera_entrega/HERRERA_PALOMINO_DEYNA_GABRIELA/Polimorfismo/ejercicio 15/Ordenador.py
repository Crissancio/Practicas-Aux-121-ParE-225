class Ordenador:
    def __init__(self, codigo_serial, numero, ram, procesador, estado):
        self.codigo_serial = codigo_serial
        self.numero = numero
        self.ram = ram
        self.procesador = procesador
        self.estado = estado  

    def mostrar_info(self):
        print(f"Código: {self.codigo_serial}, Nro: {self.numero}, RAM: {self.ram}GB, "
              f"Procesador: {self.procesador}, Estado: {self.estado}")
class Laboratorio:
    def __init__(self, nombre, capacidad):
        self.nombre = nombre
        self.capacidad = capacidad
        self.ordenadores = []

    def agregar_ordenador(self, ordenador):
        if len(self.ordenadores) < self.capacidad:
            self.ordenadores.append(ordenador)
        else:
            print(f"No se puede agregar más ordenadores. Capacidad de {self.nombre} llena.")

    def informacion(self, criterio=None):
        if criterio is None:
            print(f" Información de todos los ordenadores del laboratorio {self.nombre} ")
            for o in self.ordenadores:
                o.mostrar_info()

        elif criterio.lower() in ["activo", "inactivo"]:
            print(f"  Ordenadores {criterio.upper()} en {self.nombre} ")
            for o in self.ordenadores:
                if o.estado.lower() == criterio.lower():
                    o.mostrar_info()

        elif criterio.lower() == "ram>8":
            print(f" Ordenadores con más de 8GB RAM en {self.nombre}   ")
            for o in self.ordenadores:
                if o.ram > 8:
                    o.mostrar_info()

        else:
            print("Criterio no reconocido.")

    def trasladar(self, destino, codigos_serial):
        for codigo in codigos_serial:
            for o in self.ordenadores:
                if o.codigo_serial == codigo:
                    if len(destino.ordenadores) < destino.capacidad:
                        destino.agregar_ordenador(o)
                        self.ordenadores.remove(o)
                        print(f"Ordenador {codigo} trasladado de {self.nombre} a {destino.nombre}")
                    else:
                        print(f"No hay espacio en {destino.nombre}")
                    break
if __name__ == "__main__":
    o1 = Ordenador("S001", 1, 4, "Intel i3", "activo")
    o2 = Ordenador("S002", 2, 16, "Intel i7", "activo")
    o3 = Ordenador("S003", 3, 8, "AMD Ryzen 5", "inactivo")
    o4 = Ordenador("S004", 4, 12, "Intel i9", "activo")
    o5 = Ordenador("S005", 5, 4, "Intel i5", "inactivo")
    o6 = Ordenador("S006", 6, 32, "AMD Ryzen 9", "activo")

    lasin1 = Laboratorio("Lasin 1", 5)
    lasin2 = Laboratorio("Lasin 2", 5)

    lasin1.agregar_ordenador(o1)
    lasin1.agregar_ordenador(o2)
    lasin1.agregar_ordenador(o3)
    lasin2.agregar_ordenador(o4)
    lasin2.agregar_ordenador(o5)
    lasin2.agregar_ordenador(o6)

    lasin1.informacion("activo")
    lasin2.informacion("ram>8")

    lasin1.trasladar(lasin2, ["S001", "S003"])

    lasin1.informacion()
    lasin2.informacion()
