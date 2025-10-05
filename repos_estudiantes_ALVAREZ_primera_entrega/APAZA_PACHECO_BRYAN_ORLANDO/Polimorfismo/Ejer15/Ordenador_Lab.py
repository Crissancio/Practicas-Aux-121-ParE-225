#a) 
class Ordenador:
    def __init__(self,serial,numero,ram,procesador,estado):
        self.serial=serial
        self.numero=numero
        self.ram=ram
        self.procesador=procesador
        self.estado=estado
    
    def informacion(self):
        return f"Serial:{self.serial}, Numero:{self.numero}, RAM:{self.ram}GB, Procesador:{self.procesador}, Estado:{self.estado}"

class Laboratorio:
    def __init__(self,nombre,capacidad):
        self.nombre=nombre
        self.capacidad=capacidad
        self.ordenadores=[]
    
    def agregar_ordenador(self,ordenador):
        if len(self.ordenadores)<self.capacidad:
            self.ordenadores.append(ordenador)
    
    #b) 
    def informacion(self,estado=None,ram=None):
        resultado=[]
        for o in self.ordenadores:
            if estado and o.estado!=estado:
                continue
            if ram and o.ram<=ram:
                continue
            resultado.append(o.informacion())
        return resultado

lasin1=Laboratorio("Lasin 1",5)
lasin2=Laboratorio("Lasin 2",5)

o1=Ordenador("S001",1,8,"Intel i5","activo")
o2=Ordenador("S002",2,16,"Intel i7","inactivo")
o3=Ordenador("S003",3,12,"AMD Ryzen 5","activo")
o4=Ordenador("S004",4,4,"Intel i3","activo")
o5=Ordenador("S005",5,16,"AMD Ryzen 7","inactivo")
o6=Ordenador("S006",6,8,"Intel i5","activo")

lasin1.agregar_ordenador(o1)
lasin1.agregar_ordenador(o2)
lasin1.agregar_ordenador(o3)
lasin2.agregar_ordenador(o4)
lasin2.agregar_ordenador(o5)
lasin2.agregar_ordenador(o6)

#c) 
def trasladar_ordenadores(origen,destino,cantidad):
    print(f"Estado antes del traslado de {origen.nombre} a {destino.nombre}:")
    print("Origen:",[o.serial for o in origen.ordenadores])
    print("Destino:",[o.serial for o in destino.ordenadores])
    
    for i in range(min(cantidad,len(origen.ordenadores))):
        o=origen.ordenadores.pop(0)
        destino.agregar_ordenador(o)
    
    print(f"Estado después del traslado:")
    print("Origen:",[o.serial for o in origen.ordenadores])
    print("Destino:",[o.serial for o in destino.ordenadores])

trasladar_ordenadores(lasin1,lasin2,2)

#b) 
print("\nOrdenadores activos en Lasin 2:",lasin2.informacion(estado="activo"))
print("Ordenadores con RAM>8GB en Lasin 2:",lasin2.informacion(ram=8))
