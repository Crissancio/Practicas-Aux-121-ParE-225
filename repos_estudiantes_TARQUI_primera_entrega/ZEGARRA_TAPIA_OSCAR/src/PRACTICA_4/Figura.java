package PRACTICA_4;
interface Coloreado {
    String comoColorear();
}

abstract class Figura {
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Figura de color: " + color;
    }

    // Métodos abstractos
    public abstract double area();
    public abstract double perimetro();
}
