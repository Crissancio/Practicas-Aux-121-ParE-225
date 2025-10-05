class Computadora:
    def __init__(self, codigo_serial, numero, ram, procesador, estado):
        self.codigo_serial = codigo_serial
        self.numero = numero
        self.ram = ram
        self.procesador = procesador
        self.estado = estado 

    def informacion(self):
        return (f"Código: {self.codigo_serial}, Número: {self.numero}, "
                f"RAM: {self.ram}GB, Procesador: {self.procesador}, Estado: {self.estado}")


class Laboratorio:
    def __init__(self, nombre, capacidad):
        self.nombre = nombre
        self.capacidad = capacidad
        self.computadoras = []

    def agregar_computadora(self, computadora):
        if len(self.computadoras) < self.capacidad:
            self.computadoras.append(computadora)
        else:
            print(f"No se puede agregar más computadoras al laboratorio {self.nombre} (capacidad llena).")

    def informacion(self, filtro=None):
        resultado = []
        if filtro is None:
            resultado = [c.informacion() for c in self.computadoras]
        elif isinstance(filtro, str):
            if filtro.lower() in ["activo", "inactivo"]:
                resultado = [c.informacion() for c in self.computadoras if c.estado.lower() == filtro.lower()]
            else:
                if filtro == self.nombre:
                    resultado = [c.informacion() for c in self.computadoras]
                else:
                    resultado = []
        elif isinstance(filtro, int):
            resultado = [c.informacion() for c in self.computadoras if c.ram > filtro]
        return resultado

    def mover_computadoras(self, destino, codigos):
        print(f"Estado antes de mover computadoras de {self.nombre} a {destino.nombre}:")
        for codigo in codigos:
            comp = next((c for c in self.computadoras if c.codigo_serial == codigo), None)
            if comp:
                print(f"  {comp.informacion()}")

        for codigo in codigos:
            comp = next((c for c in self.computadoras if c.codigo_serial == codigo), None)
            if comp:
                if len(destino.computadoras) < destino.capacidad:
                    destino.computadoras.append(comp)
                    self.computadoras.remove(comp)
                else:
                    print(f"No hay capacidad en {destino.nombre} para mover la computadora {codigo}.")

        print(f"Estado después de mover computadoras de {self.nombre} a {destino.nombre}:")
        for codigo in codigos:
            comp = next((c for c in destino.computadoras if c.codigo_serial == codigo), None)
            if comp:
                print(f"  {comp.informacion()}")

lasin1 = Laboratorio("Lasin 1", capacidad=5)
lasin2 = Laboratorio("Lasin 2", capacidad=5)

c1 = Computadora("ABC123", 1, 16, "Intel i7", "activo")
c2 = Computadora("DEF456", 2, 8, "Intel i5", "inactivo")
c3 = Computadora("GHI789", 3, 32, "AMD Ryzen 7", "activo")
c4 = Computadora("JKL012", 4, 4, "Intel i3", "activo")
c5 = Computadora("MNO345", 5, 16, "AMD Ryzen 5", "inactivo")
c6 = Computadora("PQR678", 6, 12, "Intel i5", "activo")

lasin1.agregar_computadora(c1)
lasin1.agregar_computadora(c2)
lasin1.agregar_computadora(c3)
lasin2.agregar_computadora(c4)
lasin2.agregar_computadora(c5)
lasin2.agregar_computadora(c6)

print("\nComputadoras activas en Lasin 1:")
for info in lasin1.informacion("activo"):
    print(info)

print("\nComputadoras en Lasin 2:")
for info in lasin2.informacion("Lasin 2"):
    print(info)

print("\nComputadoras en Lasin 1 con más de 8GB de RAM:")
for info in lasin1.informacion(8):
    print(info)

codigos_a_mover = ["ABC123", "GHI789"]
lasin1.mover_computadoras(lasin2, codigos_a_mover)
