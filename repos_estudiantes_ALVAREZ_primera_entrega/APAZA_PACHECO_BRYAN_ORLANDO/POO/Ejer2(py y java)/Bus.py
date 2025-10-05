class Bus:
    def __init__(self, capacidad, costo):
        self.capacidad=capacidad
        self.pasajeros=0
        self.costo=float(costo)

    # a)
    def subir_pasajeros(self, cantidad):
        if self.pasajeros+cantidad <= self.capacidad:
            self.pasajeros+=cantidad
        else:
            print("No hay suficientes asientos")

    # b)
    def cobrar_pasaje(self):
        return self.pasajeros*self.costo

    # c)
    def asientos_disponibles(self):
        return self.capacidad-self.pasajeros


# d)
miBus=Bus(40,1.5)
miBus.subir_pasajeros(10)  
print("Total cobrado:", miBus.cobrar_pasaje(),"Bs")  
print("Asientos disponibles:", miBus.asientos_disponibles())  
