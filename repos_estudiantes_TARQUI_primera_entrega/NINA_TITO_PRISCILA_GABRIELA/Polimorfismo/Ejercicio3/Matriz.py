#Sobrecarga de operadores
class Matriz:
    def __init__(self, mat=None):
        if mat is None: 
            self.mat = [[1,0,0],[0,1,0],[0,0,1]]
        else:            
            self.mat = mat

    def __str__(self):
        n = len(self.mat)
        m = len(self.mat[0])
        cad = ""
        for i in range(n):
            for j in range(m):
                cad = cad + " " + str(self.mat[i][j])
            cad = cad + "\n"
        return cad
    
    def __add__(self, o):
        if len(o.mat) ==  len(self.mat) and len(o.mat[0]) == len(self.mat[0]) :
            columna = []
            for i in range(0,len(self.mat),1):
                fila = []
                for j in range(0,len(self.mat[0]),1):
                    fila.append(self.mat[i][j]+o.mat[i][j])
                columna.append(fila)
            return Matriz(columna)
        else:
            print("Error")
            return Matriz[[]]
        
    def __sub__(self, o):
        if len(o.mat) ==  len(self.mat) and len(o.mat[0]) == len(self.mat[0]) :
            columna = []
            for i in range(0,len(self.mat),1):
                fila = []
                for j in range(0,len(self.mat[0]),1):
                    fila.append(self.mat[i][j]-o.mat[i][j])
                columna.append(fila)
            return Matriz(columna)
        else:
            print("Error")
            return Matriz[[]]
        
    def __eq__(self, o):
        if (len(o.mat) == len(self.mat) and len(o.mat[0]) == len(self.mat[0])):
            #columna = []
            for i in range(0,len(self.mat),1):
                #fila = []
                for j in range(0,len(self.mat[0]),1):
                    if (self.mat[i][j] != o.mat[i][j]):
                        return False
            return True
        else:
            return False

mat = [[1,2,3],[4,5,6],[7,8,9]]           
A = Matriz(mat)
print("Matriz 1: ")
print (A)  
mat = [[1,2,3],[4,5,6],[7,8,9]]          
B = Matriz(mat)
print("Matriz 2: ")
print (B) 
C = Matriz()
print("Matriz 3 predeterminada: ")
print (C)

SUM = A + B
print("Matriz 1 mas matriz 2, sumada: ")
print (SUM) 

RES = A - B
print("Matriz 1 menos matriz 2, restada: ")
print (RES) 

print("¿La Matriz 1 y la matriz 2 son iguales?: ",A == B)
print("¿La Matriz 1 y la matriz 3 son iguales?: ",A == C)
print("¿La Matriz 3 y la matriz 2 son iguales?: ",B == C)