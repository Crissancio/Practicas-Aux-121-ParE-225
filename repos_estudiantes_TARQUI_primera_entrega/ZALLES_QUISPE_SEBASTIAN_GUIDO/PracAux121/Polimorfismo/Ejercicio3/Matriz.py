class Matriz:
    def __init__(self,valores=None):
        if valores is None:
            self.matriz=[[1.0 if i==j else 0.0 for j in range (10)] for i in range (10)]
        else:
            if len(valores)!=10 or any(len(fila)!=10 for fila in valores):
                raise ValueError("La matriz debe ser de dimension 10x10")
            self.matriz=valores

    def suma(self,otra):
        resultado=[]
        for i in range(10):
            fila=[]
            for j in range(10):
                fila.append(self.matriz[i][j]+otra.matriz[i][j])
            resultado.append(fila)
        return Matriz(resultado)
    
    def resta(self,otra):
        resultado=[]
        for i in range(10):
            fila=[]
            for j in range(10):
                fila.append(self.matriz[i][j]-otra.matriz[i][j])
            resultado.append(fila)
        return Matriz(resultado)
    def es_igual(self,otra):
        resultado=[]
        for i in range(10):
            for j in range(10):
                if self.matriz[i][j]!=otra.matriz[i][j]:
                    return False
        return True
    
    def __str__(self):
        return '\n'.join(['\t'.join([f"{elem:.2f}" for elem in fila])for fila in self.matriz])
    
m1= Matriz()

m2= Matriz([[3]*10 for i in range(10)])

m3=m1.suma(m2)
m4=m1.resta(m2)

print(m3)
print("-----------------------------------------------------------------------")
print(m4)
print("-----------------------------------------------------------------------")
print("La primera matriz es igual a la segunda matriz?")
print(m1.es_igual(m2))

