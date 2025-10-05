class Ordenador:
    def __init__(self, serial, nro, ram_gb, procesador, activo):
        self.serial = serial
        self.nro = nro
        self.ram_gb = ram_gb
        self.procesador = procesador
        self.activo = activo

    def __str__(self):
        estado = "ACTIVO" if self.activo else "INACTIVO"
        return f"[{self.serial}] nro:{self.nro} RAM:{self.ram_gb} CPU:{self.procesador} {estado}"

class Laboratorio:
    def __init__(self, nombre, capacidad):
        self.nombre = nombre
        self.capacidad = capacidad
        self.ordenadores = []

    def agregar(self, o):
        if len(self.ordenadores) < self.capacidad:
            self.ordenadores.append(o)

    def informacion(self, filtro=None):
        print(f"Laboratorio {self.nombre}:")
        if filtro is None:
            for o in self.ordenadores:
                print(" -", o)
        elif isinstance(filtro, str):  
            for o in self.ordenadores:
                if (filtro.lower() == "activo" and o.activo) or (filtro.lower() == "inactivo" and not o.activo):
                    print(" -", o)
        elif isinstance(filtro, int):  
            for o in self.ordenadores:
                if o.ram_gb > filtro:
                    print(" -", o)

    def trasladar(self, destino, serial):
        for o in self.ordenadores:
            if o.serial == serial and len(destino.ordenadores) < destino.capacidad:
                destino.agregar(o)
                self.ordenadores.remove(o)
                return True
        return False

l1 = Laboratorio("Lasin 1", 4)
l2 = Laboratorio("Lasin 2", 4)

ordenadores = [
    Ordenador("S100", 1, 8, "i5", True),
    Ordenador("S101", 2, 16, "i7", True),
    Ordenador("S102", 3, 4, "i3", False),
    Ordenador("S200", 1, 8, "i5", True),
    Ordenador("S201", 2, 12, "i5", True),
    Ordenador("S202", 3, 32, "i9", True)
]

for o in ordenadores[:3]:
    l1.agregar(o)
for o in ordenadores[3:]:
    l2.agregar(o)

print("Estado antes del traslado:")
l1.informacion()
l2.informacion()

print("\nTrasladando S100 y S101...")
l1.trasladar(l2, "S100")
l1.trasladar(l2, "S101")

print("\nEstado después del traslado:")
l1.informacion()
l2.informacion()

print("\nOrdenadores con RAM > 8 en Lasin 2:")
l2.informacion(8)

print("\nOrdenadores activos en Lasin 2:")
l2.informacion("activo")
