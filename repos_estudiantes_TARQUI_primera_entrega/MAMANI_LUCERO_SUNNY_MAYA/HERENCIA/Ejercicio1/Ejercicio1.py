#Ejercicio 1. Dado el siguiente diagrama
#a) Corrija los errores que tiene el diagrama.
#b) Implemente el diagrama una vez corregido.
class Persona:
    def __init__(self,nombre,apellido,ci):
        self.__nombre=nombre
        self.__apellido=apellido
        self.__ci=ci
    def __str__(self):
        return "Nombre: {} {} | CI: {} ".format(self.__nombre,self.__apellido,self.__ci)
class Cliente(Persona):
    def __init__(self,nombre,apellido,ci,nroCompra,idCliente):
        super().__init__(nombre,apellido,ci)
        self.__nroCompra=nroCompra
        self.__idCliente=idCliente
class Jefe(Persona):
    def __init__(self,nombre,apellido,ci,sucursal,tipo):
        super().__init__(nombre,apellido,ci)
        self.__sucursal=sucursal
        self.__tipo=tipo
p1=Cliente("Karen","Torrez","12324434",45,"f67")
p2=Jefe("Gloria","Perez","43573634","La Paz Centro", "General")
print(p1)
print(p2)
#c) Haga una lista de los errores
#cometidos y de cómo evitarlos.
    
