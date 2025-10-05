public class Auto extends Vehiculo{
    private int caballosFuerza;
    private boolean descapotable;
    private String auto;
    public Auto(String conductor, String placa, int id, int caballosFuerza, boolean descapotable){
        super(conductor, placa, id);
        this.caballosFuerza=caballosFuerza;
        this.descapotable=descapotable;
        this.auto="auto";
    }

    @Override
    public String toString() {
        return "[ El vehiculo es: "+this.auto+super.toString();
    }
}
