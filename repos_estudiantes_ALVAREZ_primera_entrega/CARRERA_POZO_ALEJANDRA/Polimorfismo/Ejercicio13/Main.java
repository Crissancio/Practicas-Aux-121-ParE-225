package Polimorfismo.Ejercicio13;

public class Main {
    public static void main(String[] args) {
        MP4 m = new MP4("Sony", 5.0);
        m.agregarCancion("Back To Black", "Amy Winehouse", 100);
        m.agregarCancion("Lost On You", "LP", 150);
        m.agregarVideo("Heathens", "Twenty One Pilots", 50);
        m.mostrar();
        m.mostrarCapacidad();
        m.borrar("Lost On You");
        m.mostrarCapacidad();
    }
}
