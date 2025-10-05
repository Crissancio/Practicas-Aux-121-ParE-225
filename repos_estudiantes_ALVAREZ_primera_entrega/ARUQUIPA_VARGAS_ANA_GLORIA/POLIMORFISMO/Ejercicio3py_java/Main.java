package Ejercicio3py_java;
public class Main {
    public static void main(String[] args) {
        Matriz m1 = new Matriz();
        System.out.println("Matriz identidad:");
        m1.mostrar();

        float[][] datos = new float[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                datos[i][j] = i + j;
            }
        }

        Matriz m2 = new Matriz(datos);
        System.out.println("\nMatriz personalizada:");
        m2.mostrar();

        Matriz suma = m1.sumar(m2);
        System.out.println("\nSuma de m1 + m2:");
        suma.mostrar();

        Matriz resta = m2.restar(m1);
        System.out.println("\nResta de m2 - m1:");
        resta.mostrar();

        System.out.println("\n¿m1 es igual a m2?: " + m1.igual(m2));
        System.out.println("¿m1 es igual a otra identidad?: " + m1.igual(new Matriz()));
    }
}
