#Nicol Yanina Ticona Aduviri
#R.U: 1855987
class Matriz:
    def __init__(self, valores_or_n):
        if isinstance(valores_or_n, int):  

            self.n = valores_or_n
            self.matriz = [[1 if i == j else 0 for j in range(self.n)] for i in range(self.n)]
        elif isinstance(valores_or_n, list):  

            self.n = len(valores_or_n)
            self.matriz = [[valores_or_n[i][j] for j in range(self.n)] for i in range(self.n)]
        else:
            raise TypeError("El argumento debe ser un entero (n) o una lista bidimensional.")

    # Método para sumar matrices
    def sumar(self, otra):
        if self.n != otra.n:
            raise ValueError("Las matrices deben tener la misma dimensión.")
        resultado = [[self.matriz[i][j] + otra.matriz[i][j] for j in range(self.n)] for i in range(self.n)]
        return Matriz(resultado)

    # Método para restar matrices
    def restar(self, otra):
        if self.n != otra.n:
            raise ValueError("Las matrices deben tener la misma dimensión.")
        resultado = [[self.matriz[i][j] - otra.matriz[i][j] for j in range(self.n)] for i in range(self.n)]
        return Matriz(resultado)

    # Método para verificar si son iguales
    def igual(self, otra):
        if self.n != otra.n:
            return False
        for i in range(self.n):
            for j in range(self.n):
                if self.matriz[i][j] != otra.matriz[i][j]:
                    return False
        return True


    def mostrar(self):
        for fila in self.matriz:
            print("\t".join(map(str, fila)))
if __name__ == "__main__":
    # Matriz identidad 3x3
    m1 = Matriz(3)
    print("Matriz Identidad:")
    m1.mostrar()

    # Matriz personalizada
    valores = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    m2 = Matriz(valores)
    print("\nMatriz m2:")
    m2.mostrar()

    # Suma
    print("\nSuma (m1 + m2):")
    suma = m1.sumar(m2)
    suma.mostrar()

    # Resta
    print("\nResta (m2 - m1):")
    resta = m2.restar(m1)
    resta.mostrar()

    # Comparación
    print("\n¿m1 == m2?", m1.igual(m2))
    print("¿m1 == Identidad 3x3?", m1.igual(Matriz(3)))
