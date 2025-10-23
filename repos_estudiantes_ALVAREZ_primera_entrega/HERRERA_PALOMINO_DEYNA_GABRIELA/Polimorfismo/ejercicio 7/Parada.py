class Parada:
    def __init__(self, nombreP="Desconocido"):
        self.nombreP = nombreP
        self.admins = [None] * 10       
        self.autos = [[None] * 3 for _ in range(50)]  
        self.nroAdmins = 0
        self.nroAutos = 0

    def mostrar(self):
        print(f"Parada: {self.nombreP}")

        print("Administradores:", end=" ")
        for i in range(self.nroAdmins):
            print(self.admins[i], end=" ")
        print()

        print("Autos:")
        for i in range(self.nroAutos):
            placa, modelo, año = self.autos[i]
            print(f"Placa: {placa}, Modelo: {modelo}, Año: {año}")

    def adicionar_admin(self, admin):
        if self.nroAdmins < len(self.admins):
            self.admins[self.nroAdmins] = admin
            self.nroAdmins += 1
        else:
            print("No se pueden agregar más administradores")

    def adicionar_auto(self, placa, modelo, año):
        if self.nroAutos < len(self.autos):
            self.autos[self.nroAutos][0] = placa
            self.autos[self.nroAutos][1] = modelo
            self.autos[self.nroAutos][2] = año
            self.nroAutos += 1
        else:
            print("No se pueden agregar más autos")


if __name__ == "__main__":
    p1 = Parada("Parada Central")

    p1.adicionar_admin("Maria")
    p1.adicionar_admin("Juan")
    p1.adicionar_admin("Luis")

    p1.adicionar_auto("123ABC", "Toyota", "2020")
    p1.adicionar_auto("456XYZ", "Nissan", "2022")

    p1.mostrar()
