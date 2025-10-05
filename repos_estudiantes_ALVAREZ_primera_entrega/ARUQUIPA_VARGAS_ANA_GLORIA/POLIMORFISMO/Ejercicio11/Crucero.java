package Ejercicio11;

public class Crucero {
    private String nombre;
    private String paisOrigen;
    private String paisDestino;
    private Pasajero[] pasajeros;
    private int nroPasajeros;

    public Crucero() {
        this.nombre = "Sin nombre";
        this.paisOrigen = "Desconocido";
        this.paisDestino = "Desconocido";
        this.pasajeros = new Pasajero[100];
        this.nroPasajeros = 0;
    }

    public Crucero(String nombre, String paisOrigen, String paisDestino) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.paisDestino = paisDestino;
        this.pasajeros = new Pasajero[100];
        this.nroPasajeros = 0;
    }

    public void agregarPasajero(Pasajero p) {
        if (nroPasajeros < pasajeros.length) {
            pasajeros[nroPasajeros++] = p;
            System.out.println("Pasajero agregado: " + p.getNombre());
        } else {
            System.out.println("El crucero está lleno.");
        }
    }

    public void mostrarPasajeros() {
        System.out.println(" Pasajeros del crucero '" + nombre + "' ");
        for (int i = 0; i < nroPasajeros; i++) {
            pasajeros[i].mostrar();
            System.out.println();
        }
    }

    public double totalCostoPasajes() {
        double total = 0;
        for (int i = 0; i < nroPasajeros; i++) {
            total += pasajeros[i].getCostoPasaje();
        }
        return total;
    }

    public boolean mismaCantidadPasajeros(Crucero otro) {
        return this.nroPasajeros == otro.nroPasajeros;
    }

    public void contarGenero() {
        int hombres = 0;
        int mujeres = 0;
        for (int i = 0; i < nroPasajeros; i++) {
            String genero = pasajeros[i].getGenero().toLowerCase();
            if (genero.startsWith("f") || genero.contains("fem")) {
                mujeres++;
            } else {
                hombres++;
            }
        }
        System.out.println("Hombres: " + hombres);
        System.out.println("Mujeres: " + mujeres);
    }

    public int getCantidadPasajeros() {
        return nroPasajeros;
    }
}

