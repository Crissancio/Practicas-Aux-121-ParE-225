public class Moto extends Vehiculo{
    private int cilindrada;
    private boolean casco;
    private String moto;
    public Moto(String conductor, String placa, int id, int cilindrada, boolean casco){
        super(conductor, placa, id);
        this.cilindrada=cilindrada;
        this.casco=casco;
        this.moto="moto";
    }
    public String toString() {
        return "[ El vehiculo es: "+this.moto+super.toString();
    }
}
