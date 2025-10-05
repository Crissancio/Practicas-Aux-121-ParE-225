# a) Constructor matriz identidad
class Matriz:
    # a) y b) 
    def __init__(self, valores=None):
        self.matriz=[[0 for j in range(10)] for i in range(10)]
        if valores:
            # b)    
            for i in range(10):
                for j in range(10):
                    self.matriz[i][j]=valores[i][j]
        else:
            # a)
            for i in range(10):
                self.matriz[i][i]=1

    # c) 
    def sumar(self,otra):
        resultado=Matriz()
        for i in range(10):
            for j in range(10):
                resultado.matriz[i][j]=self.matriz[i][j]+otra.matriz[i][j]
        return resultado

    # c) 
    def restar(self,otra):
        resultado=Matriz()
        for i in range(10):
            for j in range(10):
                resultado.matriz[i][j]=self.matriz[i][j]-otra.matriz[i][j]
        return resultado

    # d) 
    def igual(self,otra):
        for i in range(10):
            for j in range(10):
                if self.matriz[i][j]!=otra.matriz[i][j]:
                    return False
        return True


    def mostrar(self):
        for fila in self.matriz:
            print(fila)

# d) 
m1=Matriz() 
m2=Matriz()
m3=m1.sumar(m2)
print("Suma:")
m3.mostrar()
print("Son iguales m1 y m2?", m1.igual(m2))
