package PRACTICA1AUXILIATURA.Herencia.Ejercicio3;

public class Leon extends Animal{
    public Leon(String nombre, int edad){
        super(nombre, edad);
    }
    @Override
    public String desplazarse(){
        return "El león se desplaza caminando.";
    }
    @Override
    public String toString(){
        return ("Nombre: " + getNombre() + ", Edad: " + getEdad() + ", " + desplazarse());
    }
    
}
