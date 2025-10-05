class Estudiante:
    # a)
    def __init__(self,nombre="",apellidos="",parcial1=0,parcial2=0,exFinal=0):
        self.nombre=nombre
        self.apellidos=apellidos
        self.parcial1=parcial1
        self.parcial2=parcial2
        self.exFinal=exFinal

    # b) 
    def notaFinal(self,sobre100=False):
        if sobre100:
            return self.parcial1*0.3+self.parcial2*0.3+self.exFinal*0.4
        else:
            return self.parcial1+self.parcial2+self.exFinal

    # c) 
    def aprobo(self,min=51,extra=0):
        nota=self.notaFinal(True)
        if extra>0:
            return nota+extra>=min
        else:
            return nota>=min

    # d) 
    def mostrar(self,conNota=False):
        print("Nombre:",self.nombre)
        print("Apellidos:",self.apellidos)
        print("Parcial1:",self.parcial1)
        print("Parcial2:",self.parcial2)
        print("ExFinal:",self.exFinal)
        if conNota:
            print("Nota Final:",self.notaFinal(True))

# a)
e1=Estudiante("Bryan","Apaza",70,80,90)
e2=Estudiante("María","Flores",50,60,70)
e3=Estudiante()
e3.nombre="Carlos"
e3.apellidos="Gutiérrez"
e3.parcial1=40
e3.parcial2=60
e3.exFinal=80

# d)
print(" Estudiante 1 -")
e1.mostrar(True)
print("Aprobó?",e1.aprobo())

print(" Estudiante 2 -")
e2.mostrar(True)
print("Aprobó con min 60?",e2.aprobo(60))

print(" Estudiante 3 -")
e3.mostrar(True)
print("Aprobó con min 60 y extra 5?",e3.aprobo(60,5))
