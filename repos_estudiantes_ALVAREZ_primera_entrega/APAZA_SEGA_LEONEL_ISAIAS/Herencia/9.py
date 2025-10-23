class Politico:
    def __init__(self, profesion, añosExp):
        self.profesion = profesion
        self.añosExp = añosExp

class Partido:
    def __init__(self, nombreP, rol):
        self.nombreP = nombreP
        self.rol = rol

class Presidente(Politico, Partido):
    # FALTA SOBRECARGA DE OPERADORES
    def __init__(self, nombre, apellido, profesion, añosExp, nombreP, rol):
        Politico.__init__(self, profesion, añosExp)
        Partido.__init__(self, nombreP, rol)
        self.nombre = nombre
        self.apellido = apellido

    def mostrar(self):
        print(f"Presidente: {self.nombre} {self.apellido} | {self.profesion} | Partido: {self.nombreP}")

# Ejemplo
p1 = Presidente("Juan", "Perez", "Abogado", 10, "PAIS", "Líder")
p2 = Presidente("Maria", "Lopez", "Economista", 12, "UN", "Candidata")
p1.mostrar()
p2.mostrar()
# SIN INSCISO c
