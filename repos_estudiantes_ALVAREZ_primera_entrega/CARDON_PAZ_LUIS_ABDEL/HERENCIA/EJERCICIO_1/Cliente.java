package HERENCIA.EJERCICIO_1;

public class Cliente extends Persona {
    private String nroCompra;
    private String idCliente;
    
    public Cliente(String nombre, String apellido, String ci, String nroCompra, String idCliente) {
        super(nombre, apellido, ci);
        this.nroCompra = nroCompra;
        this.idCliente = idCliente;
    }
    
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ID Cliente: " + idCliente + " | Nro Compra: " + nroCompra);
    }
    
    public String getNroCompra() { 
        return nroCompra; 
    }

    public String getIdCliente() { 
        return idCliente; 
    }
}