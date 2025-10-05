package Herencia.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Carlos", "BUS-101", 1, 50, "Sindicato A");
        Auto auto = new Auto("Lucía", "AUTO-202", 2, 120, true);
        Moto moto = new Moto("Pedro", "MOTO-303", 3, 500, true);

        System.out.println("=== Información de vehículos ===");
        bus.mostrarInfo();
        auto.mostrarInfo();
        moto.mostrarInfo();

        System.out.println("\n=== Cambio de conductor del Auto ===");
        auto.cambiarConductor("María");
        auto.mostrarInfo();
    }
}
