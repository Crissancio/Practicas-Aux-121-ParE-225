
package Ejercicio5;

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
        System.out.println("C.I.: " + ci);
        System.out.println("-------------------------");
    }

    public boolean mayorDeEdad() {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
            return true;
        } else {
            System.out.println(nombre + " es menor de edad.");
            return false;
        }
    }

    public void modificarEdad(int nuevo) {
        this.edad = nuevo;
        System.out.println("La edad de " + nombre + " fue actualizada a " + edad + " años.");
    }

    public boolean mismoPaterno(Persona otra) {
        return this.paterno.equalsIgnoreCase(otra.paterno);
    }
}
