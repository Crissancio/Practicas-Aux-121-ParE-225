#Ejercicio 9. Sea la clase político(profesión, añosExp) y la clase Partido(nombreP,rol)
#crear la clase presidente(nombre, apellido) que sea una clase hija de Político y Partido
#a) Diseñar el diagrama de clases
from multimethod import multimethod
class Politico:
    def __init__(self, profesion, años_exp):
        self.profesion = profesion
        self.años_exp = años_exp

class Partido:
    def __init__(self, nombreP, rol):
        self.nombreP = nombreP
        self.rol = rol
class Presidente(Politico, Partido):
    @multimethod
    def __init__(self, nombre, apellido,profesion, años_exp,nombreP, rol):
        Politico.__init__(self, profesion, años_exp)
        Partido.__init__(self, nombreP, rol)
        self.nombre = nombre
        self.apellido = apellido
    @multimethod
    def __init__(self, nombre, apellido,politico:Politico, partido:Partido):
        Politico.__init__(self,politico.profesion, politico.años_exp)
        Partido.__init__(self,partido.nombreP, partido.rol)
        self.nombre = nombre
        self.apellido = apellido
    def __str__(self):
        return "Nombre: {} {} | Partido: {} | Profesion:{}".format(self.nombre,self.apellido,self.nombreP,self.profesion)
#b) Instanciar de dos formas diferentes a un presidente
p1 = Presidente("Ana", "Quispe", "Economista", 12,"Renovación Cívica", "Oficialista")
pol = Politico("Abogado", 9)
par = Partido("Frente Popular", "Oposición")
p2 = Presidente("Bruno", "Rojas", pol, par)
p3 = Presidente("Celia", "López", "Ingeniera", 15,"Alianza Progreso", "Coalición")
#c) Crear un vector de presidente con minimo 3 presidentes y buscar al presidente de nombre x y mostrar el partido politico y la profesión.
pres = [p1, p2, p3]
x=input()
for pr in pres:
    if pr.nombre.lower() == x.lower():
        print(pr)
