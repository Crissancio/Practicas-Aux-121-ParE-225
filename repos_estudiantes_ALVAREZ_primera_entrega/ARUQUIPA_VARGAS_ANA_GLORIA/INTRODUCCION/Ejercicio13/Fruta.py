class Fruta:
    def __init__(self, nombre: str, tipo: str, vitaminas: list[str]):
        self.nombre = nombre
        self.tipo = tipo
        self.nroVitaminas = len(vitaminas)
        self.V = vitaminas[:30] 
