package Ejercicio3;

public class Producto {
	//Ejercicio 3. Diseña una clase Producto que tenga atributos nombre, precio y stock. Agrega métodos para vender productos y reabastecer el stock.
	
	public String nombre;
	public double precio;
	public int stock;
	//a) Define la clase y los atributos.
	public Producto(String nombre,double precio,int stock){
		this.nombre=nombre;
		this.precio=precio;
		this.stock=stock;
	}
	//b) Agrega un método vender(cantidad: Int) que reste del stock
	public void vender(int cantidad) {
		if (cantidad>this.stock) {
			System.out.println("no hay suficiente cantidad del producto");
		}else {
			System.out.println("Se cobro: "+cantidad*this.precio);
			this.stock-=cantidad;
		}
	}
	//c) Agrega un método reabastecer(cantidad: Int) que sume al stock.
	public void reabastecer(int cantidad) {
		this.stock+=cantidad;
	}
}
