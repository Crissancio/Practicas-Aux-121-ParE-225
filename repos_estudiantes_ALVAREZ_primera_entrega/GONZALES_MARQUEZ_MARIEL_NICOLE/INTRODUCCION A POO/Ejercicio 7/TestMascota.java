public class TestMascota {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Sparky", "Perro");
        Mascota m2 = new Mascota("Oreo", "Gato");

        m1.mostrarEnergia();
        m2.mostrarEnergia();

        m1.alimentar();
        m2.alimentar();

        m1.jugar();
        m2.jugar();

        m1.mostrarEnergia();
        m2.mostrarEnergia();
    }
}
