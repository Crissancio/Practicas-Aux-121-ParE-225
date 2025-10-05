package Ejercicio5Py_java;

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
        System.out.println("Nombre completo: " + nombre + " " + paterno + " " + materno);
        System.out.println("Edad: " + edad);
        System.out.println("CI: " + ci);
    }

    public boolean mayorDeEdad() {
        return edad >= 18;
    }

    public void modificarEdad(int nuevaEdad) {
        if (nuevaEdad > 0) {
            this.edad = nuevaEdad;
        } else {
            System.out.println("Edad inválida.");
        }
    }

    public String getPaterno() {
        return this.paterno;
    }
}
