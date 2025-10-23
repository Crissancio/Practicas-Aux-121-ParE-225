public class Main {
        public static void main(String[] args) {
                Mascota m1= new Mascota("whiskers", "gato", 50);
                Mascota m2= new Mascota("silvestre", "gato", 40);

                m1.mostrarEnergia();
                m2.mostrarEnergia();
                m1.alimentar();
                m2.alimentar();
                m1.jugar();
                m2.jugar();

        }
}
