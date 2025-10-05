package INTRODUCCION_A_POO.EJERCICIO11;

public class Pedido {
    public String producto;
    public String estado;

    public Pedido(String producto, String estado){
        this.producto=producto;
        this.estado=estado;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Pedido eliminado: " + producto);
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
