public class Pasajero {
    private String nombre;
    private int edad;
    private String genero;

    public Pasajero() {
        this.nombre = "";
        this.edad = 0;
        this.genero = "";
    }

    public Pasajero(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
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

    public String toString() {
        return nombre + " (" + edad + " años, " + genero + ")";
    }
}
