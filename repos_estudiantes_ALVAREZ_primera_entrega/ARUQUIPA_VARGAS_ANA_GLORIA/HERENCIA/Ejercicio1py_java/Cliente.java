public class Cliente extends Persona {
    private String nroCompra;
    private String idCliente;

    public Cliente(String nombre, String apellido, String ci, String nroCompra, String idCliente) {
        super(nombre, apellido, ci);
        this.nroCompra = nroCompra;
        this.idCliente = idCliente;
    }

    public void mostrarDatos() {
        System.out.println("Cliente: " + nombre + " " + apellido + ", CI: " + ci +
                           ", Nº Compra: " + nroCompra + ", ID Cliente: " + idCliente);
                           
    }
}
