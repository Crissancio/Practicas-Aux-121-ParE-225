class Crucero:
    #Ejercicio 11. Dado el siguiente diagrama UML.
    def __init__(self,nombre="",paisOrigen="",paisDestino="",nroPasajeros=0,pasajeros=[],Datos=[]):
        self.nombre=nombre
        self.paisOrigen=paisOrigen
        self.paisDestino=paisDestino
        self.nroPasajeros=nroPasajeros
        self.pasajeros=[[None]*100 for i in range(3)]
        for i in range(nroPasajeros):
            for j in range(3):
                self.pasajeros[j][i]=pasajeros[j][i]
        self.Datos=Datos
    #b) Sobrecargar los operadores ++ y -- para leer y mostrar respectivamente en ambas clases.
    def __iadd__(self,x):
        self.nombre=input("Nombre de crucero: ")
        self.paisOrigen=input("Pais origen: ")
        self.paisDestino=input("Pais destino: ")
        self.nroPasajeros=int(input("Numero de pasajeros: "))
        self.pasajeros=[[None]*100 for i in range(3)]
        self.Datos=[None]*self.nroPasajeros
        for i in range(self.nroPasajeros):
            print("Pasajero "+str(i+1))
            self.Datos[i]=Pasajero()
            self.Datos[i]+=1
            self.pasajeros[0][i]=self.Datos[i].nombre
            self.pasajeros[1][i]=input("Numero de habitacion: ")
            self.pasajeros[2][i]=int(input("Costo del pasaje: "))
        return self
    def __isub__(self,x):
        print("Nombre:"+self.nombre+"\nPais de origen:"+self.paisOrigen+"\nPais destino:"+self.paisDestino+"\nNumero de pasajeros:"+str(self.nroPasajeros))
        s=""
        for i in range(3):
            for j in range(self.nroPasajeros):
                s+=str(self.pasajeros[i][j])+"   "
            s+="\n"
        print(s)
        return self
    #c) Sobrecargar el operador == el cual muestra la suma total del costo de los pasajes del crucero.
    def __eq__(self,x):
        s=0
        for i in range(self.nroPasajeros):
            s+=self.pasajeros[2][i]
        print("El costo de pasaje total es")
        print(s)
        return s
    #d) Sobrecargar el operador “+” para mostrar si el crucero 1 y el crucero 2 tienen la misma cantidad de pasajeros
    def __add__(self,x):
        return self.nroPasajeros==x.nroPasajeros
    #e) Sobrecargar el operador “-” para mostrar cuántas mujeres y cuántos hombres existen en el crucero.
    def __sub__(self,x):
        m=0
        f=0
        for i in range(len(self.Datos)):
            if self.Datos[i].genero=="masculino":
                m+=1
            elif self.Datos[i].genero=="femenino":
                f+=1
        print("Hay {} mujeres y {} hombres en el crucero {}".format(f,m,self.nombre))
        return self
class Pasajero:
    def __init__(self,nombre="",edad=0,genero=""):
        self.nombre=nombre
        self.edad=edad
        self.genero=genero
    def __iadd__(self,x):
        self.nombre=input("Nombre: ")
        self.edad=int(input("Edad: "))
        self.genero=input("Genero: ")
        return self
    def __isub__(self,x):
        print("Nombre:"+self.nombre+"\nEdad:"+str(self.edad)+"\nGenero:"+self.genero)
        return self
#a) Instanciar 2 cruceros y 5 pasajeros.
pasajero1 = Pasajero("Juan Vargas", 30, "masculino")
pasajero2 = Pasajero("Martina Vasques", 25, "femenino")
pasajero3 = Pasajero("Wilmer Montero", 28, "masculino")
pasajero4 = Pasajero("Ana Torres", 22, "femenino")
pasajero5 = Pasajero("Luis Perez", 35, "masculino")
dat=[pasajero1,pasajero2,pasajero3,pasajero4,pasajero5]
pas=[
    [pasajero1.nombre,pasajero2.nombre,pasajero3.nombre,pasajero4.nombre,pasajero5.nombre],
    [502,603,401,215,330],
    [500,1000,925,750,600]
    ]
c1=Crucero("Lamar","Colombia","Mexico",5,pas,dat)#POR CONSTRUCTOR
c1-=1#MUESTRA
c1==None#TOTAL DE PASAJE
c2=Crucero()#POR LECTURA
c2+=1
c2-=1
c2==None
p=c1+c2#COMPARA
print(p)
t=c1-1#CUANTOS HOMBRES Y MUJERES
s=c2-2
#prueba 
"""
Python 3.13.2 (tags/v3.13.2:4f8bb39, Feb  4 2025, 15:23:48) [MSC v.1942 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.

= RESTART: D:\programacion ll\Practica Aux\POLIMORFISMO\Ejercicio11\Ejercicio11.py
#POR CONSTRUCTOR
Nombre:Lamar
Pais de origen:Colombia
Pais destinoMexico
Numero de pasajeros:5
Juan Vargas   Martina Vasques   Wilmer Montero   Ana Torres   Luis Perez   
502   603   401   215   330   
500   1000   925   750   600   

El costo de pasaje total es
3775
#POR LECTURA
Nombre de crucero: Aurora
Pais origen: Italia
Pais destino: Brasil
Numero de pasajeros: 5
Pasajero 1
Nombre: Sofia morales
Edad: 27
Genero: femenino
Numero de habitacion: 801
Costo del pasaje: 1100
Pasajero 2
Nombre: Diego Herrera
Edad: 33
Genero: masculino
Numero de habitacion: 802
Costo del pasaje: 950
Pasajero 3
Nombre: Camila Ortega
Edad: 19
Genero: femenino
Numero de habitacion: 803
Costo del pasaje: 700
Pasajero 4
Nombre: Ricardo Núñez
Edad: 45
Genero: masculino
Numero de habitacion: 804
Costo del pasaje: 1300
Pasajero 5
Nombre: Valeria Castro
Edad: 29
Genero: femenino
Numero de habitacion: 805
Costo del pasaje: 1050
Nombre:Aurora
Pais de origen:Italia
Pais destinoBrasil
Numero de pasajeros:5
Sofia morales   Diego Herrera   Camila Ortega   Ricardo Núñez   Valeria Castro   
801   802   803   804   805   
1100   950   700   1300   1050   

El costo de pasaje total es
5100
True
Hay 2 mujeres y 3 hombres en el crucero Lamar
Hay 3 mujeres y 2 hombres en el crucero Aurora"""


            
