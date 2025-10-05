package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Deysly", "Durán", "Alipaz", 22, "1234567");
        Persona p2 = new Persona("Bruno", "Durán", "Grajeda", 17, "7654321");

        p1.mostrarDatos();
        p2.mostrarDatos();

        p1.mayorDeEdad();
        p2.mayorDeEdad();

        p2.modificarEdad(19);
        p2.mayorDeEdad();

        if (p1.mismoPaterno(p2)) {
            System.out.println("Ambas personas tienen el mismo apellido paterno.");
        } else {
            System.out.println("Tienen apellidos paternos diferentes.");
        }
    }
}
