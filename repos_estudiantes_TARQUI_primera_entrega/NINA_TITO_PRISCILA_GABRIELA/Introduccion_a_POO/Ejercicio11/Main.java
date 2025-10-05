package PRACTICA1AUXILIATURA.Introduccion_a_POO.Ejercicio11;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();
        productos.add("Café");
        productos.add("Pastel");
        Pedido pedido1 = new Pedido(productos, "Registrado");

        System.out.println("Pedido: " + pedido1.getProductos() + ", Estado: " + pedido1.getEstado());

        Cliente cliente1 = new Cliente("Gabriela", pedido1.getProductos());

        System.out.println("Cliente: " + cliente1.getNombre() + ", Pedido: " + cliente1.getPedido());
    }
}
