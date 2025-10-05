package Ejercicio11;
//a) Encontrar 2 clases con 2 atributos significativos.
public class Pedido {
	public String[] productos;
	public String estado="registrado";
	//b) Implementar las dos clases encontradas con constructor, destructor, getters/setters.
	public Pedido(String[] productos) {
		this.productos=productos;
	}
	public String[] getProductos() {
		return productos;
	}
	public void setEstado(String estado) {
		this.estado=estado;
	}
	public void cancelar() {
		System.out.println("Este pedido ha sido cancelado");
		this.estado=null;
		this.productos=null;
	}
	public String toString() {
		if (this.productos==null) {
			return String.format("El pedido es (%s) y esta (%s)",this.productos,this.estado);
		}else {
			String s="";
			for(int i=0;i<this.productos.length;i++) {
				s+=" "+this.productos[i];
			}
			return String.format("El pedido es (%s) y esta (%s)",s,this.estado);
		}
	}
	
}
