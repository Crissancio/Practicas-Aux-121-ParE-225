package PRACTICA1AUXILIATURA.Herencia.Ejercicio3;

public abstract class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public abstract String desplazarse();
    
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
}
