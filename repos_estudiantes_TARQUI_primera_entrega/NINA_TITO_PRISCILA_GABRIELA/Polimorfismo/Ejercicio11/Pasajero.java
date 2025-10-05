package PRACTICA1AUXILIATURA.Polimorfismo.Ejercicio11;

public class Pasajero {
    private String nombre;
    private int edad;
    private String genero;

    public Pasajero(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public Pasajero incrementar() { 
        System.out.println("Datos del pasajero:");
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Género: " + genero);
        return this;
    }
    public void decrementar() { 
        System.out.println("Mostrando pasajero: " + nombre);
    }

    public String getGenero() {
        return genero;
    }
}
