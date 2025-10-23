public class Presidente extends Politico {
    private String nombre;
    private String apellido;
    private Partido partido;

    public Presidente(String nombre, String apellido, String profesion, int añosExp, Partido partido) {
        super(profesion, añosExp);
        this.nombre = nombre;
        this.apellido = apellido;
        this.partido = partido;
    }

    public Presidente(String nombre, String apellido, String profesion, int añosExp, String nombreP, String rol) {
        super(profesion, añosExp);
        this.nombre = nombre;
        this.apellido = apellido;
        this.partido = new Partido(nombreP, rol);
    }

    public void mostrar() {
        System.out.println("Presidente: " + nombre + " " + apellido +
                "\nProfesión: " + profesion +
                "\nAños de experiencia: " + añosExp +
                "\nPartido: " + partido.getNombreP() +
                " (" + partido.getRol() + ")\n");
    }

    public String getNombre() {
        return nombre;
    }

    public Partido getPartido() {
        return partido;
    }
}
