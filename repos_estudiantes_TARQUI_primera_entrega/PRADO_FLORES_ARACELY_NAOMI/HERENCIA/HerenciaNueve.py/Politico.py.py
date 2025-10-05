
class Politico:
    def __init__(self, profesion="Desconocida", añosExp=0):
        self.profesion = profesion
        self.añosExp = añosExp

    def mostrar(self):
        print(f"Profesión: {self.profesion}")
        print(f"Años de experiencia: {self.añosExp}")


class Partido:
    def __init__(self, nombreP="Sin partido", rol="Ninguno"):
        self.nombreP = nombreP
        self.rol = rol

    def mostrar(self):
        print(f"Partido político: {self.nombreP}")
        print(f"Rol: {self.rol}")


class Presidente(Politico, Partido):
    def __init__(self, nombre, apellido, profesion=None, añosExp=None, nombreP=None, rol=None):
        Politico.__init__(self, profesion or "Desconocida", añosExp or 0)
        Partido.__init__(self, nombreP or "Sin partido", rol or "Ninguno")
        self.nombre = nombre
        self.apellido = apellido

    def mostrar(self):
        print(f"\n=== PRESIDENTE ===")
        print(f"Nombre: {self.nombre} {self.apellido}")
        Politico.mostrar(self)
        Partido.mostrar(self)


pres1 = Presidente("Luis", "Arce", "Economista", 20, "Partido Verde", "Líder Nacional")
pres2 = Presidente("Gabriel", "Borja", "Abogado", 15, "Partido Social", "Secretario")

presidentes = [
    pres1,
    pres2,
    Presidente("María", "Suárez", "Ingeniera Civil", 10, "Partido Popular", "Miembro")
]

for p in presidentes:
    p.mostrar()

nombreBuscado = "María"
print(f"\n=== BÚSQUEDA DE PRESIDENTE: {nombreBuscado} ===")

encontrado = False
for p in presidentes:
    if p.nombre.lower() == nombreBuscado.lower():
        print(f"Profesión: {p.profesion}")
        print(f"Partido político: {p.nombreP}")
        encontrado = True
        break

if not encontrado:
    print("No se encontró un presidente con ese nombre.")

