public class Fruta {
    private String nombre;
    private String tipo;
    private int nroVitaminas;
    private String[] vitaminas;

    public Fruta(String nombre, String tipo, String[] vitaminas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nroVitaminas = vitaminas.length;
        this.vitaminas = vitaminas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNroVitaminas() {
        return nroVitaminas;
    }

    public String[] getVitaminas() {
        return vitaminas;
    }
}
