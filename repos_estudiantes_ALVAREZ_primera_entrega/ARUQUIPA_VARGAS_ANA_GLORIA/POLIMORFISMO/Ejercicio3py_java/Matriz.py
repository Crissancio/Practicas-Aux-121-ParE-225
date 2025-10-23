class Matriz:
    def __init__(self, datos=None):
        self.filas = 10
        self.columnas = 10

        if datos is None:
            self.matriz = [[1.0 if i == j else 0.0 for j in range(self.columnas)] for i in range(self.filas)]
        else:
            if len(datos) != self.filas or any(len(fila) != self.columnas for fila in datos):
                raise ValueError("La matriz debe ser de 10x10")
            self.matriz = [[float(valor) for valor in fila] for fila in datos]

    def mostrar(self):
        for fila in self.matriz:
            print(fila)
    # SE DEBN SOBRECARAGA +, -  Y ==
    def sumar(self, otra):
        resultado = [[self.matriz[i][j] + otra.matriz[i][j] for j in range(self.columnas)] for i in range(self.filas)]
        return Matriz(resultado)

    def restar(self, otra):
        resultado = [[self.matriz[i][j] - otra.matriz[i][j] for j in range(self.columnas)] for i in range(self.filas)]
        return Matriz(resultado)

    def igual(self, otra):
        for i in range(self.filas):
            for j in range(self.columnas):
                if self.matriz[i][j] != otra.matriz[i][j]:
                    return False
        return True
