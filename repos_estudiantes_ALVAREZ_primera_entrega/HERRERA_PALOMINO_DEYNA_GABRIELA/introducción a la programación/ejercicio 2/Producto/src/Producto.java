public class Producto{
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }
    public void vender(int cantidad){
        if (cantidad<=stock){
            stock-=cantidad;
            double total=cantidad*precio;
            System.out.println("producto vendido:"+nombre+" cantidad: "+cantidad);
            System.out.println("Total bs="+total);
        }
        else{
            System.out.println("No hay suficiente stock");
        }
    }
    public void reabastecer(int cantidad){
        stock+=cantidad;
        System.out.println("Se reabastecio"+" "+cantidad+" unidades de "+nombre);
    }
}   
