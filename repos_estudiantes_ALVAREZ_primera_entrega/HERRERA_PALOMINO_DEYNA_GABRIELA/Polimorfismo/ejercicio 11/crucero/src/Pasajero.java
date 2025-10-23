public class Pasajero {
    private String nombre;
    private int edad;
    private String genero; 
    private String nroHabitacion;
    private double costoPasaje;

    public Pasajero(String nombre, int edad, String genero, String nroHabitacion, double costoPasaje) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.nroHabitacion = nroHabitacion;
        this.costoPasaje = costoPasaje;
    }

    public void incrementar(String nombre, int edad, String genero, String nroHabitacion, double costoPasaje) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.nroHabitacion = nroHabitacion;
        this.costoPasaje = costoPasaje;
    }

    public void decrementar() {
        System.out.println("Pasajero: " + nombre + " | Edad: " + edad + " | Género: " + genero +
                           " | Habitación: " + nroHabitacion + " | Costo: $" + costoPasaje);
    }

    public double getCostoPasaje() {
        return costoPasaje;
    }

    public String getGenero() {
        return genero;
    }
}

