class Pasajero:
    def __init__(self, nombre, genero, nro_habitacion, costo):
        self.nombre = nombre
        self.genero = genero  
        self.nro_habitacion = nro_habitacion
        self.costo = costo

    def __str__(self):
        return f"{self.nombre} ({self.genero}) Hab:{self.nro_habitacion} Costo:{self.costo}"

class Crucero:
    def __init__(self, nombre):
        self.nombre = nombre
        self.pasajeros = []

    def agregar_pasajero(self, p):
        self.pasajeros.append(p)

    def __eq__(self, other):
        """== retorna suma total de costos"""
        return sum(p.costo for p in self.pasajeros) == sum(p.costo for p in other.pasajeros)

    def __add__(self, other):
        """+ compara si tienen misma cantidad de pasajeros"""
        return len(self.pasajeros) == len(other.pasajeros)

    def __sub__(self, other):
        """- retorna (hombres, mujeres) de self"""
        hombres = sum(1 for p in self.pasajeros if p.genero == 'M')
        mujeres = sum(1 for p in self.pasajeros if p.genero == 'F')
        return (hombres, mujeres)

    def __str__(self):
        return f"Crucero {self.nombre} con {len(self.pasajeros)} pasajeros"
    
c1 = Crucero("Mar Azul")
c2 = Crucero("Sol del Norte")

c1.agregar_pasajero(Pasajero("Juan", 'M', 502, 500))
c1.agregar_pasajero(Pasajero("Martina", 'F', 603, 1000))
c2.agregar_pasajero(Pasajero("Luis", 'M', 401, 925))

print(c1)
print(c2)

print("¿Suma costos iguales? ->", c1 == c2)
print("¿Misma cantidad de pasajeros? ->", c1 + c2)
print("Conteo hombres/mujeres en c1 ->", c1 - c2)
