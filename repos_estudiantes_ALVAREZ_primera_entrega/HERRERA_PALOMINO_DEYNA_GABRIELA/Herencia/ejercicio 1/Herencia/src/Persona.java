public class Persona {
    private String nombre;
    private String apellido;
    private String ci;
    public Persona(String nombre, String apellido, String ci) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("CI: " + ci);
    }
}
