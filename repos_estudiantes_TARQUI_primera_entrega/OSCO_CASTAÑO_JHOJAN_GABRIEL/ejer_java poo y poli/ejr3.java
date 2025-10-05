package prac1_prog2;

public class ejr3 {
	    public static void main(String[] args) {
	        Producto p1 = new Producto("Arroz", 20, 50);
	        p1.mostrarDatos();
	        p1.vender(10);
	        p1.reabastecer(30);
	        p1.mostrarDatos();
	    }
	}
	class Producto {
	    private String nombre;
	    private double precio;
	    private int stock;

	    public Producto(String nombre, double precio, int stock) {
	        this.nombre = nombre;
	        this.precio = precio;
	        this.stock = stock;
	    }
	    public void vender(int cantidad) {
	        if (cantidad <= stock) {
	            stock -= cantidad;
	            System.out.println("Venta realizada: " + cantidad + " unidades.");
	        } else {
	            System.out.println("Stock insuficiente.");
	        }
	    }
	    public void reabastecer(int cantidad) {
	        stock += cantidad;
	        System.out.println("Se reabasteció con " + cantidad + " unidades.");
	    }
	    public void mostrarDatos() {
	        System.out.println("Producto: " + nombre + " | Precio: " + precio + " | Stock: " + stock);
	    }
	}

