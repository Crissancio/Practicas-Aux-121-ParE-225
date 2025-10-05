public class Pedido {
    private int numero;
    private String estado;

    public Pedido(int numero, String estado) {
        this.numero = numero;
        this.estado = estado;
        System.out.println("Pedido N°" + numero + " creado.");
    }

    public void cerrar() {
        System.out.println("Pedido N°" + numero + " eliminado de memoria.");
    }

    public int getNumero() {
        return numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrar() {
        System.out.println("Pedido N°" + numero + " - Estado: " + estado);
    }
}
