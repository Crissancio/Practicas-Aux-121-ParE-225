class Fruta:
    def __init__(self, nombre, tipo, vitaminas):
        self.nombre = nombre
        self.tipo = tipo
        self.vitaminas = vitaminas
        self.nroVitaminas = len(vitaminas)

    def getNombre(self):
        return self.nombre

    def getTipo(self):
        return self.tipo

    def getNroVitaminas(self):
        return self.nroVitaminas

    def getVitaminas(self):
        return self.vitaminas

    def __str__(self):
        return f"Fruta: {self.nombre} | Tipo: {self.tipo} | nroVitaminas: {self.nroVitaminas} | Vitaminas: {self.vitaminas}"


if __name__ == "__main__":
    f1 = Fruta("Naranja", "Cítrica", ["A", "C"])
    f2 = Fruta("Manzana", "Dulce", ["B1", "B2", "C"])

    print(f1)
    print(f2)
