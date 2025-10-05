public class Cliente extends Persona{
    public String nroCompra;
    public String idCliente;
    public Cliente(String nombre, String apellido, String ci, String nroCompra, String idCliente){
        super(nombre, apellido, ci);
        this.nroCompra=nroCompra;
        this.idCliente=idCliente;
    }

    public String getNroCompra() {
        return nroCompra;
    }

    public void setNroCompra(String nroCompra) {
        this.nroCompra = nroCompra;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public void method() {
        System.out.println("[ Metodo de la clase Cliente = nombre: "+nombre+", apellido: "+apellido+", ci: "+ci+", numero de compra: "+this.nroCompra+", id cliente: "+this.idCliente+" ]");
    }
}
