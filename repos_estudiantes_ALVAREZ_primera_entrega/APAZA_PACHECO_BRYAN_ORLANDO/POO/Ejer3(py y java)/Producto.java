public class Producto {
    // a)
    private String nombre;
    private double precio;
    private int stock;

    // a) 
    public Producto(String nombre,double precio,int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }

    // b) 
    public void vender(int cantidad){
        if(cantidad<=stock){
            stock-=cantidad;
        } else {
            System.out.println("Stock insuficiente");
        }
    }

    // c)
    public void reabastecer(int cantidad){
        stock+=cantidad;
    }

    // d) 
    public static void main(String[] args){
        Producto prod=new Producto("Piñas",3.5,30); // d)
        System.out.println("actualmente tienes "+prod.nombre+" "+prod.stock);
        prod.vender(10); // b)
        System.out.println("vendiendoo X "+prod.nombre+". . . ");
        System.out.println("Stock ahora: "+prod.stock);
        prod.reabastecer(20); // c)
        System.out.println("reabasteciendo....");
        System.out.println("Stock actual: "+prod.stock);
    }
}
