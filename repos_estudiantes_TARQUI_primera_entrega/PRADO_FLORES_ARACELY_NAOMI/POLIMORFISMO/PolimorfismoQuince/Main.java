package PolimorfismoQuince;

public class Main {
	 public static void main(String[] args) {
	     Laboratorio lasin1 = new Laboratorio("Lasin 1", 5);
	     Laboratorio lasin2 = new Laboratorio("Lasin 2", 5);

	     Ordenador o1 = new Ordenador("A001", 1, 4, "Intel i3", true);
	     Ordenador o2 = new Ordenador("A002", 2, 8, "Intel i5", false);
	     Ordenador o3 = new Ordenador("A003", 3, 16, "Intel i7", true);
	     Ordenador o4 = new Ordenador("B001", 4, 12, "Ryzen 5", true);
	     Ordenador o5 = new Ordenador("B002", 5, 8, "Ryzen 3", false);
	     Ordenador o6 = new Ordenador("B003", 6, 16, "Ryzen 7", true);

	     lasin1.agregarOrdenador(o1);
	     lasin1.agregarOrdenador(o2);
	     lasin1.agregarOrdenador(o3);
	     lasin2.agregarOrdenador(o4);
	     lasin2.agregarOrdenador(o5);
	     lasin2.agregarOrdenador(o6);

	     lasin1.informacion(); 
	     lasin1.informacion(true); 
	     lasin1.informacion(8); 

	     System.out.println("---- Estado antes del traslado ----");
	     lasin1.informacion();
	     lasin2.informacion();

	     trasladarOrdenadores(lasin1, lasin2, 2);

	     System.out.println("---- Estado después del traslado ----");
	     lasin1.informacion();
	     lasin2.informacion();
	 }
	 
	 public static void trasladarOrdenadores(Laboratorio origen, Laboratorio destino, int cantidad) {
	     int movidos = 0;
	     for (int i = 0; i < origen.getCantidad() && movidos < cantidad; i++) {
	         Ordenador o = origen.getOrdenadores()[i];
	         destino.agregarOrdenador(o);
	         origen.getOrdenadores()[i] = null;
	         movidos++;
	     }

	     Ordenador[] nuevos = new Ordenador[origen.getOrdenadores().length];
	     int j = 0;
	     for (int i = 0; i < origen.getOrdenadores().length; i++) {
	         if (origen.getOrdenadores()[i] != null) {
	             nuevos[j++] = origen.getOrdenadores()[i];
	         }
	     }
	     origen.setCantidad(j);
	     for (int i = 0; i < nuevos.length; i++) {
	         origen.getOrdenadores()[i] = nuevos[i];
	     }

	     System.out.println("Se trasladaron " + movidos + " ordenadores de " + origen.getNombre() + " a " + destino.getNombre());
	 }
}