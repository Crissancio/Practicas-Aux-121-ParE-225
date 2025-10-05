public class Main {
    public static void main(String[] args) {
        Bus miBus = new Bus(40);

        miBus.subirPasajeros(25);
        miBus.cobrarPasaje();
        miBus.mostrarEstado();

        miBus.subirPasajeros(20);
        miBus.cobrarPasaje();
        miBus.mostrarEstado();
    }
}
