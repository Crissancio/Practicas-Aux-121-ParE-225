package Ejercicio11;

public class Pasajero {
    private String nombre;
    private int edad;
    private String genero;
    private double costoPasaje;

    public Pasajero(String nombre, int edad, String genero, double costoPasaje) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.costoPasaje = costoPasaje;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public double getCostoPasaje() {
        return costoPasaje;
    }

    public void mostrar() {
        System.out.println("- Nombre: " + nombre);
        System.out.println("  Edad: " + edad);
        System.out.println("  Género: " + genero);
        System.out.println("  Costo del pasaje: $" + costoPasaje);
    }
}

