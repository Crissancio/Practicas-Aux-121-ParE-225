package PRACTICA1AUXILIATURA.Herencia.Ejercicio5;

public class Moto extends Vehiculo {
    private int cilindrada;
    private boolean casco;

    public Moto(String conductor, String placa, int id, int cilindrada, boolean casco) {
        super(conductor, placa, id);
        this.cilindrada = cilindrada;
        this.casco = casco;
    }
    public void mostrar(){
        System.out.println("Conductor: " + getConductor() + ", Placa: " + getPlaca() + ", ID: " + getId() + ", Cilindrada: " + cilindrada + ", Casco: " + casco);
    }
}