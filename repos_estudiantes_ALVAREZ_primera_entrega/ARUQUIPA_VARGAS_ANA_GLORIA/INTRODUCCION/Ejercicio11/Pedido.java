package Ejercicio11;
import java.util.List;
public class Pedido {
    private String estado;
    private List<String> productos;

    public Pedido(String estado, List<String> productos) {
        this.estado = estado;
        this.productos = productos;
        System.out.println("Pedido creado con estado '" + estado + "'.");
    }    public String getEstado() {
        return estado;
    }

    public List<String> getProductos() {
        return productos;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }

    public void eliminar() {
        System.out.println("Pedido eliminado.");
    }

    @Override
    public String toString() {
        return "Pedido(estado=" + estado + ", productos=" + productos + ")";
    }
}
