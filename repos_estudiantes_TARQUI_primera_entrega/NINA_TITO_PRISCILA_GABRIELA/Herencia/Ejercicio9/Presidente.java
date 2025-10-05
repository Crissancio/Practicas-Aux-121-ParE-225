package PRACTICA1AUXILIATURA.Herencia.Ejercicio9;

public class Presidente implements IPolitico, IPartido {
    private String nombre;
    private String apellido;
    private String profesion;
    private int añosExp;
    private String nombreP;
    private String rol;

    public Presidente(String nombre, String apellido, String profesion, int añosExp, String nombreP, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.añosExp = añosExp;
        this.nombreP = nombreP;
        this.rol = rol;
    }

    // Métodos de IPolitico
    @Override
    public String getProfesion() {
        return profesion;
    }

    @Override
    public int getAñosExp() {
        return añosExp;
    }

    // Métodos de IPartido
    @Override
    public String getNombreP() {
        return nombreP;
    }

    @Override
    public String getRol() {
        return rol;
    }

    // Método propio
    public void mostrar() {
        System.out.println("Presidente: " + nombre + " " + apellido);
        System.out.println("Profesión: " + profesion);
        System.out.println("Años de experiencia: " + añosExp);
        System.out.println("Partido: " + nombreP);
        System.out.println("Rol: " + rol);
        System.out.println("---------------------");
    }

    public String getNombre() {
        return nombre;
    }
}
