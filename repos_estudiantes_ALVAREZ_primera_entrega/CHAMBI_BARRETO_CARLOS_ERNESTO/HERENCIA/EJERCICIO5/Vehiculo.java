package HERENCIA.EJERCICIO5;

public class Vehiculo {
    public String conductor, placa;
    public int id;

    public Vehiculo(String conductor, String placa, int id) {
        this.conductor = conductor;
        this.placa = placa;
        this.id = id;
    }

    public void mostrarDatos(){
        System.out.println("Conductor: " + conductor);
        System.out.println("La placa " + placa);
        System.out.println("ID " + id);
    }

    public void cambiarConductor(String nuevoConductor){
        this.conductor = nuevoConductor;
        System.out.println("C chofer cambiado por: " + nuevoConductor);

    }
}
