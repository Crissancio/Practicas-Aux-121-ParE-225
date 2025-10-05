package HERENCIA.EJERCICIO5;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("DONOJAMES", "BUS123", 1, 50, "SINDICATO X");
        Moto moto = new Moto("Favri down", "MOTO456", 2, 2, true);
        Auto auto = new Auto("PIGU", "AUTO789", 3, 600, false);

        System.out.println("****Datos del bus *****");
        bus.mostrarDatos();
        System.out.println("\n**** Datos de la moto *****");
        moto.mostrarDatos();
        System.out.println("\n**** Datos del auto ***** ");
        auto.mostrarDatos();

        System.out.println("\nCAMBIANDO DE CONDUCTOR DEL AUTO :c ");
        auto.cambiarConductor("JUAN XD ");
        System.out.println("\nNuevo conductor");
        auto.mostrarDatos();
    }
}
