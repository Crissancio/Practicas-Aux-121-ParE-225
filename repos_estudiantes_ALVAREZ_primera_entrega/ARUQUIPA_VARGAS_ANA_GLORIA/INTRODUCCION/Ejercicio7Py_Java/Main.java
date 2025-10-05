package Ejercicio7Py_Java;

public class Main {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Roco", "Perro", 90);
        Mascota mascota2 = new Mascota("Akira", "Gato", 45);

        mascota1.mostrarEnergia();
        mascota2.mostrarEnergia();

        System.out.println("\n  Alimentando");
        mascota1.alimentar();
        mascota2.alimentar();

        System.out.println("\n Jugando");
        mascota1.jugar();
        mascota2.jugar();

        System.out.println("\n Energía final");
        mascota1.mostrarEnergia();
        mascota2.mostrarEnergia();
        mascota1.mostrarDatos();
        mascota2.mostrarDatos();

    }
}

