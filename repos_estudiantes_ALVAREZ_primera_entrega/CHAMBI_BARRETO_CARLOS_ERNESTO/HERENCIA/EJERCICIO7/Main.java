package HERENCIA.EJERCICIO7;

public class Main {
    public static void main(String[] args){
        Estudiante e1 = new Estudiante("Carlos", "Gomez", "Lopez", 34, 12682289, 5001);
        Estudiante e2 = new Estudiante("Ana", "Perez", "Mamani", 34, 1002, 5002);
        Docente d1 = new Docente("Franz", "Fernandez" , "Quispe", "Lic123", 34, 8000 );

        e1.mostrarDatos();
        e2.mostrarDatos();
        d1.mostrarDatos();

        Estudiante[] et = { e1 , e2};
        System.out.println("Promedio de los estudiantes " + Estudiante.promedio(et));

        System.out.println("\nCambiando la edad de " + e1.nombre + " a 14");
        e1.cambiarDeEdad(14);
        e1.mostrarDatos();


        boolean coin = false;
        for (Estudiante e : et) {
            if (e.getEdad() == d1.getEdad()) {
                coin = true;
                System.out.println("El estudiante " + e.nombre + " tiene la misma edad que el licenciaddo .");
                return;
            }
        }
        if (!coin) {
            System.out.println("Nadie tiene la misma edad que el licenciado.");
        }
    }
}
