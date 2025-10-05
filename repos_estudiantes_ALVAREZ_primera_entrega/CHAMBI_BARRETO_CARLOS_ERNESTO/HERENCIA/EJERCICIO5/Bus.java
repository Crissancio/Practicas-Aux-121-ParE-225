package HERENCIA.EJERCICIO5;

public class Bus extends Vehiculo{
    public int capacidad;
    public String sindicato;
    public Bus(String conductor, String placa, int id, int capacidad, String sindicato){
        super(conductor, placa, id);
        this.capacidad=capacidad;
        this.sindicato=sindicato;
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Sindicato: "+ sindicato);
    }
}
