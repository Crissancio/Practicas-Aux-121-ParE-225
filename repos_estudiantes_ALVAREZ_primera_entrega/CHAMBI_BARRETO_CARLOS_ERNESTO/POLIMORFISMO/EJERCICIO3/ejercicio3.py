class Matriz:
    def __init__(self, valores=None, n=3):
        self.n = n
        self.matriz = [[0.0 for _ in range(n)] for _ in range(n)]

        if valores is None:  
            for i in range(n):
                self.matriz[i][i] = 1.0
        else:  
            for i in range(n):
                for j in range(n):
                    self.matriz[i][j] = valores[i][j]

    def sumar(self, otra):
        resultado = Matriz(n=self.n)
        for i in range(self.n):
            for j in range(self.n):
                resultado.matriz[i][j] = self.matriz[i][j] + otra.matriz[i][j]
        return resultado


    def restar(self, otra):
        resultado = Matriz(n=self.n)
        for i in range(self.n):
            for j in range(self.n):
                resultado.matriz[i][j] = self.matriz[i][j] - otra.matriz[i][j]
        return resultado

    def igual(self, otra):
        for i in range(self.n):
            for j in range(self.n):
                if self.matriz[i][j] != otra.matriz[i][j]:
                    return False
        return True

    def __str__(self):
        return "\n".join(str(fila) for fila in self.matriz)


m1 = Matriz()  
m2 = Matriz([[2, 0, 0], [0, 2, 0], [0, 0, 2]])  

print("Matriz identidad:")
print(m1)
print("\nMatriz personalizada:")
print(m2)

print("\nSuma:")
print(m1.sumar(m2))

print("\nResta:")
print(m2.restar(m1))

print("\n¿iguales? ", m1.igual(m2))
