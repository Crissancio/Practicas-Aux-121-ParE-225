public class Matriz {
    private float[][] matriz;
    private int filas;
    private int columnas;

    public Matriz(int n) {
        this.filas = n;
        this.columnas = n;
        matriz = new float[n][n];
        for (int i = 0; i < n; i++) {
            matriz[i][i] = 1;
        }
    }

    public Matriz(float[][] valores) {
        this.filas = valores.length;
        this.columnas = valores[0].length;
        matriz = new float[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = valores[i][j];
            }
        }
    }

    public Matriz sumar(Matriz m) {
        if (this.filas != m.filas || this.columnas != m.columnas)
            return null;
        float[][] res = new float[filas][columnas];
        for (int i = 0; i < filas; i++)
            for (int j = 0; j < columnas; j++)
                res[i][j] = this.matriz[i][j] + m.matriz[i][j];
        return new Matriz(res);
    }

    public Matriz restar(Matriz m) {
        if (this.filas != m.filas || this.columnas != m.columnas)
            return null;
        float[][] res = new float[filas][columnas];
        for (int i = 0; i < filas; i++)
            for (int j = 0; j < columnas; j++)
                res[i][j] = this.matriz[i][j] - m.matriz[i][j];
        return new Matriz(res);
    }

    public boolean igual(Matriz m) {
        if (this.filas != m.filas || this.columnas != m.columnas)
            return false;
        for (int i = 0; i < filas; i++)
            for (int j = 0; j < columnas; j++)
                if (this.matriz[i][j] != m.matriz[i][j])
                    return false;
        return true;
    }

    public void mostrar() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
