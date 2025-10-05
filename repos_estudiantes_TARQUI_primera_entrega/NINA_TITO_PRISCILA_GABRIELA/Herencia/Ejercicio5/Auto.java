package PRACTICA1AUXILIATURA.Herencia.Ejercicio5;

public class Auto extends Vehiculo {
    private int caballosDeFuerza;
    private boolean descapotable;

    public Auto(String conductor, String placa, int id, int caballosDeFuerza, boolean descapotable) {
        super(conductor, placa, id);
        this.caballosDeFuerza = caballosDeFuerza;
        this.descapotable = descapotable;
    }
    public void mostrar(){
        System.out.println("Conductor: " + getConductor() + ", Placa: " + getPlaca() + ", ID: " + getId() + ", Caballos de Fuerza: " + caballosDeFuerza + ", Descapotable: " + descapotable);
    }

}
