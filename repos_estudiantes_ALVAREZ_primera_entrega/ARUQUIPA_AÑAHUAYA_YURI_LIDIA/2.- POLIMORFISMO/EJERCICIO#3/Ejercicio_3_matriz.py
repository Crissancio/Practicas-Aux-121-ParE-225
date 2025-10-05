class Matriz:
    def __init__(self, valores=None, n=3):
        """
        Constructor sobrecargado:
        - Si 'valores' es None, crea matriz identidad de tamaño n.
        - Si 'valores' se pasa, crea una matriz con esos valores.
        """
        self.n = n
        if valores is None:
            # Matriz identidad
            self.matriz = [[1.0 if i == j else 0.0 for j in range(n)] for i in range(n)]
        else:
            # Matriz con valores dados
            self.matriz = valores

    def mostrar(self):
        for fila in self.matriz:
            print(fila)
        print()

    def sumar(self, otra):
        """Suma la matriz actual con otra y devuelve una nueva matriz."""
        n = self.n
        nueva = [[self.matriz[i][j] + otra.matriz[i][j] for j in range(n)] for i in range(n)]
        return Matriz(nueva, n)

    def restar(self, otra):
        """Resta la matriz actual con otra y devuelve una nueva matriz."""
        n = self.n
        nueva = [[self.matriz[i][j] - otra.matriz[i][j] for j in range(n)] for i in range(n)]
        return Matriz(nueva, n)

    def igual(self, otra):
        """Verifica si dos matrices son iguales."""
        for i in range(self.n):
            for j in range(self.n):
                if self.matriz[i][j] != otra.matriz[i][j]:
                    return False
        return True


# ----------------- Programa de prueba -----------------
def main():
    # a) Matriz identidad (constructor predeterminado)
    print("Matriz identidad:")
    m1 = Matriz()  # identidad 3x3
    m1.mostrar()

    # b) Matriz con valores personalizados
    print("Matriz personalizada:")
    valores = [
        [2.0, 1.0, 3.0],
        [0.0, 1.0, 4.0],
        [5.0, 2.0, 1.0]
    ]
    m2 = Matriz(valores)
    m2.mostrar()

    # c) Suma y resta de matrices
    print("Suma (m1 + m2):")
    suma = m1.sumar(m2)
    suma.mostrar()

    print("Resta (m2 - m1):")
    resta = m2.restar(m1)
    resta.mostrar()

    # d) Comparar igualdad
    print("¿m1 es igual a m2?", m1.igual(m2))
    print("¿m1 es igual a identidad nueva?", m1.igual(Matriz()))


if __name__ == "__main__":
    main()
