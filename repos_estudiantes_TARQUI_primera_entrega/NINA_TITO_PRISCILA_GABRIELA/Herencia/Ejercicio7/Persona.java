package PRACTICA1AUXILIATURA.Herencia.Ejercicio7;
//DIAGRAMA UML YA HECHO EN EL PDF DE LA PRACTICA
public abstract class Persona {
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;

    public Persona(String nombre, String paterno, String materno, int edad) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getPaterno() {
        return paterno;
    }
    public String getMaterno() {
        return materno;
    }
    public int getEdad() {
        return edad;
    }
    public void mostrar() {
        System.out.print("Nombre: " + nombre + ", Apellido Paterno: " + paterno + ", Apellido Materno: " + materno + ", Edad: " + edad);
    }
    public void modificarEdad(int edad) {
        this.edad = edad;
    }
}
