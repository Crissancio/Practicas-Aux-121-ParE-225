package POLIMORFISMO.EJERCICIO5;

public class Main {
    public static void main(String[] args) {
        Celelar c1 = new Celelar("Whatsapp", "Donovan", 2, 50, 40);
        System.out.println("EL NORMAL xd /////////////////////////");
        c1.mostrar();
        c1.Incrementar();
        c1.Disminuir();
        System.out.println("LUEGO");
        c1.mostrar();
    }

}
