# === Clase base Animal ===
class Animal:
    def __init__(self, nombre="", edad=0):
        self.nombre = nombre
        self.edad = edad

    def desplazarse(self):
        print(f"{self.nombre} se desplaza de alguna forma.")


# === Subclase León ===
class Leon(Animal):
    def desplazarse(self):
        print(f"🦁 El león {self.nombre} camina y corre por la sabana.")


# === Subclase Pingüino ===
class Pinguino(Animal):
    def desplazarse(self):
        print(f"🐧 El pingüino {self.nombre} nada y se desliza sobre el hielo.")


# === Subclase Canguro ===
class Canguro(Animal):
    def desplazarse(self):
        print(f"🦘 El canguro {self.nombre} se desplaza saltando ágilmente.")


# === Programa principal ===
if __name__ == "__main__":
    # Crear arreglo de animales (lista)
    animales = [
        Leon("Simba", 5),
        Pinguino("Pingu", 3),
        Canguro("Jack", 6)
    ]

    print("=== Desplazamientos de los animales ===")
    for animal in animales:
        animal.desplazarse()
