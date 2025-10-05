
class Matriz:
    def __init__(self, valores=None):
        if valores is None:
            self.matriz = [[1 if i == j else 0 for j in range(10)] for i in range(10)]
        else:
            self.matriz = valores

    def mostrar(self):
        for fila in self.matriz:
            print(fila)

    def sumar(self, otra):
        resultado = [[self.matriz[i][j] + otra.matriz[i][j] for j in range(10)] for i in range(10)]
        return Matriz(resultado)

    def restar(self, otra):
        resultado = [[self.matriz[i][j] - otra.matriz[i][j] for j in range(10)] for i in range(10)]
        return Matriz(resultado)

    def igual(self, otra):
        for i in range(10):
            for j in range(10):
                if self.matriz[i][j] != otra.matriz[i][j]:
                    return False
        return True


m1 = Matriz()
valores = [[i + j for j in range(10)] for i in range(10)]
m2 = Matriz(valores)

print("Matriz 1 (Identidad):")
m1.mostrar()

print("\nMatriz 2 (Personalizada):")
m2.mostrar()

print("\n=== Suma ===")
suma = m1.sumar(m2)
suma.mostrar()

print("\n=== Resta ===")
resta = m2.restar(m1)
resta.mostrar()

print("\n¿Son iguales?:", m1.igual(m2))



