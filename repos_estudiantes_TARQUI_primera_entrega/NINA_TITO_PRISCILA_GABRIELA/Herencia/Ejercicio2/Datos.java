package PRACTICA1AUXILIATURA.Herencia.Ejercicio2;
//DIAGRAMA UML YA HECHO EN EL PDF DE LA PRACTICA
public abstract class Datos {
    private String nombre;
    private int carnet;

    public Datos(String nombre, int carnet){
        this.nombre = nombre;
        this.carnet = carnet;
    }
    public String getNombre(){
        return this.nombre;
    }
    @Override
    public String toString(){
        return ("Nombre: " + nombre + ", Carnet: " + carnet);
    }
}
//https://sites.google.com/view/sitiojuanito25/turismo