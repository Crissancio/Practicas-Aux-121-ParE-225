# a) Class
class Celular:
    # SE DEBE SOBRECARGAR EL OPERADOR
    # a) 
    def __init__(self,nroTel,dueño,espacio,ram,nroApp):
        self.nroTel=nroTel
        self.dueño=dueño
        self.espacio=espacio
        self.ram=ram
        self.nroApp=nroApp

    # b)
    # SE DEBE SOBRECARGAR LOS OPERADORES ++ - + 
    def aumentarApps(self):
        self.nroApp+=10

    # c) 
    def disminuirEspacio(self):
        self.espacio-=5

    # d) 
    def mostrarDatos(self):
        print("Tel:",self.nroTel,"Dueño:",self.dueño,"Espacio:",self.espacio,"GB","RAM:",self.ram,"GB","Apps:",self.nroApp)

# d) 
print("///////////////")
cel=Celular("78945612","Bryan",64,8,15)
print("Datos antes de operadores:")
cel.mostrarDatos()
cel.aumentarApps()
cel.disminuirEspacio() 
print("//////////////")
print("Datos después de operadores:")
cel.mostrarDatos()
