package Practica_2;

public class AlgebraVectorial {
    public static double dot(double[] a, double[] b) {
        double result = 0;
        for (int i = 0; i < a.length; i++) result += a[i] * b[i];
        return result;
    }

    public static double norm(double[] a) {
        return Math.sqrt(dot(a, a));
    }

    public static double[] sum(double[] a, double[] b) {
        double[] res = new double[a.length];
        for (int i = 0; i < a.length; i++) res[i] = a[i] + b[i];
        return res;
    }

    public static double[] subtract(double[] a, double[] b) {
        double[] res = new double[a.length];
        for (int i = 0; i < a.length; i++) res[i] = a[i] - b[i];
        return res;
    }

    public static double[] cross(double[] a, double[] b) {
        return new double[]{
                a[1]*b[2] - a[2]*b[1],
                a[2]*b[0] - a[0]*b[2],
                a[0]*b[1] - a[1]*b[0]
        };
    }

    public static boolean equals(double a, double b, double tol) {
        return Math.abs(a - b) < tol;
    }

    public static boolean esPerpendicular(double[] a, double[] b) {
        return equals(norm(sum(a, b)), norm(subtract(a, b)), 1e-6);
    }

    public static boolean esPerpendicularMutua(double[] a, double[] b, boolean mutua) {
        double[] r1 = subtract(a, b);
        double[] r2 = subtract(b, a);
        for (int i = 0; i < a.length; i++) {
            if (!equals(r1[i], -r2[i], 1e-6)) return false;
        }
        return true;
    }

    public static boolean esPerpendicularDot(double[] a, double[] b, int modo) {
        return equals(dot(a, b), 0.0, 1e-6);
    }

    public static boolean esPerpendicularPit(double[] a, double[] b, double dummy) {
        double[] suma = sum(a, b);
        return equals(dot(suma, suma), dot(a, a) + dot(b, b), 1e-6);
    }

    public static boolean esParalela(double[] a, double[] b) {
        double ratio = a[0] / b[0];
        for (int i = 1; i < a.length; i++) {
            if (!equals(a[i], ratio * b[i], 1e-6)) return false;
        }
        return true;
    }

    public static boolean esParalelaCruz(double[] a, double[] b, boolean dummy) {
        double[] cruz = cross(a, b);
        return equals(norm(cruz), 0.0, 1e-6);
    }

    public static double[] proyeccion(double[] a, double[] b) {
        double escalar = dot(a, b) / dot(b, b);
        double[] res = new double[b.length];
        for (int i = 0; i < b.length; i++) res[i] = escalar * b[i];
        return res;
    }

    public static double componente(double[] a, double[] b) {
        return dot(a, b) / norm(b);
    }

    public static void main(String[] args) {
        double[] a = {1, 2, 3};
        double[] b = {3, -6, 3};

        System.out.println("¿Perpendicular (|a+b| = |a-b|)? " + esPerpendicular(a, b));
        System.out.println("¿Perpendicular mutuamente? " + esPerpendicularMutua(a, b, true));
        System.out.println("¿Perpendicular dot? " + esPerpendicularDot(a, b, 0));
        System.out.println("¿Perpendicular Pitágoras? " + esPerpendicularPit(a, b, 0));

        System.out.println("¿Paralela (escalar)? " + esParalela(a, b));
        System.out.println("¿Paralela cruz? " + esParalelaCruz(a, b, true));

        double[] proy = proyeccion(a, b);
        System.out.print("Proyección de a sobre b: ");
        for (double val : proy) System.out.print(val + " ");
        System.out.println();

        System.out.println("Componente de a en dirección b: " + componente(a, b));
    }
}
