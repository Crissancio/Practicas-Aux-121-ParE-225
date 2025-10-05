class Persona:
    # a) 
    def __init__(self,nombre,paterno,materno,edad,ci):
        self.nombre=nombre
        self.paterno=paterno
        self.materno=materno
        self.edad=edad
        self.ci=ci

    # b) 
    def mostrarDatos(self):
        print("Nombre:",self.nombre,self.paterno,self.materno)
        print("Edad:",self.edad,"CI:",self.ci)

    # c)
    def mayorDeEdad(self):
        return self.edad>=18

    # d)
    def modificarEdad(self,nuevo):
        self.edad=nuevo

    # e) 
    def mismoApellido(self,otra):
        return self.paterno==otra.paterno

# a) Instanciar
p1=Persona("Bryan","Apaza","Lopez",18,"123456")
p2=Persona("Carlos","Apaza","Perez",16,"654321")

p1.mostrarDatos()
p2.mostrarDatos()

print("P1 mayor de edad?",p1.mayorDeEdad())
print("P2 mayor de edad?",p2.mayorDeEdad())

p2.modificarEdad(20)
print("Edad modificada P2:",p2.edad)

print("Mismo apellido paterno?",p1.mismoApellido(p2))
