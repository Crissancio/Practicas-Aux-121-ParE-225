package Practica_1;



public class MainLineal {
    public static void main(String[] args) {
        double a1 = 9.0, b1 = 4.0, c1 = 3.0, d1 = -5.0, e1 = -6.0, f1 = -21.0;
        EcuacionLineal eq1 = new EcuacionLineal(a1, b1, c1, d1, e1, f1);

        if (eq1.tieneSolucion()) {
            System.out.printf("Ejemplo 1 x = %.2f, y = %.2f\n", eq1.getX(), eq1.getY());
        } else {
            System.out.println("Ejemplo 1 La ecuación no tiene solución");
        }

        double a2 = 1.0, b2 = 2.0, c2 = 2.0, d2 = 4.0, e2 = 4.0, f2 = 5.0;
        EcuacionLineal eq2 = new EcuacionLineal(a2, b2, c2, d2, e2, f2);
        if (eq2.tieneSolucion()) {
            System.out.printf("Ejemplo 2 x = %.2f, y = %.2f\n", eq2.getX(), eq2.getY());
        } else {
            System.out.println("Ejemplo 2 La ecuación no tiene solución");

        }

    }
}
//69786801