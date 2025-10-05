class Mascota:
    # a) 
    def __init__(self,nombre,tipo,energia):
        self.nombre=nombre
        self.tipo=tipo
        self.energia=energia

    # a) 
    def alimentar(self):
        self.energia+=20
        if self.energia>100:
            self.energia=100
        print(self.nombre,"energia:",self.energia)

    # b) 
    def jugar(self):
        self.energia-=15
        if self.energia<0:
            self.energia=0
        print(self.nombre,"energia:",self.energia)

# c) 
m1=Mascota("Firulais","Perro",50)
m2=Mascota("Michi","Gato",80)


m1.alimentar()  
print("jugando. . . (gasta energia)!!")
m1.jugar()      
m2.alimentar()  
print("jugando. . . (gasta energia)!!")
m2.jugar()      
print(m1.nombre,"y",m2.nombre,"son amigos!!!")