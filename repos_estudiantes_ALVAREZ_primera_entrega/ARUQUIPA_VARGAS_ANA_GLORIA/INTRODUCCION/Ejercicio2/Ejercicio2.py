class Bus:
    def __init__(self, t_asientos):
        self.t_asientos = t_asientos
        self.pasajeros = 0
        self.tarifa = 1.50
        self.ingresos = 0.0

    def subir_pasajeros(self, cantidad):
        asientos_disponibles = self.t_asientos - self.pasajeros
        if cantidad <= asientos_disponibles:
            self.pasajeros += cantidad
            print(f"{cantidad} pasajeros subieron al bus.")
        else:
            print(f"Solo hay {asientos_disponibles} asientos disponibles.")
            self.pasajeros += asientos_disponibles
            print(f"{asientos_disponibles} pasajeros subieron al bus.")

    def cobrar_pasaje(self):
        monto_cobrado = self.pasajeros * self.tarifa
        self.ingresos += monto_cobrado
        print(f"Se cobraron Bs. {monto_cobrado:.2f} a {self.pasajeros} pasajeros.")

    def asientos_disponibles(self):
        disponibles = self.t_asientos - self.pasajeros
        print(f"Asientos disponibles: {disponibles}")
        return disponibles
