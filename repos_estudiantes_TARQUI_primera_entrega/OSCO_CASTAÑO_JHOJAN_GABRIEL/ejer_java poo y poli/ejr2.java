package prac1_prog2;
public class ejr2 {
	    public static void main(String[] args) {
	        Bus b1 = new Bus(50);
	        b1.subirPasajeros(20);
	        b1.subirPasajeros(15);
	        b1.mostrarDatos();
	    }
	}

	class Bus {
	    private int capacidad;
	    private int pasajeros;
	    private double costoPasaje;

	    public Bus(int capacidad) {
	        this.capacidad = capacidad;
	        this.pasajeros = 0;
	        this.costoPasaje = 1.50;
	    }

	    public void subirPasajeros(int cant) {
	        if (pasajeros + cant <= capacidad) {
	            pasajeros += cant;
	        } else {
	            System.out.println("No hay suficientes asientos disponibles.");
	        }
	    }

	    public double cobrarPasaje() {
	        return pasajeros * costoPasaje;
	    }

	    public int asientosDisponibles() {
	        return capacidad - pasajeros;
	    }

	    public void mostrarDatos() {
	        System.out.println("Capacidad: " + capacidad);
	        System.out.println("Pasajeros actuales: " + pasajeros);
	        System.out.println("Asientos disponibles: " + asientosDisponibles());
	        System.out.println("Total recaudado: " + cobrarPasaje());
	    }
	}





