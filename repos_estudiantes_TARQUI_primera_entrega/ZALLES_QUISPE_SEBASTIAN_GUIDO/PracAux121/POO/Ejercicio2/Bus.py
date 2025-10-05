class Bus:
    def __init__(self, capacidad):
        self.capacidad = capacidad 
        self.pasajeros = 0          
        self.recaudacion = 0.0     

    def subir_pasajeros(self, cantidad):
        if self.pasajeros + cantidad <= self.capacidad:
            self.pasajeros += cantidad
            print(f"{cantidad} pasajeros subieron al bus.")
        else:
            pasajeros_que_pueden_subir = self.capacidad - self.pasajeros
            self.pasajeros = self.capacidad
            print(f"Solo pudieron subir {pasajeros_que_pueden_subir} pasajeros. Bus lleno.")

    def cobrar_pasaje(self):
        tarifa = 1.50
        monto = self.pasajeros * tarifa
        self.recaudacion += monto
        print(f"Se cobró {monto:.2f} bs. a {self.pasajeros} pasajeros.")
        return monto

    def mostrar_asientos_disponibles(self):
        asientos_disponibles = self.capacidad - self.pasajeros
        print(f"Asientos disponibles: {asientos_disponibles}")
        return asientos_disponibles

bus = Bus(capacidad=40)

bus.subir_pasajeros(25)
bus.cobrar_pasaje()
bus.mostrar_asientos_disponibles()

bus.subir_pasajeros(20) 
bus.cobrar_pasaje()
bus.mostrar_asientos_disponibles()