public class Main {
    public static void main(String[] args) {
        Producto pr1=new Producto("Capuccino", 15.50);
        Pedido p=new Pedido("entregado", true, "noche");

        System.out.println(pr1);
        System.out.println(p);
    }
    
}
