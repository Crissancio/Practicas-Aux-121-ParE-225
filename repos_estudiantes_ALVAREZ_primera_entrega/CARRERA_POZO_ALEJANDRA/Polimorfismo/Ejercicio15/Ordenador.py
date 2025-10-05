class Ordenador:
    def __init__(self, codigo_serial, numero, memoria_ram, procesador, estado):
        self.codigo_serial = codigo_serial
        self.numero = numero
        self.memoria_ram = memoria_ram
        self.procesador = procesador
        self.estado = estado

    def mostrar_info(self):
        print(f"{self.codigo_serial} | {self.procesador} | RAM: {self.memoria_ram}GB | Estado: {self.estado}")

class Laboratorio:
    def __init__(self, nombre, capacidad):
        self.nombre = nombre
        self.capacidad = capacidad
        self.ordenadores = []
    def agregar_ordenador(self, ordenador):
        if len(self.ordenadores) < self.capacidad:
            self.ordenadores.append(ordenador)
        else:
            print("Capacidad máxima alcanzada")
    def informacion(self, tipo=None, valor=None):
        if tipo == "estado":
            print(f"Ordenadores {valor} en {self.nombre}:")
            for o in self.ordenadores:
                if o.estado == valor:
                    o.mostrar_info()
        elif tipo == "ram":
            print(f"Ordenadores con más de {valor}GB de RAM en {self.nombre}:")
            for o in self.ordenadores:
                if o.memoria_ram > valor:
                    o.mostrar_info()
        else:
            print(f"Todos los ordenadores en {self.nombre}:")
            for o in self.ordenadores:
                o.mostrar_info()
    def trasladar_ordenadores(self, destino, codigos):
        print(f"\nTrasladando desde {self.nombre} a {destino.nombre}...")
        print("Antes del traslado:")
        self.informacion()
        destino.informacion()
        trasladados = [o for o in self.ordenadores if o.codigo_serial in codigos]
        for o in trasladados:
            self.ordenadores.remove(o)
            destino.agregar_ordenador(o)
        print("\nDespués del traslado:")
        self.informacion()
        destino.informacion()

pc1 = Ordenador("A1", 1, 8, "i5", "activo")
pc2 = Ordenador("A2", 2, 16, "i7", "activo")
pc3 = Ordenador("A3", 3, 4, "i3", "inactivo")
pc4 = Ordenador("B1", 4, 12, "Ryzen 5", "activo")
pc5 = Ordenador("B2", 5, 8, "i5", "activo")
pc6 = Ordenador("B3", 6, 16, "Ryzen 7", "inactivo")
lasin1 = Laboratorio("Lasin 1", 5)
lasin2 = Laboratorio("Lasin 2", 5)
for pc in [pc1, pc2, pc3]:
    lasin1.agregar_ordenador(pc)
for pc in [pc4, pc5, pc6]:
    lasin2.agregar_ordenador(pc)

lasin1.informacion("estado", "activo")
lasin1.informacion("ram", 8)
lasin1.trasladar_ordenadores(lasin2, ["A1", "A2"])

