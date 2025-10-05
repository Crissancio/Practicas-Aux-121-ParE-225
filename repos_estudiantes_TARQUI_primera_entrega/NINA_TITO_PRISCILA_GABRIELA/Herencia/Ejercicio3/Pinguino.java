package PRACTICA1AUXILIATURA.Herencia.Ejercicio3;

public class Pinguino extends Animal {
    public Pinguino(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public String desplazarse() {
        return "El pingüino se desplaza nadando.";
    }
    @Override
    public String toString(){
        return ("Nombre: " + getNombre() + ", Edad: " + getEdad() + ", " + desplazarse());
    }
    
}
