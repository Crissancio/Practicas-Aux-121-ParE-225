class Empleado:
    def __init__(self, nombre, sueldo):
        self.nombre = nombre
        self.sueldo = sueldo

    def sueldo_total(self):
        return self.sueldo

class Chef(Empleado):
    def __init__(self, nombre, sueldo, horas_extra):
        super().__init__(nombre, sueldo)
        self.horas_extra = horas_extra

    def sueldo_total(self):
        return self.sueldo + (self.horas_extra * 20)

class Mesero(Empleado):
    def __init__(self, nombre, sueldo, propina):
        super().__init__(nombre, sueldo)
        self.propina = propina

    def sueldo_total(self):
        return self.sueldo + self.propina

class Administrativo(Empleado):
    pass

# Ejemplo
chef = Chef("Remy", 3000, 10)
m1 = Mesero("Linguini", 2000, 300)
a1 = Administrativo("Colette", 2500)
print("Sueldo Chef:", chef.sueldo_total())
print("Sueldo Mesero:", m1.sueldo_total())
print("Sueldo Administrativo:", a1.sueldo_total())
