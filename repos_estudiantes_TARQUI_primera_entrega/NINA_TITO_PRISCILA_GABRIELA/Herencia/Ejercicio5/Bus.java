package PRACTICA1AUXILIATURA.Herencia.Ejercicio5;

public class Bus extends Vehiculo {
    public int capacidad;
    public String sindicato;

    public Bus(String conductor, String placa, int id, int capacidad, String sindicato) {
        super(conductor, placa, id);
        this.capacidad = capacidad;
        this.sindicato = sindicato;
    }
    public void mostrar(){
        System.out.println("Conductor: " + getConductor() + ", Placa: " + getPlaca() + ", ID: " + getId() + ", Capacidad: " + capacidad + ", Sindicato: " + sindicato);
    }

}
