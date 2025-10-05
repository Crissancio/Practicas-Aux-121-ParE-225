package Practica_1;


public class MainCuadratica {
    public static void main(String[] args) {
        // Ejemplo 1
        EcuacionCuadratica eq1 = new EcuacionCuadratica(1.0, 3, 1);
        mostrarResultado(eq1);

        // Ejemplo 2
        EcuacionCuadratica eq2 = new EcuacionCuadratica(1, 2.0, 1);
        mostrarResultado(eq2);

        // Ejemplo 3
        EcuacionCuadratica eq3 = new EcuacionCuadratica(1, 2, 3);
        mostrarResultado(eq3);
    }

    private static void mostrarResultado(EcuacionCuadratica eq) {
        double d = eq.getDiscriminante();

        if (d > 0) {
            System.out.printf("La ecuación tiene dos raíces %.6f y %.6f\n", eq.getRaiz1(), eq.getRaiz2());
        } else if (d == 0) {
            System.out.printf("La ecuación tiene una raíz %.6f\n", eq.getRaiz1());
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }
    }
}
