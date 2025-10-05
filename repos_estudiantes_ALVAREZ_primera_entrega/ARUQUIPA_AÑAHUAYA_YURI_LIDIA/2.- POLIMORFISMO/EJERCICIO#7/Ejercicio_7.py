# --- Clases auxiliares ---
class Admin:
    def __init__(self, nombre="", cargo=""):
        self.nombre = nombre
        self.cargo = cargo

    def mostrar(self):
        print(f"Admin -> Nombre: {self.nombre}, Cargo: {self.cargo}")


class Auto:
    def __init__(self, marca="", modelo="", color=""):
        self.marca = marca
        self.modelo = modelo
        self.color = color

    def mostrar(self):
        print(f"Auto -> Marca: {self.marca}, Modelo: {self.modelo}, Color: {self.color}")


# --- Clase principal del ejercicio ---
class Sistema:
    def __init__(self, nroAdmins=0, nroAutos=0):
        # Constructor por defecto y con parámetros
        self.nroAdmins = nroAdmins
        self.nroAutos = nroAutos
        self.admins = []
        self.autos = []

    # Método mostrar
    def mostrar(self):
        print("=== DATOS DEL SISTEMA ===")
        print(f"Nro. Admins: {self.nroAdmins}")
        print(f"Nro. Autos: {self.nroAutos}")
        print("\n-- Lista de Administradores --")
        for a in self.admins:
            a.mostrar()
        print("\n-- Lista de Autos --")
        for b in self.autos:
            b.mostrar()

    # Método adicionar(x): añadir admin
    def adicionar(self, x, y=None, z=None):
        if y is None and z is None:
            # Adicionar un admin
            self.admins.append(x)
            self.nroAdmins += 1
        else:
            # Adicionar un auto
            nuevo_auto = Auto(x, y, z)
            self.autos.append(nuevo_auto)
            self.nroAutos += 1


# --- Programa principal ---
admin1 = Admin("Carlos", "Supervisor")
admin2 = Admin("Lucía", "Gerente")

sistema = Sistema()
sistema.adicionar(admin1)
sistema.adicionar(admin2)
sistema.adicionar("Toyota", "Corolla", "Rojo")
sistema.adicionar("Nissan", "Versa", "Gris")

sistema.mostrar()
