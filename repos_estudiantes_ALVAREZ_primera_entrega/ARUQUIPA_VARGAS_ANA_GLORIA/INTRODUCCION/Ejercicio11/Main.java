package Ejercicio11;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Mario", 5);
        Pedido pedido1 = new Pedido("registrado", Arrays.asList("Api", "Pastel"));

        System.out.println(cliente1);
        System.out.println(pedido1);
        cliente1.eliminar();
        pedido1.eliminar();
    }
}
