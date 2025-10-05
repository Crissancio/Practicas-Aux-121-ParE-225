public class Main{
    public static void main(String[] args) {
        Producto p1= new Producto("chocolate", 20.50,12);

        p1.vender(3);
        p1.vender(13);
        p1.reabastecer(30);

    }
}