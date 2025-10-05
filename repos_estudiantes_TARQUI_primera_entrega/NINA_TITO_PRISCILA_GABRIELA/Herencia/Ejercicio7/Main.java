package PRACTICA1AUXILIATURA.Herencia.Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Juan", "Perez", "Lopez", 20, "123456", "2021001");
        Estudiante e2 = new Estudiante("Maria", "Gomez", "Diaz", 40, "654321", "2021002");
        Docente d1 = new Docente("Carlos", "Ramirez", "Sanchez", 40, 3000, "RP12345");

        e1.mostrar();
        e2.mostrar();
        d1.mostrar();

        System.out.println("Promedio de edades entre " + e1.getNombre() + " y " + e2.getNombre() + ": " + e1.promedio(e2));

        d1.verEstudIgualEdadDocente(e1);
        d1.verEstudIgualEdadDocente(e2);
    }
}
