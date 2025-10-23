public class Matriz{
    private int n;
    private float [][]matriz;

    public Matriz(int n) {
        this.n = n;
        this.matriz = new float[n][n];
        for (int i = 0; i < n; i++) {
            this.matriz[i][i] = 1; 
        }
    }
    public Matriz(float[][] matriz) {
        this.n = matriz.length;
        this.matriz = new float[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                this.matriz[i][j] = matriz[i][j];
            }
        }
    }
    public Matriz sumar(Matriz otra) {
        if (this.n != otra.n) {
            throw new IllegalArgumentException("Dimensiones incompatibles");
        }
        float[][] resultado = new float[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = this.matriz[i][j] + otra.matriz[i][j];
            }
        }
        return new Matriz(resultado);
    }
    public Matriz restar(Matriz otra) {
        if (this.n != otra.n) {
            throw new IllegalArgumentException("Dimensiones incompatibles");
        }
        float[][] resultado = new float[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = this.matriz[i][j] - otra.matriz[i][j];
            }
        }
        return new Matriz(resultado);
    }
    public boolean igual(Matriz otra) {
        if (this.n != otra.n) return false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (this.matriz[i][j] != otra.matriz[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public void mostrar() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}