public class Cliente extends Persona {
    private String nroCompra;
    private String idCliente;

    public Cliente(String nombre, String apellido, String ci, String nroCompra, String idCliente) {
        super(nombre, apellido, ci);
        this.nroCompra = nroCompra;
        this.idCliente = idCliente;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Nro de compra: " + nroCompra);
        System.out.println("ID de cliente: " + idCliente);
    }
}
