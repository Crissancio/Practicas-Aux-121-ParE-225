package PRACTICA1AUXILIATURA.Herencia.Ejercicio9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Presidente p1 = new Presidente("Luis", "Arce", "Economista", 25, "MAS", "Líder");
        Presidente p2 = new Presidente("Carlos", "Mesa", "Historiador", 30, "CC", "Opositor");
        Presidente p3 = new Presidente("Evo", "Morales", "Sindicalista", 35, "MAS", "Ex-Líder");

        Presidente[] presidentes = {p1, p2, p3};

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del presidente a buscar: ");
        String nombreBuscar = sc.nextLine();
        boolean encontrado = false;

        for (Presidente p : presidentes) {
            if (p.getNombre().equalsIgnoreCase(nombreBuscar)) {
                System.out.println("\nPresidente encontrado:");
                System.out.println("Partido: " + p.getNombreP());
                System.out.println("Profesión: " + p.getProfesion());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Presidente no encontrado.");
        }

        sc.close();
    }
}

