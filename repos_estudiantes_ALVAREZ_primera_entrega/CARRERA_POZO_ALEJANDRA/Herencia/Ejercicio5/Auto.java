package Herencia.Ejercicio5;

// Subclase Auto
class Auto extends Vehiculo {
    protected int caballosFuerza;
    protected boolean descapotable;

    public Auto(String conductor, String placa, int id, int caballosFuerza, boolean descapotable) {
        super(conductor, placa, id);
        this.caballosFuerza = caballosFuerza;
        this.descapotable = descapotable;
    }
}