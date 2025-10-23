class Politico:
    def __init__(self, profesion, anosExp):
        self.profesion = profesion
        self.anosExp = anosExp

class Partido:
    def __init__(self, nombreP, rol):
        self.nombreP = nombreP
        self.rol = rol

class Presidente(Politico, Partido):
    # SIN SOBRECARGA DE CONSTRUCTOR
    def __init__(self, nombre, apellido, profesion, anosExp, nombreP, rol):
        Politico.__init__(self, profesion, anosExp)
        Partido.__init__(self, nombreP, rol)
        self.nombre = nombre
        self.apellido = apellido

    def mostrar(self):
        print(f"Presidente: {self.nombre} {self.apellido}")
        print(f"Profesión: {self.profesion}, Años de experiencia: {self.anosExp}")
        print(f"Partido: {self.nombreP}, Rol en partido: {self.rol}")
def buscar_presidente_por_nombre(lista_presidentes, nombre_buscado):
    for p in lista_presidentes:
        if p.nombre.lower() == nombre_buscado.lower():
            print(f"\nPresidente encontrado: {p.nombre} {p.apellido}")
            print(f"Profesión: {p.profesion}")
            print(f"Partido Político: {p.nombreP}")
            return
    print("Presidente no encontrado.")


