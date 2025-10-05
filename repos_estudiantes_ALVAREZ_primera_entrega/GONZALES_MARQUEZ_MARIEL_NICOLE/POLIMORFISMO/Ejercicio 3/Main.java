public class Main {
    public static void main(String[] args) {
        Matriz identidad = new Matriz(3);
        System.out.println("Matriz identidad:");
        identidad.mostrar();

        float[][] valores = { { 2, 3, 1 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Matriz m1 = new Matriz(valores);
        System.out.println("Matriz m1:");
        m1.mostrar();

        Matriz suma = identidad.sumar(m1);
        System.out.println("Suma identidad + m1:");
        suma.mostrar();

        Matriz resta = m1.restar(identidad);
        System.out.println("Resta m1 - identidad:");
        resta.mostrar();

        System.out.println("¿m1 es igual a identidad? " + m1.igual(identidad));
    }
}
