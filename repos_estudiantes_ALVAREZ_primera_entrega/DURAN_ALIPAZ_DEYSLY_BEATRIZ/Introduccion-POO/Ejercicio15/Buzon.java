package Ejercicio15;


import java.util.ArrayList;
import java.util.List;

class Buzon {
    private int nro;
    private List<Carta> cartas;

    public Buzon(int nro) {
        this.nro = nro;
        this.cartas = new ArrayList<>();
    }

    public void agregarCarta(Carta c) {
        cartas.add(c);
    }

    public void eliminarCartaPorCodigo(String codigo) {
        cartas.removeIf(c -> c.getCodigo().equalsIgnoreCase(codigo));
    }

    public int contarCartasPorDestinatario(String destinatario) {
        int count = 0;
        for (Carta c : cartas) {
            if (c.getDestinatario().equalsIgnoreCase(destinatario)) count++;
        }
        return count;
    }

    public boolean remitenteHaEnviado(String remitente) {
        for (Carta c : cartas) {
            if (c.getRemitente().equalsIgnoreCase(remitente)) return true;
        }
        return false;
    }

    public void buscarPorPalabraClave(String palabra) {
        for (Carta c : cartas) {
            if (c.getDescripcion().toLowerCase().contains(palabra.toLowerCase())) {
                System.out.println("Coincidencia → Código: " + c.getCodigo()
                        + ", Remitente: " + c.getRemitente()
                        + ", Destinatario: " + c.getDestinatario());
            }
        }
    }

    public void mostrarCartas() {
        System.out.println("Buzón " + nro + ":");
        for (Carta c : cartas) {
            System.out.println("  " + c);
        }
    }
}
