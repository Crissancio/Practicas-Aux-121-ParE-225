
class Pasajero:
    # Constructor
    def __init__(self,nombre="",edad=0,genero=""):
        self.nombre=nombre
        self.edad=edad
        self.genero=genero
    
    #b) 
    def __inc__(self):
        self.nombre=input("Ingrese nombre del pasajero: ")
        self.edad=int(input("Ingrese edad: "))
        self.genero=input("Ingrese genero (M/F): ")
    
    def __dec__(self):
        print(f"Nombre:{self.nombre}, Edad:{self.edad}, Genero:{self.genero}")
    
    def mostrar(self):
        self.__dec__()

class Crucero:
    def __init__(self,nombre="",paisOrigen="",paisDestino="",nroPasajeros=0):
        self.nombre=nombre
        self.paisOrigen=paisOrigen
        self.paisDestino=paisDestino
        self.nroPasajeros=nroPasajeros
        self.pasajeros=[]  

    #b) 
    def __inc__(self):

        self.nombre=input("Nombre del crucero: ")
        self.paisOrigen=input("Pais origen: ")
        self.paisDestino=input("Pais destino: ")
        self.nroPasajeros=int(input("Numero de pasajeros: "))
        for i in range(self.nroPasajeros):
            print(f"--- Pasajero {i+1} ---")
            p=Pasajero()
            p.__inc__()
            self.pasajeros.append(p)
    
    def __dec__(self):
        print(f"Crucero:{self.nombre}, Origen:{self.paisOrigen}, Destino:{self.paisDestino}, Nro pasajeros:{self.nroPasajeros}")
        for p in self.pasajeros:
            p.__dec__()
    
    def mostrar(self):
        self.__dec__()

    #c) 
    def __eq__(self,otro):
    
        costo_total=(self.nroPasajeros)*100 + (otro.nroPasajeros)*100
        return costo_total

    #d) Sobrecarga +
    def __add__(self,otro):
        return self.nroPasajeros==otro.nroPasajeros

    #e) Sobrecarga -
    def __sub__(self,otro):
        # M/F
        hombres=sum(1 for p in self.pasajeros if p.genero.upper()=="M")
        mujeres=sum(1 for p in self.pasajeros if p.genero.upper()=="F")
        print(f"Crucero {self.nombre} tiene {hombres} hombres y {mujeres} mujeres")
        hombres2=sum(1 for p in otro.pasajeros if p.genero.upper()=="M")
        mujeres2=sum(1 for p in otro.pasajeros if p.genero.upper()=="F")
        print(f"Crucero {otro.nombre} tiene {hombres2} hombres y {mujeres2} mujeres")

# a) 
c1=Crucero("Mar Azul","Bolivia","Brasil",3)
c2=Crucero("Oceano Verde","Chile","Argentina",2)

p1=Pasajero("Ana",25,"F")
p2=Pasajero("Luis",30,"M")
p3=Pasajero("Maria",28,"F")
p4=Pasajero("Carlos",40,"M")
p5=Pasajero("Elena",22,"F")

c1.pasajeros=[p1,p2,p3]
c2.pasajeros=[p4,p5]

# b) 
c1.mostrar()
c2.mostrar()

# c) 
print("Costo total de ambos cruceros:",c1==c2)

# d) 
print("Misma cantidad de pasajeros?",c1+c2)

# e) 
c1-c2
