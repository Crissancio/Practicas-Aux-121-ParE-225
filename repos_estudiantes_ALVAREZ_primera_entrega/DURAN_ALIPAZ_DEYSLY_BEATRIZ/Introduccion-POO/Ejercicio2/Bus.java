package Ejercicio2;
public class Bus {
    private int capacidadTotal;
    private int pasajeros;
    private double costoPasaje = 1.50;


    public Bus(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        this.pasajeros = 0;
    }

    public void subirPasajeros(int cantidad) {
        if (pasajeros + cantidad <= capacidadTotal) {
            pasajeros += cantidad;
            System.out.println("Subieron " + cantidad + " pasajeros. Total: " + pasajeros);
        } else {
            int espacio = capacidadTotal - pasajeros;
            pasajeros = capacidadTotal;
            System.out.println("Solo pudieron subir " + espacio + " pasajeros, el bus está lleno.");
        }
    }

    public double cobrarPasaje() {
        double total = pasajeros * costoPasaje;
        System.out.println("Se cobró un total de Bs. " + String.format("%.2f", total));
        return total;
    }

    public int asientosDisponibles() {
        int disponibles = capacidadTotal - pasajeros;
        System.out.println("Asientos disponibles: " + disponibles);
        return disponibles;
    }
}
