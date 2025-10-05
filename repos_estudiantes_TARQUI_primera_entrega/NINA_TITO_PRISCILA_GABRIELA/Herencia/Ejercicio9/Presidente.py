class Politico:
    def __init__(self, profesion, añosExp):
        self.profesion = profesion
        self.añosExp = añosExp


class Partido:
    def __init__(self, nombreP, rol):
        self.nombreP = nombreP
        self.rol = rol


class Presidente(Politico, Partido):
    def __init__(self, nombre, apellido, profesion, añosExp, nombreP, rol):
        Politico.__init__(self, profesion, añosExp)
        Partido.__init__(self, nombreP, rol)
        self.nombre = nombre
        self.apellido = apellido

    def mostrar(self):
        print(f"Presidente: {self.nombre} {self.apellido}")
        print(f"Profesión: {self.profesion}")
        print(f"Años de experiencia: {self.añosExp}")
        print(f"Partido: {self.nombreP}")
        print(f"Rol: {self.rol}")
        print("---------------")

# Forma 1 de instanciar
p1 = Presidente("Luis", "Arce", "Economista", 25, "MAS", "Líder")

# Forma 2 de instanciar
prof = "Abogado"
exp = 30
partido = "CC"
rol = "Opositor"
p2 = Presidente("Carlos", "Mesa", prof, exp, partido, rol)

p3 = Presidente("Jeanine", "Áñez", "Política", 20, "UD", "Ex-Presidenta")
presidentes = [p1, p2, p3]

nombre_buscar = input("Ingrese el nombre del presidente a buscar: ")

encontrado = False
for p in presidentes:
    if p.nombre.lower() == nombre_buscar.lower():
        print(f"\n{p.nombre} pertenece al partido: {p.nombreP}")
        print(f"Su profesión es: {p.profesion}")
        encontrado = True
        break

if not encontrado:
    print("Presidente no encontrado.")
