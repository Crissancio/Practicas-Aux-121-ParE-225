public class Crucero {
    private String nombre;
    private String paisOrigen;
    private String paisDestino;
    private int nroPasajeros;
    private Pasajero[] pasajeros;

    public Crucero(String nombre, String paisOrigen, String paisDestino) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.paisDestino = paisDestino;
        this.pasajeros = new Pasajero[100];
        this.nroPasajeros = 0;
    }

    public void incrementar(Pasajero p) {
        if (nroPasajeros < pasajeros.length) {
            pasajeros[nroPasajeros] = p;
            nroPasajeros++;
        } else {
            System.out.println("Crucero lleno.");
        }
    }

    public void decrementar() {
        System.out.println("\nCrucero: " + nombre + " (" + paisOrigen + " → " + paisDestino + ")");
        for (int i = 0; i < nroPasajeros; i++) {
            pasajeros[i].decrementar();
        }
    }

    public double esIgual() {
        double total = 0;
        for (int i = 0; i < nroPasajeros; i++) {
            total += pasajeros[i].getCostoPasaje();
        }
        System.out.println("Suma total de pasajes en " + nombre + ": $" + total);
        return total;
    }

    public void compararCruceros(Crucero otro) {
        if (this.nroPasajeros == otro.nroPasajeros) {
            System.out.println("Ambos cruceros tienen la misma cantidad de pasajeros (" + nroPasajeros + ").");
        } else {
            System.out.println("Diferencia de pasajeros: " +
                Math.abs(this.nroPasajeros - otro.nroPasajeros));
        }
    }

    public void contarGenero() {
        int hombres = 0, mujeres = 0;
        for (int i = 0; i < nroPasajeros; i++) {
            if (pasajeros[i].getGenero().equalsIgnoreCase("M")) {
                hombres++;
            } else if (pasajeros[i].getGenero().equalsIgnoreCase("F")) {
                mujeres++;
            }
        }
        System.out.println("Crucero " + nombre + " → Hombres: " + hombres + ", Mujeres: " + mujeres);
    }
}
