class Matriz:
    def __init__(self,m=None):
        if m is None:
            self.matriz=[[0]*10 for i in range(10)]
            for j in range(10):
                self.matriz[j][j]=1    
        else:
            self.matriz=m
    def sumar(self,m):
        x=len(self.matriz)
        y=len(self.matriz[0])
        if x==len(m.matriz) and y==len(m.matriz[0]):
            s=[[0]*y for i in range(x)]
            for i in range(x):
                for j in range(y):
                    s[i][j]=self.matriz[i][j]+m.matriz[i][j]
            return Matriz(s)
        else:
            print("No se puede sumar: dimensiones distintas")
            return None

    def restar(self, m):
        x = len(self.matriz)
        y = len(self.matriz[0])
        if x == len(m.matriz) and y == len(m.matriz[0]):
            s=[[0]*y for i in range(x)]
            for i in range(x):
                for j in range(y):
                    s[i][j]=self.matriz[i][j]-m.matriz[i][j];
            return Matriz(s)
        else:
            print("No se puede restar: dimensiones distintas")
            return None

    def igual(self,m):
        x=len(self.matriz)
        y=len(self.matriz[0])
        if x==len(m.matriz) and y==len(m.matriz[0]):
            for i in range(x):
                for j in range(y):
                    if self.matriz[i][j]!=m.matriz[i][j]:
                        return False
            return True
        else:
            return False
    def __str__(self):
        s=""
        x=len(self.matriz)
        y=len(self.matriz[0])
        for i in range(x):
            for j in range(y):
                s+=""+str(self.matriz[i][j])
            s+="\n"
        return s
y= [
    [1.0, 2.0, 3.0],
    [4.0, 5.0, 6.0],
    [7.0, 8.0, 9.0]
]

matriz1=Matriz();
matriz2=Matriz(y);
matriz3=Matriz(y);
print(matriz1);
print(matriz1.igual(matriz2));
m=matriz2.sumar(matriz3);
print(m);
		
		
