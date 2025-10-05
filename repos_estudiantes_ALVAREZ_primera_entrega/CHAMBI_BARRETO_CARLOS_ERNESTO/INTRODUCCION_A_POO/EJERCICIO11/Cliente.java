package INTRODUCCION_A_POO.EJERCICIO11;

public class Cliente {
    public String nombre;
    public int mesa;

    public Cliente(String nombre, int mesa){
        this.nombre=nombre;
        this.mesa=mesa;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Cliente eliminado: " + nombre);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getMesa() {
        return mesa;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }
}
