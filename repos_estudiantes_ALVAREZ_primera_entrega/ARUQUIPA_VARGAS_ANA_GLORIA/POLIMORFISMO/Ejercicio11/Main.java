package Ejercicio11;

public class Main {
    public static void main(String[] args) {
        Crucero crucero1 = new Crucero("Royal Sea", "Perú", "México");
        Crucero crucero2 = new Crucero("Ocean Star", "Chile", "Colombia");

        Pasajero p1 = new Pasajero("Juan Vargas", 45, "Masculino", 500);
        Pasajero p2 = new Pasajero("Martina Vasques", 33, "Femenino", 1000);
        Pasajero p3 = new Pasajero("Wilmer Montero", 29, "Masculino", 925);
        Pasajero p4 = new Pasajero("Lucía Torres", 37, "Femenino", 850);
        Pasajero p5 = new Pasajero("Carlos Méndez", 40, "Masculino", 700);

        crucero1.agregarPasajero(p1);
        crucero1.agregarPasajero(p2);
        crucero1.agregarPasajero(p3);

        crucero2.agregarPasajero(p4);
        crucero2.agregarPasajero(p5);

        System.out.println();
        crucero1.mostrarPasajeros();
        crucero2.mostrarPasajeros();

        System.out.println("Total pasajes Crucero 1: $" + crucero1.totalCostoPasajes());
        System.out.println("Total pasajes Crucero 2: $" + crucero2.totalCostoPasajes());

        if (crucero1.mismaCantidadPasajeros(crucero2)) {
            System.out.println("Ambos cruceros tienen la misma cantidad de pasajeros.");
        } else {
            System.out.println("Los cruceros tienen distinta cantidad de pasajeros.");
        }

        System.out.println("\n[Crucero 1] Conteo de género:");
        crucero1.contarGenero();

        System.out.println("\n[Crucero 2] Conteo de género:");
        crucero2.contarGenero();
    }
}

