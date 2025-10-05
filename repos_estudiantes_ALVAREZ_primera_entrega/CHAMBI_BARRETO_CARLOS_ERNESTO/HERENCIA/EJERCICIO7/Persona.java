package HERENCIA.EJERCICIO7;

public class Persona {
    public String nombre, paterno, materno;
    public int edad;

    public Persona(String nombre, String paterno, String materno, int edad) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("Nombre completo: " + nombre + paterno + materno);
        System.out.println("Edad: " + edad);
    }

    public int getEdad(){
        return edad;
    }

    //
}
