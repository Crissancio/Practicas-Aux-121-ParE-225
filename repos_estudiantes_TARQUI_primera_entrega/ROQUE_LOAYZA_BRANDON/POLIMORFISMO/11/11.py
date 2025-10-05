
class Pasajero:
    def __init__(self, nombre, habitacion, costo, genero):
        self.nombre = nombre
        self.habitacion = habitacion
        self.costo = costo
        self.genero = genero

class Crucero:
    def __init__(self, nombre, pasajeros=None):
        self.nombre = nombre
        self.pasajeros = pasajeros if pasajeros else []

    def __pos__(self):
        for p in self.pasajeros:
            print(p.nombre, p.habitacion, p.costo)
        return self

    def __neg__(self):
        for p in self.pasajeros:
            print(p.nombre)
        return self

    def __eq__(self, otro):
        total = sum(p.costo for p in self.pasajeros)
        total2 = sum(p.costo for p in otro.pasajeros)
        print("Suma total:", total + total2)

    def __add__(self, otro):
        print("Misma cantidad:", len(self.pasajeros) == len(otro.pasajeros))

    def __sub__(self, otro):
        hombres = sum(1 for p in self.pasajeros if p.genero == "M")
        mujeres = sum(1 for p in self.pasajeros if p.genero == "F")
        print("Hombres:", hombres, "Mujeres:", mujeres)


p1 = Pasajero("Juan",502,500,"M")
p2 = Pasajero("Maria",603,1000,"F")
p3 = Pasajero("Luis",401,925,"M")
c1 = Crucero("Titanic",[p1,p2])
c2 = Crucero("Oasis",[p3])
+c1
-c2
c1 == c2
c1 + c2
c1 - c2
