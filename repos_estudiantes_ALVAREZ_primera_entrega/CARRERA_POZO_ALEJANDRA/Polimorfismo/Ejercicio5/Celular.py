class Celular:
    def __init__(self, nroTel, dueno, espacio, ram, nroApp):
        self.nroTel = nroTel
        self.dueno = dueno
        self.espacio = espacio 
        self.ram = ram         
        self.nroApp = nroApp

    def mostrar(self):
        print(f"Dueño: {self.dueno}")
        print(f"Teléfono: {self.nroTel}")
        print(f"Espacio: {self.espacio} GB")
        print(f"RAM: {self.ram} GB")
        print(f"Número de apps: {self.nroApp}")
        print("-" * 30)
    def __add__(self, otro):
        self.nroApp += 10
        return self
    def __sub__(self, otro):
        self.espacio -= 5
        return self
    
class CelularGamer(Celular):
    def __add__(self, otro):
        self.nroApp += 20  
        return self
    def __sub__(self, otro):
        self.espacio -= 10  
        return self

if __name__ == "__main__":
    c1 = Celular("0987-111-222", "Juan Pérez", 64, 4, 30)
    c2 = CelularGamer("0987-333-444", "María López", 128, 8, 50)
    print("Antes de los operadores")
    c1.mostrar()
    c2.mostrar()
    c1 + 1  
    c1 - 1  
    c2 + 1  
    c2 - 1  
    print("Despues de los operadores")
    c1.mostrar()
    c2.mostrar()

