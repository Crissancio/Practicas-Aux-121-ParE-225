public class Bus extends Vehiculo{
    private int capacidad;
    private String sindicato;
    private String bus;
    public Bus(String conductor, String placa, int id, int capacidad, String sindicato){
        super(conductor, placa, id);
        this.capacidad=capacidad;
        this.sindicato=sindicato;
        this.bus="Bus";
    }
    public String toString() {
        return "[ El vehiculo es: "+this.bus+super.toString();
    }

}
