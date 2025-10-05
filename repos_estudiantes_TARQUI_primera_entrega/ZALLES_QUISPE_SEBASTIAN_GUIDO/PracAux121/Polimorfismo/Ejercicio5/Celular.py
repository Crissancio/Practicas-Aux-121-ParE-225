class Celular:
    def __init__(self,nroTel,dueño,espacio,ram,nroApp):
        self.nroTel=nroTel
        self.dueño=dueño
        self.espacio=espacio
        self.ram=ram
        self.nroApp=nroApp
    
    def __pos__(self):
        self.nroApp+=10
        return self
    def __neg__(self):
        self.espacio-=5
        return self
    def mostrar(self):
        print("Numero de telefono: ", self.nroTel)
        print("Dueño: ",self.dueño)
        print("Espacio: ",self.espacio)
        print("Ram: ",self.ram)
        print("Numero de Apps: ",self.nroApp)

celular1=Celular("75247688","Sebastian",80,120,32)
print("Datos iniciales")
celular1.mostrar()
+celular1
-celular1
print("Datos finales")
celular1.mostrar()