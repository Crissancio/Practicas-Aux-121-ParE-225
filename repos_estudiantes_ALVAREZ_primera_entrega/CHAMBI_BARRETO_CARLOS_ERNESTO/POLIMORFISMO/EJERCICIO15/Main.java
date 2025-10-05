package POLIMORFISMO.EJERCICIO15;

public class Main {

    //la funcion xd
    public static void trasladar(Laboratorio origen, Laboratorio destino, int cantidad){
        System.out.println("\nAntes del traslado :v ");
        origen.mostrarEstado();
        destino.mostrarEstado();

        int traslados = 0;
        for(int i = 0; i < origen.capacidad && traslados < cantidad ; i++){
            if(origen.ordenadores[i] != null ){
                for(int j = 0 ; j < destino.capacidad ; j++){
                    if(destino.ordenadores[j] == null){
                        destino.ordenadores[j] = origen.ordenadores[i];
                        origen.ordenadores[i] = null;
                        traslados++;
                        break;

                    }
                }
            }
        }
        System.out.println("\nDespués del traslado :v");
        origen.mostrarEstado();
        destino.mostrarEstado();
    }
    public static void main(String[] args){
        Laboratorio lasin1 = new Laboratorio("Lasin 1 ", 3);
        Laboratorio lasin2 = new Laboratorio("Lasin2", 5);

        Ordenador o1 = new Ordenador("A01", "i3", 1, 4, true);
        Ordenador o2 = new Ordenador("A002", "i5",2, 16,  true);
        Ordenador o3 = new Ordenador("A003", "i7",3, 8, false);
        Ordenador o4 = new Ordenador("B001",  "i7",4, 12,  true);
        Ordenador o5 = new Ordenador("B002", "i9",5, 6,  false);
        Ordenador o6 = new Ordenador("B003", "i9", 6, 32, true);

        lasin1.agregarOrdenador(o1);
        lasin1.agregarOrdenador(o1);
        lasin1.agregarOrdenador(o2);
        lasin1.agregarOrdenador(o3);

        lasin2.agregarOrdenador(o4);
        lasin2.agregarOrdenador(o5);
        lasin2.agregarOrdenador(o6);

        lasin1.mostrarEstado();
        lasin2.mostrarEstado();

        lasin1.MostrarTodos();

        lasin1.mostrarMayorRAM();
        lasin2.mostrarMayorRAM();

        trasladar(lasin1, lasin2, 2);
    }
}
