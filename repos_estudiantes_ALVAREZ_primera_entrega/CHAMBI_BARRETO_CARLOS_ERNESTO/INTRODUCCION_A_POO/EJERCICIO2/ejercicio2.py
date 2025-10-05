#ejercicio 2 en phyton 
class Bus:
    def __init__(self, capacidad):
        self.capacidad = capacidad      
        self.ocupados = 0             
        self.caja = 0.0             

    def subir_pasajeros(self, cantidad):
        if self.ocupados + cantidad <= self.capacidad:
            self.ocupados += cantidad
            print(f"Subieron {cantidad} pasajeros.")
        else:
            espacio = self.capacidad - self.ocupados
            self.ocupados = self.capacidad
            print(f"Solo pudieron subir {espacio} pasajeros, el bus está lleno.")
    def cobrar_pasaje(self):
        costo = 1.50 * self.ocupados
        self.caja += costo
        print(f"Se cobraron Bs. {costo:.2f} a {self.ocupados} pasajeros.")
    def asientos_disponibles(self):
        disponibles = self.capacidad - self.ocupados
        print(f"Asientos disponibles: {disponibles}")
        return disponibles
bus1 = Bus(capacidad=20)   
bus1.subir_pasajeros(15)   
bus1.cobrar_pasaje()       
bus1.asientos_disponibles()

bus1.subir_pasajeros(10)
bus1.asientos_disponibles()
