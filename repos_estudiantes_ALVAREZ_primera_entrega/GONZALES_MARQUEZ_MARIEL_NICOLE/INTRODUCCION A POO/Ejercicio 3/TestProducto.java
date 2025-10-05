public class TestProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto("Galletas", 2.5, 50);

        p1.mostrarInfo();

        p1.vender(20);
        p1.mostrarInfo();

        p1.reabastecer(15);
        p1.mostrarInfo();
    }
}