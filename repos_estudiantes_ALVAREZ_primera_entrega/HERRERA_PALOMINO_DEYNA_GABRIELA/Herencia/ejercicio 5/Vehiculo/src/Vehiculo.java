public class Vehiculo {
    protected String conductor;
    protected String placa;
    protected int id;

    public Vehiculo(String conductor, String placa, int id) {
        this.conductor = conductor;
        this.placa = placa;
        this.id = id;
    }

    public void mostrarInfo() {
        System.out.println("Conductor: " + conductor + " | Placa: " + placa);
    }

    public void cambiarConductor(String nuevoConductor) {
        this.conductor = nuevoConductor;
        System.out.println("El nuevo conductor del vehículo con placa " + placa + " es " + nuevoConductor);
    }
}
