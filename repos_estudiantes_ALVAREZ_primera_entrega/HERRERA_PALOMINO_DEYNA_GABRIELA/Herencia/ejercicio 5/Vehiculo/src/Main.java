public class Main {
    public static void main(String[] args) {
        Moto moto1 = new Moto("Luis", "MZP-123", 1, 150, true);
        Auto auto1 = new Auto("Ana", "ABC-789", 2, 200, false);
        Bus bus1 = new Bus("Carlos", "BUS-456", 3, 40, "Sindicato Sur");

        System.out.println("---- Información de los vehículos ----");
        moto1.mostrarInfo();
        auto1.mostrarInfo();
        bus1.mostrarInfo();

        System.out.println("\n---- Cambiando conductores ----");
        moto1.cambiarConductor("Pedro");
        auto1.cambiarConductor("Lucía");
        bus1.cambiarConductor("Roberto");

        System.out.println("\n---- Información actualizada ----");
        moto1.mostrarInfo();
        auto1.mostrarInfo();
        bus1.mostrarInfo();
    }
}
