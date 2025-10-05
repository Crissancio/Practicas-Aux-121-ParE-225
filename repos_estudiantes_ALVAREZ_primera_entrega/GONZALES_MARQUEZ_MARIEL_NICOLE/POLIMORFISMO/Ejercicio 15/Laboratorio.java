public class Laboratorio {
    private String nombre;
    private int capacidad;
    private int cantidad;
    private Ordenador[] ordenadores;

    public Laboratorio(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.cantidad = 0;
        this.ordenadores = new Ordenador[capacidad];
    }

    public void agregarOrdenador(Ordenador o) {
        if (cantidad < capacidad) {
            ordenadores[cantidad] = o;
            cantidad++;
        } else {
            System.out.println(" No hay espacio en " + nombre);
        }
    }

    // Mostrar todos los ordenadores
    public void informacion() {
        System.out.println("\n--- " + nombre + " (" + cantidad + " ordenadores) ---");
        for (int i = 0; i < cantidad; i++) {
            ordenadores[i].informacion();
        }
    }

    // Mostrar según estado
    public void informacion(String estado) {
        System.out.println("\nOrdenadores en estado '" + estado + "' en " + nombre + ":");
        for (int i = 0; i < cantidad; i++) {
            if (ordenadores[i].getEstado().equalsIgnoreCase(estado)) {
                ordenadores[i].informacion();
            }
        }
    }

    // Mostrar con más de X GB de RAM
    public void informacion(int ramMinima) {
        System.out.println("\nOrdenadores con más de " + ramMinima + " GB de RAM en " + nombre + ":");
        for (int i = 0; i < cantidad; i++) {
            if (ordenadores[i].getRam() > ramMinima) {
                ordenadores[i].informacion();
            }
        }
    }

    // Trasladar ordenadores a otro laboratorio
    public void trasladar(Laboratorio destino, String cod1, String cod2) {
        System.out.println("\n--- Trasladando de " + nombre + " a " + destino.nombre + " ---");
        for (int i = 0; i < cantidad; i++) {
            if (ordenadores[i] != null) {
                String cod = ordenadores[i].getCodigoSerial();
                if (cod.equalsIgnoreCase(cod1) || cod.equalsIgnoreCase(cod2)) {
                    destino.agregarOrdenador(ordenadores[i]);
                    // Reacomodar arreglo
                    for (int j = i; j < cantidad - 1; j++) {
                        ordenadores[j] = ordenadores[j + 1];
                    }
                    ordenadores[cantidad - 1] = null;
                    cantidad--;
                    i--;
                }
            }
        }
    }
}
