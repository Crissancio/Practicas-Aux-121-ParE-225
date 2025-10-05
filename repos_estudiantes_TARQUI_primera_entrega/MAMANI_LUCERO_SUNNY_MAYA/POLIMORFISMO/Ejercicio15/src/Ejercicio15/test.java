package Ejercicio15;

public class test {

	public static void main(String[] args) {
		//a) Crea dos laboratorios llamados “Lasin 1” y “Lasin 2” y seis ordenadores con datos
		//adecuados.
        Ordenador o1= new Ordenador("A001", 1, 4,  "i3", "activo");
        Ordenador o2= new Ordenador("A002", 2, 16, "i7", "inactivo");
        Ordenador o3= new Ordenador("A003", 3, 8,  "i5", "activo");
        Ordenador o4= new Ordenador("A004", 4, 12, "i5", "activo");
        Ordenador o5= new Ordenador("A005", 5, 6,  "i3", "inactivo");
        Ordenador o6= new Ordenador("A006", 6, 10, "i7", "activo");
        Ordenador[] lista = {o1, o2, o3, o4, o5, o6};
        Laboratorio lasin1 = new Laboratorio("Lasin 1", 6,new String[]{o1.getSerial(),o2.getSerial(),o3.getSerial()});
        Laboratorio lasin2 = new Laboratorio("Lasin 2", 6,new String[]{o4.getSerial(),o5.getSerial(),o6.getSerial()});
        informacion(lasin1, lista);
        informacion("activo", lista);
        informacion(lista);
        trasladar(lasin1, lasin2, "A002");
        trasladar(lasin1, lasin2, "A001");
	}
	//b) Sobrecarga el método “informacion” para:
	//• Mostrar los ordenadores que pertenecen a un laboratorio dado
    public static void informacion(Laboratorio lab, Ordenador[] ordenadores) {
        for (int i=0; i<lab.getSeriales().length; i++) {
            if (lab.getSeriales()[i] != null) {
                for (int j=0; j<ordenadores.length; j++) {
                    if (ordenadores[j]!=null && ordenadores[j].getSerial().equals(lab.getSeriales()[i])) {
                        ordenadores[j].mostrar();
                    }
                }
            }
        }

    }
    //• Mostrar los ordenadores según su estado.
    public static void informacion(String estado, Ordenador[] ordenadores) {
        for (int i = 0; i <ordenadores.length; i++) {
            if (ordenadores[i]!=null && ordenadores[i].getEstado().equalsIgnoreCase(estado)) {
                ordenadores[i].mostrar();
            }
        }
    }
    //• Muestre los ordenadores que tengan mas de 8 de Ram.
    public static void informacion(Ordenador[] ordenadores) {
        for (int i = 0; i<ordenadores.length; i++) {
            if (ordenadores[i] != null && ordenadores[i].getRam() >8) {
                ordenadores[i].mostrar();
            }
        }
    }
    //c) Implementa una función para trasladar dos ordenadores del labomratorio “Lasin 1”
    //al “Lasin 2”, mostrando el estado antes y después del traslado.
    private static void trasladar(Laboratorio origen, Laboratorio destino, String serial) {
        System.out.println("\nAntes del traslado:");
        origen.mostrar();
        destino.mostrar();
    	if (serial==null) {
            System.out.println("Serial nulo: no se traslada.");
            return;
        }
        if (!origen.contieneSerial(serial)) {
            System.out.println("Serial " + serial + " no está en " + origen.getNombre());
            return;
        }
        boolean agregado= destino.adicionarSerial(serial);
        if (!agregado) {
            System.out.println("No se trasladó " + serial + ".");
            return;
        }
        boolean quitado= origen.quitarSerial(serial);
        System.out.println("\nDespués del traslado:");
        origen.mostrar();
        destino.mostrar();
    }
    

}
