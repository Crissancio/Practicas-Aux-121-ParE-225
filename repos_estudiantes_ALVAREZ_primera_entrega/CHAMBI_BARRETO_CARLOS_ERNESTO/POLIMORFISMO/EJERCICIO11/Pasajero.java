package POLIMORFISMO.EJERCICIO11;

public class Pasajero {
    public String nombre, genero;
    public int edad, nroHabitacion;
    public double costoPasaje;

    public Pasajero(String nombre, String genero, int nroHabitacion, double costoPasaje, int edad){
        this.nombre=nombre;
        this.genero=genero;
        this.edad=edad;
        this.nroHabitacion=nroHabitacion;
        this.costoPasaje=costoPasaje;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getNroHabitacion() {
        return nroHabitacion;
    }
    public double getCostoPasaje(){
        return costoPasaje;
    }
    //leer datos
    public void leerDatos(){
        System.out.println("Leyendo datos del pasajero----");
    }
    //mostrar datos
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Genero: " + genero + ", Habitación: " + nroHabitacion + ", Costo: " + costoPasaje);
    }
}
