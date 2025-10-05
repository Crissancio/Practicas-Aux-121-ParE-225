class Politico:
    def __init__(self, profesion, añosExp):
        self.profesion = profesion
        self.añosExp = añosExp
    def mostrar(self):
        print(f"Profesión: {self.profesion}, Años de experiencia: {self.añosExp}")
        
class Partido:
    def __init__(self, nombreP, rol):
        self.nombreP = nombreP
        self.rol = rol
    def mostrar(self):
        print(f"Partido: {self.nombreP}, Rol: {self.rol}")

class Presidente(Politico, Partido):
    def __init__(self, nombre, apellido, profesion, añosExp, nombreP, rol):
        Politico.__init__(self, profesion, añosExp)
        Partido.__init__(self, nombreP, rol)
        self.nombre = nombre
        self.apellido = apellido
    def mostrar(self):
        print(f"Presidente: {self.nombre} {self.apellido}")
        Politico.mostrar(self)
        Partido.mostrar(self)

p1 = Presidente("Carlos", "Pérez", "Abogado", 15, "Partido Azul", "Líder")
prof = "Economista"
exp = 20
partido = "Partido Verde"
rol = "Fundador"
p2 = Presidente("Laura", "Suárez", prof, exp, partido, rol)
p1.mostrar()
print()
p2.mostrar()
presidentes = [
    Presidente("Carlos", "Pérez", "Abogado", 15, "Partido Azul", "Líder"),
    Presidente("Laura", "Suárez", "Economista", 20, "Partido Verde", "Fundador"),
    Presidente("Luis", "Mendoza", "Ingeniero", 12, "Partido Rojo", "Miembro")
]
nombre_buscar = "Laura"
for p in presidentes:
    if p.nombre == nombre_buscar:
        print(f"\nEl presidente {p.nombre} pertenece al partido '{p.nombreP}' y su profesión es '{p.profesion}'.")
        break
else:
    print("\nNo se encontró un presidente con ese nombre.")

