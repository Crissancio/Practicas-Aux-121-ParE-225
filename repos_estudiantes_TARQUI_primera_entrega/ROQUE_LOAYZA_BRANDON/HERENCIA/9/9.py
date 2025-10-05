
class Politico:
    def __init__(self, profesion, aniosExp):
        self.profesion = profesion
        self.aniosExp = aniosExp

class Partido:
    def __init__(self, nombreP, rol):
        self.nombreP = nombreP
        self.rol = rol

class Presidente(Politico, Partido):
    def __init__(self, nombre, apellido, profesion, aniosExp, nombreP, rol):
        Politico.__init__(self, profesion, aniosExp)
        Partido.__init__(self, nombreP, rol)
        self.nombre = nombre
        self.apellido = apellido

    def mostrar(self):
        print(self.nombre, self.apellido, self.profesion, self.nombreP)


p1 = Presidente("Luis","Perez","Abogado",10,"MAS","Lider")
p2 = Presidente("Ana","Mendez","Economista",8,"UCS","Secretaria")
p3 = Presidente("Raul","Lopez","Ingeniero",12,"UN","Presidente")
v = [p1,p2,p3]
for p in v:
    if p.nombre == "Ana":
        p.mostrar()
