public class Laboratorio {
    private String nombre;
    private int capacidad;
    private int nroOrdenadores;
    private String[] codigosSeriales; 

    public Laboratorio(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroOrdenadores = 0;
        this.codigosSeriales = new String[capacidad];
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarOrdenador(String codigoSerial) {
        if (nroOrdenadores < capacidad) {
            codigosSeriales[nroOrdenadores] = codigoSerial;
            nroOrdenadores++;
        } else {
            System.out.println("El laboratorio " + nombre + " está lleno.");
        }
    }

    public void informacion(Ordenador[] todos) {
        System.out.println("\n--- Ordenadores en " + nombre + " ---");
        for (int i = 0; i < nroOrdenadores; i++) {
            for (Ordenador o : todos) {
                if (o.getCodigoSerial().equalsIgnoreCase(codigosSeriales[i])) {
                    o.mostrarInfo();
                }
            }
        }
    }

    public void informacion(Ordenador[] todos, String estado) {
        System.out.println("\n--- Ordenadores " + estado.toUpperCase() + " en " + nombre + " ---");
        for (int i = 0; i < nroOrdenadores; i++) {
            for (Ordenador o : todos) {
                if (o.getCodigoSerial().equalsIgnoreCase(codigosSeriales[i]) &&
                    o.getEstado().equalsIgnoreCase(estado)) {
                    o.mostrarInfo();
                }
            }
        }
    }

    public void informacion(Ordenador[] todos, int ramMinima) {
        System.out.println("\n--- Ordenadores con más de " + ramMinima + "GB RAM en " + nombre + " ---");
        for (int i = 0; i < nroOrdenadores; i++) {
            for (Ordenador o : todos) {
                if (o.getCodigoSerial().equalsIgnoreCase(codigosSeriales[i]) &&
                    o.getRam() > ramMinima) {
                    o.mostrarInfo();
                }
            }
        }
    }

    public void trasladar(Laboratorio destino, String[] codigos) {
        for (String codigo : codigos) {
            for (int i = 0; i < nroOrdenadores; i++) {
                if (codigosSeriales[i].equalsIgnoreCase(codigo)) {
                    destino.agregarOrdenador(codigo);
                    System.out.println("Se trasladó el ordenador " + codigo + " de " + nombre + " a " + destino.getNombre());
                    for (int j = i; j < nroOrdenadores - 1; j++) {
                        codigosSeriales[j] = codigosSeriales[j + 1];
                    }
                    codigosSeriales[nroOrdenadores - 1] = null;
                    nroOrdenadores--;
                    break;
                }
            }
        }
    }
}
