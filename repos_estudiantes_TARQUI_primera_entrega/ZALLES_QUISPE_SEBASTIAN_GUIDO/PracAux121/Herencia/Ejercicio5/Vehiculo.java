public class Vehiculo {
    protected String conductor;
    protected String placa;
    protected int id;

    public Vehiculo(String conductor, String placa, int id){
        this.conductor=conductor;
        this.placa=placa;
        this.id=id;
    }
    public void cambiarConductor(String conductor){
        this.conductor=conductor;
        System.out.println("[ Cambiando conductor... El nuevo conductor es: "+this.conductor);
    }

    @Override
    public String toString() {
        return ", la placa es: "+this.placa+" y el conductor es: "+this.conductor+" ]";
    }
}
