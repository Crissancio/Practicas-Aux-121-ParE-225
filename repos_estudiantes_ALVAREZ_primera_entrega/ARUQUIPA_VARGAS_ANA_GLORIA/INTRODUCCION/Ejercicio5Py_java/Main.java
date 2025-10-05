package Ejercicio5Py_java;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Pérez", "Gómez", 20, "1234567");
        Persona persona2 = new Persona("María", "Pérez", "López", 17, "7654321");
        System.out.println("---- Persona 1 ----");
        persona1.mostrarDatos();
        System.out.println("Mayor de edad: " + persona1.mayorDeEdad());
        System.out.println("\n---- Persona 2 ----");
        persona2.mostrarDatos();
        System.out.println("Mayor de edad: " + persona2.mayorDeEdad());
        persona2.modificarEdad(19);
        System.out.println("\nEdad modificada de Persona 2:");
        persona2.mostrarDatos();
        if (persona1.getPaterno().equalsIgnoreCase(persona2.getPaterno())) {
            System.out.println("\nAmbas personas tienen el mismo apellido paterno.");
        } else {
            System.out.println("\nLas personas tienen apellidos paternos diferentes.");
        }
    }
}

