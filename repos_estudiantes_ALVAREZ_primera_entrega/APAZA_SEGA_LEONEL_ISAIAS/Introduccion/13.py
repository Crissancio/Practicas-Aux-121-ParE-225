class Fruta:
    def __init__(self, nombre, tipo, vitaminas):
        self.nombre = nombre
        self.tipo = tipo
        self.vitaminas = vitaminas

# Ejemplo
f1 = Fruta("Kiwi", "Subtropical", ["K", "C", "E"])
f2 = Fruta("Naranja", "Cítrica", ["C", "A"])
f3 = Fruta("Mango", "Tropical", ["A", "C", "E"])

frutas = [f1, f2, f3]
mas_vitaminas = max(frutas, key=lambda f: len(f.vitaminas))
print(f"La fruta con más vitaminas es: {mas_vitaminas.nombre}")

# FALTA c, d y e