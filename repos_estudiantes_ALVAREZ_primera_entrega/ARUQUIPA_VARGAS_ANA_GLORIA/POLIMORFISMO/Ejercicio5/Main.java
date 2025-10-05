package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Celular cel = new Celular("123456789", "Ana Torres", 64.0f, 6, 25);

        System.out.println("DATOS INICIALES:");
        cel.mostrarDatos();

        System.out.println("\nAplicando '++' (incrementar nroApp):");
        cel.incrementar();

        System.out.println("\nAplicando '--' (disminuir espacio):");
        cel.decrementar();

        System.out.println("\nDATOS FINALES:");
        cel.mostrarDatos();
    }
}
