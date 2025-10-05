package Herencia.Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ana", "López", "García", 20, "RU001", "MAT123");
        Estudiante e2 = new Estudiante("Luis", "Pérez", "Soto", 22, "RU002", "MAT456");
        Docente d1 = new Docente("Carlos", "Rojas", "Vega", 22, 3500.50, "REG123");

        System.out.println("\n--- Mostrar información ---");
        e1.mostrar();
        e2.mostrar();
        d1.mostrar();

        System.out.println("\n--- Promedio de edad de los estudiantes ---");
        double promedio = (e1.getEdad() + e2.getEdad()) / 2.0;
        System.out.println("Promedio de edad: " + promedio);

        System.out.println("\n--- Modificar edad de un estudiante ---");
        e1.modificarEdad(23);
        e1.mostrar();

        System.out.println("\n--- Comparar edad entre estudiante y docente ---");
        if (e2.getEdad() == d1.getEdad()) {
            System.out.println(e2.nombre + " tiene la misma edad que el docente " + d1.nombre);
        } else {
            System.out.println("No tienen la misma edad.");
        }
    }
}

