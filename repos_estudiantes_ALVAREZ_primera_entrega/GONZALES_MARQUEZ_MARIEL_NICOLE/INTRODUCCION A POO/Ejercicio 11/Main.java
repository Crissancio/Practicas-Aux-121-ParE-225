public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Café Latte", 15.5);
        Pedido pedido1 = new Pedido(101, "Registrado");

        producto1.mostrar();
        pedido1.mostrar();

        producto1.cerrar();
        pedido1.cerrar();
    }
}
