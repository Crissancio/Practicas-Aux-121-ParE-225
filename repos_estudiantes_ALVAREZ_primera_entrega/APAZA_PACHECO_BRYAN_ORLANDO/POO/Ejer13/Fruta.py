# a)
class Fruta:
    def __init__(self,nombre,tipo,nroVitaminas,v):
        self.nombre=nombre
        self.tipo=tipo
        self.nroVitaminas=nroVitaminas
        self.v=v  

    def getNombre(self):
        return self.nombre
    def setNombre(self,nombre):
        self.nombre=nombre

    def getTipo(self):
        return self.tipo
    def setTipo(self,tipo):
        self.tipo=tipo

    def getNroVitaminas(self):
        return self.nroVitaminas
    def setNroVitaminas(self,nro):
        self.nroVitaminas=nro

    def getV(self):
        return self.v
    def setV(self,v):
        self.v=v

f1=Fruta("Kiwi","Subtropical",3,["C","E","K"])
f2=Fruta("Naranja","Cítrica",4,["C","A","B1","B2"])
f3=Fruta("Fresa","Templada",2,["C","B9"])

# b)
frutas=[f1,f2,f3]
fruta_mas_vitaminas=max(frutas,key=lambda f:f.nroVitaminas)
print("Fruta con más vitaminas:",fruta_mas_vitaminas.nombre)

# c) 
print("Vitaminas de Kiwi:",f1.v)

# d) Cuantas v ejemplo C
total_citricas=sum(v.count("C") for f in frutas for v in f.v)
print("Cantidad de vitaminas cítricas:",total_citricas)

# e) Ordenar segun vitaminas xd
for f in frutas:
    f.v.sort()
for f in frutas:
    print(f.nombre,":",f.v)
