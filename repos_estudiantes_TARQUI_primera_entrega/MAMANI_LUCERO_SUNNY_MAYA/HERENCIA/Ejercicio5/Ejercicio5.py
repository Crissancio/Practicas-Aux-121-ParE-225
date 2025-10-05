#Ejercicio 5.Sea el diagrama:
class Vehiculo:
    def __init__(self,conductor,placa,id):
        self._conductor=conductor
        self._placa=placa
        self._id=id
    #c) Crear un método para cambiar al conductor de un vehículo
    def cambiar(self,x):
        self._conductor=x
    def __str__(self):
        return "Placa: {} | Conductor: {}".format(self._placa,self._conductor)
class Bus(Vehiculo):
    def __init__(self,conductor,placa,id,capacidad,sindicato):
        super().__init__(conductor,placa,id)
        self.__capacidad=capacidad
        self.__sindicato=sindicato
class Auto(Vehiculo):
    def __init__(self,conductor,placa,id,caballosFuerza,descapotable):
        super().__init__(conductor,placa,id)
        self.__caballosFuerza=caballosFuerza
        self.__descapotable=descapotable
class Moto(Vehiculo):
    def __init__(self,conductor,placa,id,cilindrada,casco):
        super().__init__(conductor,placa,id)
        self.__cilindrada=cilindrada
        self.__casco=casco
#a) Instanciar un vehículo de cada tipo
v1=Bus("Juan Perez","123-ABC",1,45,"Sindicato Central")
v2=Auto("María López","456-XYZ",2,120,True)
v3=Auto("Carlos Gómez","789-MNO",3,250,True)
#b) Mostrar La placa y conductor cada vehículo.
print(v1)
print(v2)
print(v3)
v1.cambiar("Dorian Calle")
print(v1)

