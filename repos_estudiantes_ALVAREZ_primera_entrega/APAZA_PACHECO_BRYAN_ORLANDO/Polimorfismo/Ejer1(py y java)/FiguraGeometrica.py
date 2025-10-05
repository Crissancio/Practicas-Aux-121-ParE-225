import math

# a)
class FiguraGeometrica:
    def __init__(self,nombre):
        self.nombre=nombre

# a) Cuadrado
class Cuadrado(FiguraGeometrica):
    def __init__(self,lado):
        super().__init__("cuadrado")
        self.lado=lado

    # a) Á.
    def area(self):
        return self.lado*self.lado

    # b) P.
    def perimetro(self):
        return 4*self.lado

# a) Triángulo
class Triangulo(FiguraGeometrica):
    def __init__(self,base,altura,lado1,lado2,lado3):
        super().__init__("triangulo")
        self.base=base
        self.altura=altura
        self.lado1=lado1
        self.lado2=lado2
        self.lado3=lado3

    # a) Á.
    def area(self):
        return (self.base*self.altura)/2

    # b) P.
    def perimetro(self):
        return self.lado1+self.lado2+self.lado3

# a) Círculo
class Circulo(FiguraGeometrica):
    def __init__(self,radio):
        super().__init__("circulo")
        self.radio=radio

    # a) Á.
    def area(self):
        return math.pi*self.radio**2

    # b) P.
    def perimetro(self):
        return 2*math.pi*self.radio

# a) Rectángulo
class Rectangulo(FiguraGeometrica):
    def __init__(self,base,altura):
        super().__init__("rectangulo")
        self.base=base
        self.altura=altura

    # a) Á.
    def area(self):
        return self.base*self.altura

    # b) P.
    def perimetro(self):
        return 2*(self.base+self.altura)

#d)
cuad=Cuadrado(5)
print("cuadrado-area:",cuad.area(),"perimetro:",cuad.perimetro())

tri=Triangulo(4,3,4,5,3)
print("triangulo-area:",tri.area(),"perimetro:",tri.perimetro())

circ=Circulo(7)
print("circulo-area:",round(circ.area(),2),"perimetro:",round(circ.perimetro(),2))

rect=Rectangulo(6,3)
print("rectángulo-area:",rect.area(),"perimetro:",rect.perimetro())
