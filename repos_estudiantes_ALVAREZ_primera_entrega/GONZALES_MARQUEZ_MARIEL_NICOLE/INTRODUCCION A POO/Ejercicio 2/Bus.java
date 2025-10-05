class Bus {
    private int capacidad;
    private int pasajeros;
    private double caja;

    public Bus(int capacidad) {
        this.capacidad = capacidad;
        this.pasajeros = 0;
        this.caja = 0.0;
    }

    public void subirPasajeros(int cantidad) {
        if (pasajeros + cantidad <= capacidad) {
            pasajeros += cantidad;
            System.out.println(cantidad + " pasajeros subieron al bus.");
        } else {
            int espacio = capacidad - pasajeros;
            pasajeros = capacidad;
            System.out.println("Solo pudieron subir " + espacio + " pasajeros. El bus está lleno.");
        }
    }

    public void cobrarPasaje() {
        double tarifa = 1.50;
        double montoCobrado = pasajeros * tarifa;
        caja += montoCobrado;
        System.out.println("Se cobraron Bs. " + montoCobrado + " a los pasajeros.");
    }

    public int asientosDisponibles() {
        return capacidad - pasajeros;
    }

    public void mostrarEstado() {
        System.out.println("Pasajeros actuales: " + pasajeros);
        System.out.println("Asientos disponibles: " + asientosDisponibles());
        System.out.println("Dinero en caja: Bs. " + caja);
    }
}
