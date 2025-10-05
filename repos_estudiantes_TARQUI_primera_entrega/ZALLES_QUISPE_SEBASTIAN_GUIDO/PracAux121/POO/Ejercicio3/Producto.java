import java.util.Scanner;

public class Producto {
    public String nombre;
    public double precio;
    public int stock;

    public Producto( String nombre, double precio, int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }
    public void vender() {
        int cantidad;
        Scanner lee=new Scanner(System.in);
        System.out.println( "[ Ingrese la cantidad vendida: ]");
        cantidad= lee.nextInt();
        if(cantidad>this.stock || cantidad<0){
            System.out.println("[ Error de productos vendidos, ingrese de nuevo la cantidad vendida: ]");
            do {
                cantidad= lee.nextInt();
            }while (cantidad>this.stock || cantidad<0);
            this.stock=this.stock-cantidad;
        }
        else {
            this.stock=this.stock-cantidad;
        }
        System.out.println("[ la cantidad vendida es : "+cantidad+", el cobro total es: "+cantidad*this.precio+" bs, el stock actual es: "+this.stock+" ]");

    }
    public void reabastecer(){
        int cantidad;
        Scanner lee=new Scanner(System.in);
        System.out.println( "[ Ingrese la cantidad reabastecida: ]");
        cantidad= lee.nextInt();
        if(cantidad<0){
            System.out.println("[ Error de productos reabastecidos, ingrese de nuevo la cantidad reabastecida: ]");
            do {
                cantidad= lee.nextInt();
            }while (cantidad>this.stock || cantidad<0);
            this.stock=this.stock+cantidad;
        }
        else {
            this.stock=this.stock+cantidad;
        }
        System.out.println("[ El stock reabastecido es: "+this.stock+" ]");
    }

    @Override
    public String toString() {
        return "[ El producto es: "+this.nombre+ ", su precio es: "+ this.precio+" bs , el stock actual es :"+ this.stock +" ]";
    }

    public static void main(String[] args){
        Producto producto=new Producto("Manzana", 1, 10);
        System.out.println(producto);
        producto.vender();
        producto.reabastecer();
        System.out.println(producto);
    }
}
