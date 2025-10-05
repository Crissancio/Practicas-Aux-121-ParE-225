package Practica_2;

public class Main {
    public static void main(String[] args) {
        Vector3D a = new Vector3D(3, 4, 0);
        Vector3D b = new Vector3D(4, 0, 0);

        System.out.println("Vector a: " + a);
        System.out.println("Vector b: " + b);

        System.out.println("Suma: " + a.operar(b));
        System.out.println("Resta: " + a.operarResta(b));
        System.out.println("Escalar (2) * a: " + a.operar(2));

        System.out.println("Módulo de a: " + a.modulo());
        System.out.println("Vector normal a: " + a.normal());

        System.out.println("Producto escalar a·b: " + a.productoEscalar(b));
        System.out.println("Producto cruz a×b: " + a.productoCruz(b));

        System.out.println("Proyección de a sobre b: " + a.proyeccionSobre(b));
        System.out.println("Componente de a en dirección de b: " + a.componenteEn(b));
    }
}
