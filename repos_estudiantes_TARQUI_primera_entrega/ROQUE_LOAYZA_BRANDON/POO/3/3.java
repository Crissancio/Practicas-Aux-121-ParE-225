public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public boolean vender(int cantidad){
        if(cantidad <= 0) return false;
        if(cantidad > stock) return false;
        stock -= cantidad;
        return true;
    }
    public boolean reabastecer(int cantidad){
        if(cantidad > 0){
            stock += cantidad;
            return true;
        }
        return false;
    }
    public int getStock(){ return stock; }
    public static void main(String[] args){
        Producto p = new Producto("Jugo",5.0,10);
        System.out.println(p.vender(3) + " " + p.getStock());
        System.out.println(p.reabastecer(5) + " " + p.getStock());
        System.out.println(p.vender(20) + " " + p.getStock());
    }
}
