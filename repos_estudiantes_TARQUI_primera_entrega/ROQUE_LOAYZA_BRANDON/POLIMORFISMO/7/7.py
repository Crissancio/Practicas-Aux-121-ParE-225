
class Sistema:
    def __init__(self):
        self.admins = []
        self.autos = []

    def __init__(self, nombre="", admins=None, autos=None):
        self.nombre = nombre
        self.admins = admins if admins else []
        self.autos = autos if autos else []

    def mostrar(self):
        print("Sistema:", self.nombre)
        print("Admins:", self.admins)
        print("Autos:", self.autos)

    def adicionar(self, x):
        self.admins.append(x)

    def adicionar2(self, x, y, z):
        self.autos.append({"modelo": x, "marca": y, "anio": z})


s1 = Sistema("Registro")
s1.adicionar("Juan")
s1.adicionar("Maria")
s1.adicionar2("Fiesta", "Ford", 2020)
s1.adicionar2("Civic", "Honda", 2021)
s1.mostrar()
