
import java.util.ArrayList;

public class Buzon {
    private int nro;
    private int nroC;
    private ArrayList<Carta> cartas;

    public Buzon(int nro) {
        this.nro = nro;
        this.nroC = 0;
        this.cartas = new ArrayList<>();
    }

    public void agregarCarta(Carta c) {
        cartas.add(c);
        nroC++;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void eliminarCarta(String codigo) {
        cartas.removeIf(c -> c.getCodigo().equalsIgnoreCase(codigo));
        nroC = cartas.size();
    }

    public int getNro() {
        return nro;
    }

    public int getNroC() {
        return nroC;
    }
}
