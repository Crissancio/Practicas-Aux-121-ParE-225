package Ejercicio7Py_Java;

public class Mascota {
    private String nombre;
    private String tipo;
    private int energia;

    public Mascota(String nombre, String tipo, int energia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = energia;
    }

    public void alimentar() {
        int energiaAntes = energia;
        energia = Math.min(energia + 20, 100);
        System.out.println(nombre + " fue alimentado. Energía: " + energiaAntes + "," + energia);
    }

    public void jugar() {
        int energiaAntes = energia;
        energia = Math.max(energia - 15, 0);
        System.out.println(nombre + " jugó. Energía: " + energiaAntes + " , " + energia);
    }

    public void mostrarEnergia() {
        System.out.println("Energía de " + nombre + ": " + energia);
    }
    public void mostrarDatos() {
    System.out.println("Nombre: " + nombre + ", Tipo: " + tipo + ", Energía: " + energia);
}

}
