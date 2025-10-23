class Matriz:
    def __init__(self, matriz=None):
        if matriz is None:
            # Matriz identidad 3x3
            self.matriz = [[1 if i == j else 0 for j in range(3)] for i in range(3)]
        else:
            self.matriz = matriz
    #  SE DEBEN SOBRECARGAR LOS OPERADORES +, - y ==
    def sumar(self, otra):
        return Matriz([[self.matriz[i][j] + otra.matriz[i][j] for j in range(3)] for i in range(3)])

    def restar(self, otra):
        return Matriz([[self.matriz[i][j] - otra.matriz[i][j] for j in range(3)] for i in range(3)])

    def mostrar(self):
        for fila in self.matriz:
            print(fila)

# Ejemplo
m1 = Matriz()
m2 = Matriz([[2,2,2],[2,2,2],[2,2,2]])
suma = m1.sumar(m2)
print("Suma:")
suma.mostrar()
