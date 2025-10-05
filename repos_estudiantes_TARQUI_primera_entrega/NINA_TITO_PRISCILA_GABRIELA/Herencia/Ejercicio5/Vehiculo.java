package PRACTICA1AUXILIATURA.Herencia.Ejercicio5;
//DIAGRAMA UML YA HECHO EN EL PDF DE LA PRACTICA
public abstract class Vehiculo {
    private String conductor;
    private String placa;
    private int id;

    public Vehiculo(String conductor, String placa, int id) {
        this.conductor = conductor;
        this.placa = placa;
        this.id = id;
    }
    public String getConductor() {
        return conductor;
    }
    public String getPlaca() {
        return placa;
    }
    public int getId() {
        return id;
    }
    public void setConductor(String conductor) {
        this.conductor = conductor;
    }
}
