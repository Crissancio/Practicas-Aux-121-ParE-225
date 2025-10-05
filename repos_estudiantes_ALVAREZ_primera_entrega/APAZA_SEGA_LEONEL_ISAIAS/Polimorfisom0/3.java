public class Matriz {
    private int[][] matriz;

    public Matriz() {
        matriz = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matriz[i][j] = (i == j) ? 1 : 0; // matriz identidad
    }

    public Matriz(int[][] datos) {
        matriz = datos;
    }

    public Matriz sumar(Matriz otra) {
        int[][] resultado = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                resultado[i][j] = this.matriz[i][j] + otra.matriz[i][j];
        return new Matriz(resultado);
    }

    public Matriz restar(Matriz otra) {
        int[][] resultado = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                resultado[i][j] = this.matriz[i][j] - otra.matriz[i][j];
        return new Matriz(resultado);
    }

    public void mostrar() {
        for (int[] fila : matriz) {
            for (int elem : fila)
                System.out.print(elem + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matriz m1 = new Matriz();
        int[][] datos = {{2,2,2},{2,2,2},{2,2,2}};
        Matriz m2 = new Matriz(datos);

        Matriz suma = m1.sumar(m2);
        System.out.println("Suma:");
        suma.mostrar();
    }
}
