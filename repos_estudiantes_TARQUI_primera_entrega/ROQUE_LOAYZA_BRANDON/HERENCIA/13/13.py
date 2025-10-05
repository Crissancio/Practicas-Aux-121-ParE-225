
class Empleado:
    def __init__(self, nombre, sueldo, horasExtra=0, propina=0):
        self.nombre = nombre
        self.sueldo = sueldo
        self.horasExtra = horasExtra
        self.propina = propina

    def sueldoTotal(self):
        return self.sueldo

class Chef(Empleado):
    pass

class Mesero(Empleado):
    def sueldoTotal(self):
        return self.sueldo + self.horasExtra + self.propina

class Administrativo(Empleado):
    def sueldoTotal(self):
        return self.sueldo + self.horasExtra


c = Chef("Luis",3000)
m1 = Mesero("Ana",2000,10,50)
m2 = Mesero("Pepe",2200,5,30)
a1 = Administrativo("Laura",2500,15)
a2 = Administrativo("Mario",2700,20)
v = [c,m1,m2,a1,a2]
for e in v:
    if e.sueldo == 2000:
        print(e.nombre)
for e in v:
    print(e.nombre, e.sueldoTotal())
