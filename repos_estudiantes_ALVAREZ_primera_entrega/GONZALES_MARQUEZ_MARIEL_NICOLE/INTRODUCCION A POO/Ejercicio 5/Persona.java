public class Persona {
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;
    private String ci;

    public Persona(String nombre, String paterno, String materno, int edad, String ci) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.ci = ci;
    }

    public void mostrarDatos() {
        System.out.println(nombre + " " + paterno + " " + materno + ", Edad: " + edad + ", CI: " + ci);
    }

    public boolean mayorDeEdad() {
        return edad >= 18;
    }

    public void modificarEdad(int nuevo) {
        edad = nuevo;
    }

    public String getPaterno() {
        return paterno;
    }
}
