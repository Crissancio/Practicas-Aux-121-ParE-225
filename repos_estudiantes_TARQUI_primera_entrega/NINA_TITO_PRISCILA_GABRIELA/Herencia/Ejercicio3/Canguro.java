package PRACTICA1AUXILIATURA.Herencia.Ejercicio3;

public class Canguro extends Animal {
    public Canguro(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public String desplazarse() {
        return "El canguro se desplaza saltando.";
    }
    @Override
    public String toString(){
        return ("Nombre: " + getNombre() + ", Edad: " + getEdad() + ", " + desplazarse());
    }
}
