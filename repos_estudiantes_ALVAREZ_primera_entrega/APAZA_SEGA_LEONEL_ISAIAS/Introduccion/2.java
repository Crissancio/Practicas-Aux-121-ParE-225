public class Bus {
    private int capacidad;
    private int pasajeros;
    private double costoPasaje;

    public Bus(int capacidad, double costoPasaje) {
        this.capacidad = capacidad;
        this.costoPasaje = costoPasaje;
        this.pasajeros = 0;
    }

    public void subirPasajeros(int cantidad) {
        if (pasajeros + cantidad <= capacidad) {
            pasajeros += cantidad;
        } else {
            System.out.println("No hay suficientes asientos disponibles.");
        }
    }

    public void cobrarPasaje() {
        double total = pasajeros * costoPasaje;
        System.out.println("Total cobrado: Bs. " + total);
    }

    public void mostrar() {
        System.out.println("Capacidad: " + capacidad + 
                           " | Pasajeros: " + pasajeros + 
                           " | Costo pasaje: " + costoPasaje);
    }

    public static void main(String[] args) {
        Bus b1 = new Bus(30, 2.50);
        b1.subirPasajeros(20);
        b1.mostrar();
        b1.cobrarPasaje();
    }
}

