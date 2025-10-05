public class Crucero {
    private String nombre;
    private String paisOrigen;
    private String paisDestino;
    private int nroPasajeros;
    private Pasajero[] pasajeros = new Pasajero[100];
    private double[] costos = new double[100];

    public Crucero() {
        this.nombre = "";
        this.paisOrigen = "";
        this.paisDestino = "";
        this.nroPasajeros = 0;
    }

    public Crucero(String nombre, String paisOrigen, String paisDestino) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.paisDestino = paisDestino;
        this.nroPasajeros = 0;
    }

    public void adicionar(Pasajero p, double costo) {
        if (nroPasajeros < 100) {
            pasajeros[nroPasajeros] = p;
            costos[nroPasajeros] = costo;
            nroPasajeros++;
        }
    }

    public void inc() {
        System.out.println("Crucero " + nombre + ": listo para registrar pasajeros.");
    }

    public void dec() {
        System.out.println("Crucero " + nombre + ": lista de pasajeros");
        for (int i = 0; i < nroPasajeros; i++) {
            System.out.println(" - " + pasajeros[i] + " | Costo: " + costos[i]);
        }
    }

    public void igualA(Crucero c) {
        double total = 0;
        for (int i = 0; i < nroPasajeros; i++) {
            total += costos[i];
        }
        System.out.println("Suma total de pasajes del crucero " + nombre + ": " + total);
    }

    public void comparar(Crucero c) {
        if (this.nroPasajeros == c.nroPasajeros)
            System.out.println("Ambos cruceros tienen la misma cantidad de pasajeros");
        else
            System.out.println("Los cruceros tienen diferente cantidad de pasajeros");
    }

    public void contarGenero() {
        int hombres = 0, mujeres = 0;
        for (int i = 0; i < nroPasajeros; i++) {
            if (pasajeros[i].getGenero().equalsIgnoreCase("masculino"))
                hombres++;
            else if (pasajeros[i].getGenero().equalsIgnoreCase("femenino"))
                mujeres++;
        }
        System.out.println("Crucero " + nombre + " → Hombres: " + hombres + ", Mujeres: " + mujeres);
    }
}
