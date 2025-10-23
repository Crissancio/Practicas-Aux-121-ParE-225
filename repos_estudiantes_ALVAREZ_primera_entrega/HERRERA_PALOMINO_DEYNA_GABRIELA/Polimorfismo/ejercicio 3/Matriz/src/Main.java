public class Main {
    public static void main(String[] args) {

        Matriz m1 = new Matriz(3);
        System.out.println("Matriz Identidad:");
        m1.mostrar();

        float[][] datos = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Matriz m2 = new Matriz(datos);
        System.out.println("\nMatriz M2:");
        m2.mostrar();

        Matriz suma = m1.sumar(m2);
        System.out.println("\nM1 + M2:");
        suma.mostrar();

        Matriz resta = m2.restar(m1);
        System.out.println("\nM2 - M1:");
        resta.mostrar();

        System.out.println("\n¿M1 == M2? " + m1.igual(m2));
        System.out.println("¿M2 == M2? " + m2.igual(m2));
    }
}
