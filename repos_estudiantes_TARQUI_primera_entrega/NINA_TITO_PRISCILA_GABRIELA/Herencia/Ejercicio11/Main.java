package PRACTICA1AUXILIATURA.Herencia.Ejercicio11;

public class Main {
    public static void main(String[] args) {
        JefePolicia jefe1 = new JefePolicia("Juan", 45, 5000, "Investigación", "Comisario", 20);
        JefePolicia jefe2 = new JefePolicia("Carlos", 50, 6000, "Seguridad", "Comisario", 25);

        jefe1.mostrarDatos();
        System.out.println("-------------------");
        jefe2.mostrarDatos();
        System.out.println("-------------------");

        if (jefe1.getSueldo() > jefe2.getSueldo()) {
            System.out.println("Mayor sueldo: " + jefe1.nombre);
        } else {
            System.out.println("Mayor sueldo: " + jefe2.nombre);
        }

        if (jefe1.getGrado().equals(jefe2.getGrado())) {
            System.out.println("Ambos tienen el mismo grado.");
        } else {
            System.out.println("Tienen distinto grado.");
        }
    }
}
