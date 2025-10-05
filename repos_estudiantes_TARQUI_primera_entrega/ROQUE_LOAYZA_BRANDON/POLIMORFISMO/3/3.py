
class Matriz:
    def __init__(self, datos=None):
        if datos is None:
            self.datos = [[1 if i == j else 0 for j in range(3)] for i in range(3)]
        else:
            self.datos = datos

    def sumar(self, otra):
        return Matriz([[self.datos[i][j] + otra.datos[i][j] for j in range(3)] for i in range(3)])

    def restar(self, otra):
        return Matriz([[self.datos[i][j] - otra.datos[i][j] for j in range(3)] for i in range(3)])

    def igual(self, otra):
        return self.datos == otra.datos

    def mostrar(self):
        for fila in self.datos:
            print(fila)


m1 = Matriz()
m2 = Matriz([[2,0,0],[0,2,0],[0,0,2]])
suma = m1.sumar(m2)
resta = m2.restar(m1)
print("Suma:")
suma.mostrar()
print("Resta:")
resta.mostrar()
print("Iguales:", m1.igual(m2))
