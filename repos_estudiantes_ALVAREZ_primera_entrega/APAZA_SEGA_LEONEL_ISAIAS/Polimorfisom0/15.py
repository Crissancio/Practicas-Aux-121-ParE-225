class Ordenador:
    def __init__(self, codigo, ram, procesador, estado):
        self.codigo = codigo
        self.ram = ram
        self.procesador = procesador
        self.estado = estado

class Laboratorio:
    def __init__(self, nombre):
        self.nombre = nombre
        self.ordenadores = []

    def agregar_ordenador(self, pc):
        self.ordenadores.append(pc)

    def informacion(self, modo):
        if modo == "activos":
            for pc in self.ordenadores:
                if pc.estado == "activo":
                    print(pc.codigo, pc.ram, pc.procesador)
        elif modo == "ram":
            for pc in self.ordenadores:
                if pc.ram > 8:
                    print(pc.codigo, pc.ram)

# Ejemplo
lab = Laboratorio("Lasin 1")
lab.agregar_ordenador(Ordenador("PC01", 16, "i7", "activo"))
lab.agregar_ordenador(Ordenador("PC02", 4, "i5", "inactivo"))
lab.informacion("activos")
lab.informacion("ram")

