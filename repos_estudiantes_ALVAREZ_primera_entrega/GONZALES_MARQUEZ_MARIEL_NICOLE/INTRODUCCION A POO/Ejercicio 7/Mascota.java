public class Mascota {
    private String nombre;
    private String tipo;
    private int energia;

    public Mascota(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = 50;
    }

    public void alimentar() {
        energia += 20;
        if (energia > 100) {
            energia = 100;
        }
        System.out.println(nombre + " fue alimentada. Energía: " + energia);
    }

    public void jugar() {
        energia -= 15;
        if (energia < 0) {
            energia = 0;
        }
        System.out.println(nombre + " jugó. Energía: " + energia);
    }

    public void mostrarEnergia() {
        System.out.println(nombre + " (" + tipo + ") tiene energía: " + energia);
    }
}
