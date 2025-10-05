
class Persona:
    def __init__(self, nombre, apellido, ci):
        self.nombre = nombre
        self.apellido = apellido
        self.ci = ci

    def mostrar_datos(self):
        print(f"Nombre: {self.nombre}")
        print(f"Apellido: {self.apellido}")
        print(f"CI: {self.ci}")


class Cliente(Persona):
    def __init__(self, nombre, apellido, ci, nro_compra, id_cliente):
        super().__init__(nombre, apellido, ci)  
        self.nro_compra = nro_compra
        self.id_cliente = id_cliente

    def mostrar_datos(self):
        super().mostrar_datos()  
        print(f"Número de compras: {self.nro_compra}")
        print(f"ID Cliente: {self.id_cliente}")



class Jefe(Persona):
    def __init__(self, nombre, apellido, ci, sucursal, tipo):
        super().__init__(nombre, apellido, ci)
        self.sucursal = sucursal
        self.tipo = tipo

    def mostrar_datos(self):
        super().mostrar_datos()
        print(f"Sucursal: {self.sucursal}")
        print(f"Tipo: {self.tipo}")


if __name__ == "__main__":

    cliente1 = Cliente("Juan", "Pérez", "123456", 5, "C001")
    print(" Cliente ")
    cliente1.mostrar_datos()

    print()


    jefe1 = Jefe("María", "Lopez", "987654", "Sucursal Central", "General")
    print(" Jefe ")
    jefe1.mostrar_datos()

#la recomendacion; 
# A la hora de crear una clase que esta heredando atributos de otra, fijarse que esta no se este repitiendo los mismo atributos, tambien fijarnos que tipo
# datos son nuestros atributos y no nos estemos confundiendo, si por ejemplo es un dato tipo int pero le estemos metiendo que es tipo String y describir 
# bien nuestros tipos de metodos para asi entender mejor nuestro codigo.