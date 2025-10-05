package prac1_prog2;

public class ejr11 {
	    public static void main(String[] args) {
	        Cliente c1 = new Cliente("Maria", 5);
	        Pedido p1 = new Pedido("Café latte", "Preparado");
	        c1.mostrar();
	        p1.mostrar();
	        c1.setNombre("Carlos");      
	        p1.setEstado("Entregado");   

	        System.out.println("\nDespués de cambios:");
	        c1.mostrar();
	        p1.mostrar();
	    }
	}

	class Cliente {
	    private String nombre;
	    private int mesa;
	
	    public Cliente(String nombre, int mesa) {
	        this.nombre = nombre;
	        this.mesa = mesa;
	    }

	    public String getNombre() { return nombre; }
	    public void setNombre(String nombre) { this.nombre = nombre; }

	    public int getMesa() { return mesa; }
	    public void setMesa(int mesa) { this.mesa = mesa; }

	    public void mostrar() {
	        System.out.println("Cliente: " + nombre + " | Mesa: " + mesa);
	    }
	}

	class Pedido {
	    private String producto;
	    private String estado;

	    public Pedido(String producto, String estado) {
	        this.producto = producto;
	        this.estado = estado;
	    }

	    public String getProducto() { return producto; }
	    public void setProducto(String producto) { this.producto = producto; }

	    public String getEstado() { return estado; }
	    public void setEstado(String estado) { this.estado = estado; }

	    public void mostrar() {
	        System.out.println("Producto: " + producto + " | Estado: " + estado);
	    }
	}



