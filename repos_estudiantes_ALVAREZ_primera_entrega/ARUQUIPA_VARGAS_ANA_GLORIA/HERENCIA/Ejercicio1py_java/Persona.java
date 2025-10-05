public class Persona {
    protected String nombre;
    protected String apellido;
    protected String ci;

    public Persona(String nombre, String apellido, String ci) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
    }

    public void method(String tipo) {
        System.out.println("Método ejecutado con tipo: " + tipo);
    }
}
