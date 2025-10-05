package PRACTICA1AUXILIATURA.Polimorfismo.Ejercicio11;

public class Crucero {
    private String nombre;
    private String paisOrigen;
    private String paisDestino;
    private int nroPasajeros;
    private Pasajero[] pasajeros;

    public Crucero(String nombre, String paisOrigen, String paisDestino, int nroPasajeros) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.paisDestino = paisDestino;
        this.nroPasajeros = nroPasajeros;
        this.pasajeros = new Pasajero[nroPasajeros];
    }

    public void setPasajero(int i, Pasajero p) {
        if (i < nroPasajeros) {
            pasajeros[i] = p;
        }
    }

    public Crucero incrementar() {
        System.out.println("Datos del crucero:");
        System.out.println("Nombre: " + nombre + ", Origen: " + paisOrigen + ", Destino: " + paisDestino);
        return this;
    }

    public void decrementar() {
        System.out.println("Mostrando crucero: " + nombre);
    }

    public int totalCostoPasajes(int[] costos) {
        int suma = 0;
        for (int c : costos) suma += c;
        return suma;
    }

    public static String compararPasajeros(Crucero c1, Crucero c2) {
        if (c1.nroPasajeros > c2.nroPasajeros)
            return c1.nombre + " tiene más pasajeros";
        else if (c2.nroPasajeros > c1.nroPasajeros)
            return c2.nombre + " tiene más pasajeros";
        else
            return "Ambos cruceros tienen la misma cantidad de pasajeros";
    }

    public void contarGenero() {
        int hombres = 0, mujeres = 0;
        for (Pasajero p : pasajeros) {
            if (p != null) {
                if (p.getGenero().equalsIgnoreCase("M")) hombres++;
                else mujeres++;
            }
        }
        System.out.println("Hombres: " + hombres + ", Mujeres: " + mujeres);
    }
}
