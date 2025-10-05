class Bus:
    def __init__(self, capacidad):
        self.capacidad = capacidad
        self.pasajeros = 0
        self.recaudado = 0.0

    def subir_pasajeros(self, cantidad):
        if self.pasajeros + cantidad <= self.capacidad:
            self.pasajeros += cantidad
            print(cantidad, "pasajeros subieron al bus.")
        else:
            disponibles = self.capacidad - self.pasajeros
            self.pasajeros = self.capacidad
            print("El bus solo tenía espacio para", disponibles, "pasajeros. El resto no pudo subir.")

    def cobrar_pasajes(self):
        costo = self.pasajeros * 1.50
        self.recaudado += costo
        print("Se cobraron Bs.", costo, "a", self.pasajeros, "pasajeros.")
        return costo

    def asientos_disponibles(self):
        return self.capacidad - self.pasajeros

    def __str__(self):
        return ("Bus(capacidad=" + str(self.capacidad) +
                ", pasajeros=" + str(self.pasajeros) +
                ", recaudado=" + str(self.recaudado) + ")")


def main():
    # Crear un bus con capacidad fija (ej: 40 asientos)
    capacidad = int(input("Ingrese la capacidad del bus: "))
    bus1 = Bus(capacidad)

    # a) Suben pasajeros (entrada del usuario)
    cantidad = int(input("¿Cuántos pasajeros quieren subir?: "))
    bus1.subir_pasajeros(cantidad)
    print(bus1)

    # b) Cobrar pasajes
    bus1.cobrar_pasajes()
    print(bus1)

    # c) Mostrar asientos disponibles
    print("Asientos disponibles:", bus1.asientos_disponibles())

    # Otra prueba opcional (nueva subida)
    cantidad = int(input("¿Cuántos pasajeros más quieren subir?: "))
    bus1.subir_pasajeros(cantidad)
    print(bus1)


if __name__ == "__main__":
    main()
