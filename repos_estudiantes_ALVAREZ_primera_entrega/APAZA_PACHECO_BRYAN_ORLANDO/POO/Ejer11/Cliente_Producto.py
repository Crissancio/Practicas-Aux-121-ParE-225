# a) y b)
class Cliente:
    # Constructor
    def __init__(self,nombre,mesa):
        self.__nombre=nombre
        self.__mesa=mesa

    # get/set
    def getNombre(self):
        return self.__nombre
    def setNombre(self,nombre):
        self.__nombre=nombre

    def getMesa(self):
        return self.__mesa
    def setMesa(self,mesa):
        self.__mesa=mesa

#clase2
class Producto:

    def __init__(self,nombre,precio):
        self.__nombre=nombre
        self.__precio=precio

    # Get/set
    def getNombre(self):
        return self.__nombre
    def setNombre(self,nombre):
        self.__nombre=nombre

    def getPrecio(self):
        return self.__precio
    def setPrecio(self,precio):
        self.__precio=precio

# c) 
c1=Cliente("Ana",5)
p1=Producto("Capuchino",10.5)

print("Cliente:",c1.getNombre(),"Mesa:",c1.getMesa())
print("Producto:",p1.getNombre(),"Precio:",p1.getPrecio(),"Bs")
