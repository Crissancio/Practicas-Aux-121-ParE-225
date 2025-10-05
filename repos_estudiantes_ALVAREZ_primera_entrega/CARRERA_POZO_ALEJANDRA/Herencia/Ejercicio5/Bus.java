package Herencia.Ejercicio5;

class Bus extends Vehiculo {
    protected int capacidad;
    protected String sindicato;

    public Bus(String conductor, String placa, int id, int capacidad, String sindicato) {
        super(conductor, placa, id);
        this.capacidad = capacidad;
        this.sindicato = sindicato;
    }
}