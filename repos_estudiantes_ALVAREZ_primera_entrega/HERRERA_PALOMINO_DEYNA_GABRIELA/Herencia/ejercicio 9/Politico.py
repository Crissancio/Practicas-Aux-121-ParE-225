class Politico:
    def __init__(self, profesion, añosExp):
        self.profesion = profesion
        self.añosExp = añosExp

    def get_profesion(self):
        return self.profesion

    def get_añosExp(self):
        return self.añosExp


class Partido:
    def __init__(self, nombreP, rol):
        self.nombreP = nombreP
        self.rol = rol

    def get_nombreP(self):
        return self.nombreP

    def get_rol(self):
        return self.rol


class Presidente(Politico):
    def __init__(self, nombre, apellido, profesion, añosExp, partido):
        super().__init__(profesion, añosExp)
        self.nombre = nombre
        self.apellido = apellido
        self.partido = partido

    @classmethod
    def desde_datos_partido(cls, nombre, apellido, profesion, añosExp, nombreP, rol):
        partido = Partido(nombreP, rol)
        return cls(nombre, apellido, profesion, añosExp, partido)

    def mostrar(self):
        print(f"Presidente: {self.nombre} {self.apellido}")
        print(f"Profesión: {self.profesion}")
        print(f"Años de experiencia: {self.añosExp}")
        print(f"Partido: {self.partido.get_nombreP()} ({self.partido.get_rol()})")
        print("-" * 40)

    def get_nombre(self):
        return self.nombre

    def get_partido(self):
        return self.partido
def main():
    p1 = Partido("Democracia Unida", "Gobernante")

    pr1 = Presidente("Luis", "Mendoza", "Abogado", 15, p1)
    pr2 = Presidente.desde_datos_partido("Carla", "Rojas", "Economista", 10, "Progreso Nacional", "Oposición")

    presidentes = [
        pr1,
        pr2,
        Presidente.desde_datos_partido("Mario", "Fernández", "Ingeniero", 20, "Renovación Popular", "Independiente")
    ]

    print("Lista de Presidentes:")
    print("=" * 40)
    for p in presidentes:
        p.mostrar()

    nombre_buscado = "Carla"
    encontrado = False
    for p in presidentes:
        if p.get_nombre().lower() == nombre_buscado.lower():
            print(f"Presidente encontrado: {p.get_nombre()}")
            print(f"Partido: {p.get_partido().get_nombreP()}")
            print(f"Profesión: {p.get_profesion()}")
            encontrado = True
            break

    if not encontrado:
        print(f"No se encontró al presidente con nombre {nombre_buscado}")


if __name__ == "__main__":
    main()
