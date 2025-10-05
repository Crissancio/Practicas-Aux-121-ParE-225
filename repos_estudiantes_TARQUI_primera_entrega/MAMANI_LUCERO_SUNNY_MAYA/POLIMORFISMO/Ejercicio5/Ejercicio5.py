#Ejercicio 5. Dada la clase celular <nroTel, dueño, espacio, ram, nroApp>
#Ejercicio 5. Dada la clase celular <nroTel, dueño, espacio, ram, nroApp>
#a) realizar el diagrama de clases
class Celular:
    def __init__(self,nroTel,dueño,espacio,ram,nroApp):
        self.nroTel=nroTel
        self.dueño=dueño
        self.espacio=espacio
        self.ram=ram
        self.nroApp=nroApp

        #b) realizar la sobrecarga del operador ++ para aumentar en 10 el nroApp.
    def __iadd__(self,x):
        self.nroApp+=10
        return self
    #c) realizar la sobrecarga del operador - - para disminuir el espacio en 5 gb.
    def __isub__(self,x):
        self.espacio-=5
        return self
    def __str__(self):
        return "numero:{},dueño:{},espacio:{},ram:{},apps:{}".format(self.nroTel,self.dueño,self.espacio,self.ram,self.nroApp)
celular1=Celular("76363562","Dario",64,8,3)
#d) mostrar los datos antes y después de los operadores.
print(celular1)
celular1+=1
print(celular1)                                                                     
celular1-=1
print(celular1)   
                                                                     
