package INTRODUCCION_A_POO.EJERCICIO7;

public class Main {
    public static void main(String[] args){
        Mascota perro = new Mascota("Calzosky", "Perro",  50);
        Mascota gato = new Mascota("Gateto", "gato ", 90);
        System.out.println("Mascota 1");
        perro.alimentar();//20+50=70 xd
        perro.jugar(); // -15+70= 55
        System.out.println("Mascota 2 ");
        gato.alimentar();
        gato.jugar();
    }
}
