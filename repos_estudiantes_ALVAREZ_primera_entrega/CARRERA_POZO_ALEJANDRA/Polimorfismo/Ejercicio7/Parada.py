class Parada:
    def __init__(self, nombreP="Sin nombre", admins=None, autos=None):
        if admins is None:
            self.admins = [""] * 10
            self.nroAdmins = 0
        else:
            self.admins = admins
            self.nroAdmins = len(admins)

        if autos is None:
            self.autos = [["", "", ""] for _ in range(10)] 
            self.nroAutos = 0
        else:
            self.autos = autos
            self.nroAutos = len(autos)
        self.nombreP = nombreP
    def mostrar(self):
        print(f"=== Parada: {self.nombreP} ===")
        print("Administradores:")
        for i in range(self.nroAdmins):
            print(f"  - {self.admins[i]}")
        print("\nAutos:")
        for i in range(self.nroAutos):
            modelo, conductor, placa = self.autos[i]
            print(f"  Modelo: {modelo}, Conductor: {conductor}, Placa: {placa}")
    def adicionar(self, x):
        if self.nroAdmins < 10:
            self.admins[self.nroAdmins] = x
            self.nroAdmins += 1
            print(f"Administrador '{x}' agregado con éxito.")
        else:
            print("No se pueden agregar más administradores (límite 10).")
    def adicionar_auto(self, modelo, conductor, placa):
        if self.nroAutos < 10:
            self.autos[self.nroAutos] = [modelo, conductor, placa]
            self.nroAutos += 1
            print(f"Auto '{modelo}' agregado con éxito.")
        else:
            print("No se pueden agregar más autos (límite 10).")

if __name__ == "__main__":
    p1 = Parada()
    p1.mostrar()
    admins = ["Luis", "Marta"]
    autos = [["Toyota", "Juan", "ABC-123"], ["Nissan", "Ana", "XYZ-987"]]
    p2 = Parada("Terminal Norte", admins, autos)
    p2.mostrar()
    p2.adicionar("Carlos")
    p2.adicionar_auto("Kia", "Pedro", "JJJ-456")
    print("\nDespués de adicionar:")
    p2.mostrar()
