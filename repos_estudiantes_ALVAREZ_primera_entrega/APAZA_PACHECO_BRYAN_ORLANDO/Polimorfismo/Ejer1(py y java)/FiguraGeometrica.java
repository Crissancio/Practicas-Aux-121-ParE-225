// a) 
public class FiguraGeometrica {
    protected String nombre;

    public FiguraGeometrica(String nombre){
        this.nombre=nombre;
    }
}

// a) Cuadrado
class Cuadrado extends FiguraGeometrica{
    private double lado;

    public Cuadrado(double lado){
        super("Cuadrado");
        this.lado=lado;
    }

    // a) Á.
    public double area(){
        return lado*lado;
    }

    // b) P.
    public double perimetro(){
        return 4*lado;
    }
}

// a) Triangulo
class Triangulo extends FiguraGeometrica{
    private double base,altura,lado1,lado2,lado3;

    public Triangulo(double base,double altura,double lado1,double lado2,double lado3){
        super("Triangulo");
        this.base=base;
        this.altura=altura;
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }

    // a) Á.
    public double area(){
        return (base*altura)/2;
    }

    // b) P.
    public double perimetro(){
        return lado1+lado2+lado3;
    }
}

// a) Circulo
class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(double radio){
        super("Circulo");
        this.radio=radio;
    }

    // a) Á.
    public double area(){
        return Math.PI*radio*radio;
    }

    // b) P.
    public double perimetro(){
        return 2*Math.PI*radio;
    }
}

// a) Rectangulo
class Rectangulo extends FiguraGeometrica{
    private double base,altura;

    public Rectangulo(double base,double altura){
        super("Rectangulo");
        this.base=base;
        this.altura=altura;
    }

    // a) Á.
    public double area(){
        return base*altura;
    }

    // b) P.
    public double perimetro(){
        return 2*(base+altura);
    }
}

// d) 
class FiguraGeometricas{
    public static void main(String[] args){
        Cuadrado cuad=new Cuadrado(5);
        System.out.println("cuadrado - area:"+cuad.area()+" perimmetro:"+cuad.perimetro());

        Triangulo tri=new Triangulo(4,3,4,5,3);
        System.out.println("triangulo - area:"+tri.area()+" perimetro:"+tri.perimetro());

        Circulo circ=new Circulo(7);
        System.out.println("circulo - area:"+Math.round(circ.area()*100.0)/100.0+" perimetro:"+Math.round(circ.perimetro()*100.0)/100.0);

        Rectangulo rect=new Rectangulo(6,3);
        System.out.println("rectángulo - area:"+rect.area()+" perimetro:"+rect.perimetro());
    }
}

