package HERENCIA.EJERCICIO9;

public class Presidente extends Politico{
    public String nombre, apellido;
    public Partido partido;

    public Presidente(String nombre, String apellido, String profesion, int añosExp, Partido partido ){
        super(profesion, añosExp);
        this.nombre = nombre;
        this.apellido = apellido;
        this.partido = partido;

    }
    public String getNombre(){
        return nombre;
    }
    public Partido getPartido(){
        return partido;
    }

    public void mostrarDatos(){
        System.out.println("Nombres: " + nombre + " " + apellido + "\nProfesion " + getProfesion() + " Partido: " + partido.getNombreP() + "Rol: " + partido.getRol());
    }
}
