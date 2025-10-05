package Ejercicio7;

public class Main {
    public static void main(String[] args) {

        Mascota perro = new Mascota("Firulais", "Perro", 60);
        Mascota gato = new Mascota("Mishi", "Gato", 45);

        perro.alimentar();
        gato.alimentar();

        perro.jugar();
        gato.jugar();

    }
}