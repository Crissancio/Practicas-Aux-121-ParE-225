class Politico:
    def __init__(self, profesion, añosExp):
        self.profesion = profesion
        self.añosExp = añosExp


class Partido:
    def __init__(self, nombreP, rol):
        self.nombreP = nombreP
        self.rol = rol


class Presidente(Politico, Partido):
    def __init__(self, nombre, apellido, profesion=None, añosExp=None, nombreP=None, rol=None):
        Politico.__init__(self, profesion, añosExp)
        Partido.__init__(self, nombreP, rol)
        self.nombre = nombre
        self.apellido = apellido

    def mostrar(self):
        print(f"Presidente: {self.nombre} {self.apellido}")
        print(f"Profesión: {self.profesion}")
        print(f"Años de experiencia: {self.añosExp}")
        print(f"Partido: {self.nombreP} ({self.rol})")
        print("-" * 40)


# b) Instanciación de dos formas diferentes
# Forma 1: pasando todos los parámetros al crear el objeto
p1 = Presidente("Luis", "Arce", "Economista", 25, "MAS", "Líder")

# Forma 2: creando objeto vacío y asignando después
p2 = Presidente("Carlos", "Mesa")
p2.profesion = "Historiador"
p2.añosExp = 20
p2.nombreP = "CC"
p2.rol = "Candidato"

# c) Crear un vector (lista) de presidentes
presidentes = [
    p1,
    p2,
    Presidente("Evo", "Morales", "Sindicalista", 30, "MAS", "Fundador")
]

# Buscar presidente por nombre
nombre_buscar = "Carlos"
encontrado = False
for p in presidentes:
    if p.nombre == nombre_buscar:
        print(f"Presidente encontrado: {p.nombre} {p.apellido}")
        print(f"Partido: {p.nombreP}, Profesión: {p.profesion}")
        encontrado = True
        break

if not encontrado:
    print("Presidente no encontrado.")

print("\n=== Lista completa de presidentes ===")
for p in presidentes:
    p.mostrar()
