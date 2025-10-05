package PRACTICA1AUXILIATURA.Polimorfismo.Ejercicio11;

public class Main {
    public static void main(String[] args) {
        Crucero c1 = new Crucero("Caribean", "Brasil", "México", 3);
        Crucero c2 = new Crucero("Pacific", "Chile", "Japón", 2);

        Pasajero p1 = new Pasajero("Juan Vargas", 30, "M");
        Pasajero p2 = new Pasajero("Martina Vasques", 28, "F");
        Pasajero p3 = new Pasajero("Wilmer Montero", 35, "M");
        Pasajero p4 = new Pasajero("Ana Lopez", 25, "F");
        Pasajero p5 = new Pasajero("Carlos Perez", 40, "M");

        c1.setPasajero(0, p1);
        c1.setPasajero(1, p2);
        c1.setPasajero(2, p3);

        c2.setPasajero(0, p4);
        c2.setPasajero(1, p5);

        // b) "++" y "--"
        c1.incrementar();
        c1.decrementar();
        p1.incrementar();
        p1.decrementar();

        // c) "=" suma total de costos de pasajes
        int[] costosC1 = {500, 1000, 925};
        int[] costosC2 = {700, 800};
        System.out.println("Suma de costos C1: " + c1.totalCostoPasajes(costosC1));
        System.out.println("Suma de costos C2: " + c2.totalCostoPasajes(costosC2));

        // d) "+"
        System.out.println(Crucero.compararPasajeros(c1, c2));

        // e) "-"
        c1.contarGenero();
        c2.contarGenero();
    }
}


