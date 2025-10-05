package Ejercicio2;
public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus(40);

        bus1.subirPasajeros(25);
        bus1.asientosDisponibles();
        bus1.cobrarPasaje();

        bus1.subirPasajeros(20);
        bus1.asientosDisponibles();
        bus1.cobrarPasaje();
    }
}
