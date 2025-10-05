# a) 
class Parada:
    def __init__(self,nombreP=""):
        self.admins=[""]*10
        self.autos=[["",""] for _ in range(10)]
        self.nombreP=nombreP
        self.nroAdmins=0
        self.nroAutos=0

    # b) 
    def mostrar(self):
        print("Parada:",self.nombreP)
        print("Admins:")
        for i in range(self.nroAdmins):
            print("-",self.admins[i])
        print("Autos:")
        for i in range(self.nroAutos):
            print("Modelo:",self.autos[i][0],"Conductor:",self.autos[i][1])

    # c) 
    def adicionar(self,x):
        if self.nroAdmins<10:
            self.admins[self.nroAdmins]=x
            self.nroAdmins+=1
        else:
            print("No se pueden agregar más admins")

    # d) 
    def adicionar_auto(self,modelo,conductor):
        if self.nroAutos<10:
            self.autos[self.nroAutos][0]=modelo
            self.autos[self.nroAutos][1]=conductor
            self.nroAutos+=1
        else:
            print("No se pueden agregar más autos")

p1=Parada("Terminal")
p1.adicionar("Bryan")
p1.adicionar("Kevin")
p1.adicionar_auto("Toyota","Luis")
p1.adicionar_auto("Nissan","Juan")
p1.mostrar()
