package Ejercicio7;
//Ejercicio 7. Dado el siguiente diagrama de clases:
public class test {
	public static void main(String[] args) {
		Parada parada1=new Parada(new String[] {"Mario Benza","Laura Corel","Ximena Perez"},new String[][] {{"Toyota Corolla","Juan Pérez","1234-ABC"},{"Nissan Versa","María López","5678-XYZ"}},"terminal");
		parada1.mostrar();
		parada1.adicionar("Muriel Quiroga");
		parada1.mostrar();
		parada1.adicionar("Hyundai Tucson", "Carlos Mendoza", "9247-KLM");
		parada1.mostrar();
	
	}
}
