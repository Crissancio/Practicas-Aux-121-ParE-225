package Ejercicio11;

public class Pedido {

    private int idPedido;
    private String estado;

    public Pedido(int idPedido, String estado) {
        this.idPedido = idPedido;
        this.estado = estado;
    }

    // Destructor simulado
    protected void finalize() throws Throwable {
        System.out.println("El pedido #" + idPedido + " ha sido eliminado del sistema.");
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarInfo() {
        System.out.println("Pedido #" + idPedido + " | Estado: " + estado);
    }
}
