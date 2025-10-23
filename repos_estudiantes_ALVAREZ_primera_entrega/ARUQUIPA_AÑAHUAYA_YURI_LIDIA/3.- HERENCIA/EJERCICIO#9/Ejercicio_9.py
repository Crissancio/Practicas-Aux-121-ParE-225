# === Clase base Político ===
class Politico:
    def __init__(self, profesion="", aniosExp=0):
        self.profesion = profesion
        self.aniosExp = aniosExp

    def mostrarPolitico(self):
        print(f"👔 Profesión: {self.profesion} | Años de experiencia: {self.aniosExp}")


# === Clase base Partido ===
class Partido:
    def __init__(self, nombreP="", rol=""):
        self.nombreP = nombreP
        self.rol = rol

    def mostrarPartido(self):
        print(f"🏛️ Partido: {self.nombreP} | Rol: {self.rol}")


# === Clase derivada Presidente (hereda de Politico y Partido) ===
class Presidente(Politico, Partido):
    def __init__(self, nombre="", apellido="", profesion="", aniosExp=0, nombreP="", rol=""):
        # Llamamos a los constructores de ambas clases base
        Politico.__init__(self, profesion, aniosExp)
        Partido.__init__(self, nombreP, rol)
        self.nombre = nombre
        self.apellido = apellido

    def mostrar(self):
        print(f"👨‍💼 Presidente: {self.nombre} {self.apellido}")
        print(f"   Profesión: {self.profesion} | Años de experiencia: {self.aniosExp}")
        print(f"   Partido: {self.nombreP} | Rol: {self.rol}")
        print("-" * 50)


# === Programa principal ===
if __name__ == "__main__":
    # b) Instanciar de dos formas diferentes
    print("=== Instanciación de presidentes ===")

    # Forma 1 → todos los datos en el constructor
    pres1 = Presidente("Luis", "Arce", "Economista", 25, "MAS", "Líder principal")

    # Forma 2 → asignando después de crear
    # SE DEBE SOBRECARGAR EL CONSTRUCTOR
    pres2 = Presidente()
    pres2.nombre = "Carlos"
    pres2.apellido = "Mesa"
    pres2.profesion = "Historiador"
    pres2.aniosExp = 20
    pres2.nombreP = "Comunidad Ciudadana"
    pres2.rol = "Vocero"

    pres3 = Presidente("Eva", "Copa", "Socióloga", 10, "Jallalla", "Presidenta del Senado")

    # Mostrar datos
    pres1.mostrar()
    pres2.mostrar()
    pres3.mostrar()

    # c) Crear vector de presidentes
    presidentes = [pres1, pres2, pres3]

    # Buscar presidente por nombre
    print("=== Buscar presidente por nombre ===")
    nombre_buscar = "Carlos"

    encontrado = False
    for p in presidentes:
        if p.nombre.lower() == nombre_buscar.lower():
            print(f"✅ Presidente encontrado: {p.nombre} {p.apellido}")
            print(f"Partido: {p.nombreP}")
            print(f"Profesión: {p.profesion}")
            encontrado = True
            break

    if not encontrado:
        print("❌ No se encontró un presidente con ese nombre.")
