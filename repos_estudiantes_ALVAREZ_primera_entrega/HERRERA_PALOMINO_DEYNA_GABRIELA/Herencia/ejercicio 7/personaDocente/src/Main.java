public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ana", "Pérez", "Lopez", 20, 12345, "MAT-2025");
        Estudiante e2 = new Estudiante("Luis", "Rojas", "Torres", 22, 67890, "MAT-2025");
        Docente d1 = new Docente("Carlos", "Gomez", "Ruiz", 42, 4500, "REG-778");

        e1.mostrar();
        e2.mostrar();
        d1.mostrar();

        double promedio = Estudiante.promedio(e1, e2);
        System.out.println("\nPromedio de edad de los estudiantes: " + promedio);

        e1.modificarEdad(23);

        if (e1.getEdad() == d1.getEdad()) {
            System.out.println("\n" + e1.nombre + " tiene la misma edad que el docente.");
        } else if (e2.getEdad() == d1.getEdad()) {
            System.out.println("\n" + e2.nombre + " tiene la misma edad que el docente.");
        } else {
            System.out.println("\nNingún estudiante tiene la misma edad que el docente.");
        }
    }
}

