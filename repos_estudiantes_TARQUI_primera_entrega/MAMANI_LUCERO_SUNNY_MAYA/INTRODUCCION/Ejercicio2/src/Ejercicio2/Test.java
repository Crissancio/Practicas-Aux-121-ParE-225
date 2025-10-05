package Ejercicio2;

public class Test {

	public static void main(String[] args) {
		//d) Crea una instancia del bus y utiliza los métodos de los incisos anteriores.
		Bus bus1=new Bus(20,0);
		bus1.subirPasajeros(10);
		System.out.println("hay "+bus1.pasajeros+" pasajeros");
		System.out.println("Los asientos disponibles son: "+bus1.AsientosDisponibles());
		System.out.println("se cobra :"+bus1.cobrarPasaje()+"bs");

	}

}
