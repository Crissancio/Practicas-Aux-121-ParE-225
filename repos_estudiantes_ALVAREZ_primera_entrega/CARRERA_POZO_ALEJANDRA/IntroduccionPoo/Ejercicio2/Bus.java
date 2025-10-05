package IntroduccionPoo.Ejercicio2;

public abstract class Bus {
    protected int capacidadTotal;
    protected int pasajerosActuales;
    protected double costoPasaje = 1.50;

    protected Bus( int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        this.pasajerosActuales = 0;
        this.costoPasaje = 1.50;
    }
    protected void subirPasajeros(int cantidad) {
        if (pasajerosActuales + cantidad <= capacidadTotal) {
            pasajerosActuales += cantidad;
            System.out.println(cantidad + " pasajeros subieron al bus.");
        } else {
            int disponibles = capacidadTotal - pasajerosActuales;
            System.out.println("Solo pueden subir " + disponibles + " pasajeros (el bus está casi lleno).");
            pasajerosActuales = capacidadTotal;
        }
    }
    protected int asientosDisponibles() {
        int disponibles = capacidadTotal - pasajerosActuales;
        System.out.println("Asientos disponibles: " + disponibles);
        return disponibles;
    }
    protected abstract double cobrarPasaje();

    protected void mostrarEstado() {
        System.out.println("Capacidad total: " + capacidadTotal);
        System.out.println("Pasajeros actuales: " + pasajerosActuales);
        System.out.println("Costo pasaje: Bs. " + costoPasaje);
    }
}

