package PRACTICA1AUXILIATURA.Introduccion_a_POO.Ejercicio2;
//Realiza la abstracción de un Bus.
public class Bus {
    private String placa;
    private int numPasajeros;
    private int asientosDisp;
    private double costoPasaje = 1.50;

    public Bus(String placa, int asientosDisp) {
        this.placa = placa;
        this.numPasajeros = 0; //Poq al inicio no tine pasajeros
        this.asientosDisp = asientosDisp;
    }
    public void subirPasajero(int cantidadPasajeros){
        if (numPasajeros + cantidadPasajeros <= asientosDisp){
            numPasajeros = numPasajeros + cantidadPasajeros;
        } else {
            int espaciosDisponibles = asientosDisp - numPasajeros;
            numPasajeros = asientosDisp;
            System.out.println("Solo subieron " + espaciosDisponibles + " pasajeros (bus lleno).");
        }
    }
    public double cobrarPasaje(){
        double dinero = costoPasaje * numPasajeros;
        return dinero;
    }
    public int asientosDisponibles(){
        return asientosDisp - numPasajeros;
    }
    public void mostrarDatos(){
        System.out.println("Placa: " + placa);
        System.out.println("Asientos totales: " + asientosDisp);
        System.out.println("Numero de pasajeros: " + numPasajeros);
        System.out.println("Asientos disponibles actualmente: " + asientosDisponibles());
        System.out.println("Costo del pasaje: " + costoPasaje);
        System.out.println("Total recaudado: " + cobrarPasaje());
    }

    public static void main(String[] args) {
        Bus bus1 = new Bus("ABC123", 40);
        bus1.subirPasajero(12);
        bus1.subirPasajero(30);
        bus1.mostrarDatos();
    }
}
