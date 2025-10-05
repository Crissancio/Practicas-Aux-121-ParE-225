class Parada:
    def __init__(self, nombreP="", admins=None, autos=None):
        self.nombreP = nombreP
        self.admins = admins if admins is not None else [None] * 10
        self.autos = autos if autos is not None else [[None, None, None] for _ in range(10)]
        self.nroAdmins = 0
        self.nroAutos = 0

    def mostrar(self):
        print(f"Nombre de la parada: {self.nombreP}")
        print("Administradores:")
        for i in range(self.nroAdmins):
            print(f" - {self.admins[i]}")
        print("Autos:")
        for i in range(self.nroAutos):
            modelo, conductor, placa = self.autos[i]
            print(f" - Modelo: {modelo}, Conductor: {conductor}, Placa: {placa}")

    def adicionar(self, x, y=None, z=None):
        if y is None and z is None:
            if self.nroAdmins < 10:
                self.admins[self.nroAdmins] = x
                self.nroAdmins += 1
            else:
                print("No se pueden agregar más administradores")
        else:
            if self.nroAutos < 10:
                self.autos[self.nroAutos] = [x, y, z]
                self.nroAutos += 1
            else:
                print("No se pueden agregar más autos")

parada1= Parada()
parada2=Parada("Estacion Central")

parada1.adicionar("Lucas")
parada1.adicionar("Jose")
parada1.adicionar("Volvswagen","Alan","X09356")
parada1.mostrar()

parada2.adicionar("Ademar")
parada2.adicionar("Toyota","Juan","ABCD123")
parada2.adicionar("Honda","Maria","XRD456")
parada2.mostrar()
