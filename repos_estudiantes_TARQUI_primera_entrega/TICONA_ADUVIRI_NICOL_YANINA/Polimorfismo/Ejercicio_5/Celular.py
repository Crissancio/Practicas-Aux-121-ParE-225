#Nicol Yanina Ticona Aduvri
#R.U: 1855987

class Celular:
    def __init__(self, nroTel, dueño, espacio, ram, nroApp):
        self.nroTel = nroTel
        self.dueño = dueño
        self.espacio = espacio  
        self.ram = ram          
        self.nroApp = nroApp

    # Mostrar datos
    def mostrarDatos(self):
        print(f"Celular de {self.dueño}")
        print(f"Nro Tel: {self.nroTel}")
        print(f"Espacio: {self.espacio} GB")
        print(f"RAM: {self.ram} GB")
        print(f"Nro de Apps: {self.nroApp}")
        print("------------------------")

    def __add__(self, other):
        if isinstance(other, int):
            nuevo = Celular(self.nroTel, self.dueño, self.espacio, self.ram, self.nroApp)
            nuevo.nroApp += other
            return nuevo
        return NotImplemented

    def __sub__(self, other):
        if isinstance(other, int):
            nuevo = Celular(self.nroTel, self.dueño, self.espacio, self.ram, self.nroApp)
            nuevo.espacio -= other
            if nuevo.espacio < 0:
                nuevo.espacio = 0
            return nuevo
        return NotImplemented

if __name__ == "__main__":
    c1 = Celular("76543210", "Juan Perez", 64, 4, 20)

    print("Datos iniciales:")
    c1.mostrarDatos()

    c1 = c1 + 10
    print("Después de aplicar ++ (instalar apps):")
    c1.mostrarDatos()
    
    c1 = c1 - 5
    print("Después de aplicar -- (usar espacio):")
    c1.mostrarDatos()
