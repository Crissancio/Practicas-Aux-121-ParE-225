package Ejercicio2;

public class Bus {
	public int asientos;
	public int pasajeros;
	public double pasaje=1.5;
	public Bus(int asientos,int pasajeros) {
		this.asientos=asientos;
		this.pasajeros=pasajeros;
	}
	//a) Al bus desean subir X cantidad de pasajeros, actualiza los datos del bus.
	public void subirPasajeros(int x) {
		if (this.pasajeros+x>this.asientos) {
			System.out.println("no hay suficientes asientos");
		}else {
			this.pasajeros+=x;
		}
	}
	//b) Crea un método para cobrar pasaje a los pasajeros. (Costo del pasaje: bs. 1.50)’
	public double cobrarPasaje() {
		return this.pasajeros*this.pasaje;
	}
	//c) Muestra cuántos asientos quedan disponibles.
	public int AsientosDisponibles() {
		return this.asientos-this.pasajeros;
	}
}
