package Ejercicio3py_java;

public class Matriz {
    private final int FILAS = 10;
    private final int COLUMNAS = 10;
    private float[][] matriz;

    public Matriz() {
        matriz = new float[FILAS][COLUMNAS];
        for (int i = 0; i < FILAS; i++) {
            matriz[i][i] = 1.0f;
        }
    }

    public Matriz(float[][] datos) {
        if (datos.length != FILAS || datos[0].length != COLUMNAS) {
            throw new IllegalArgumentException("La matriz debe ser de 10x10");
        }

        matriz = new float[FILAS][COLUMNAS];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                matriz[i][j] = datos[i][j];
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public Matriz sumar(Matriz otra) {
        float[][] resultado = new float[FILAS][COLUMNAS];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                resultado[i][j] = this.matriz[i][j] + otra.matriz[i][j];
            }
        }
        return new Matriz(resultado);
    }

    public Matriz restar(Matriz otra) {
        float[][] resultado = new float[FILAS][COLUMNAS];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                resultado[i][j] = this.matriz[i][j] - otra.matriz[i][j];
            }
        }
        return new Matriz(resultado);
    }

    public boolean igual(Matriz otra) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (this.matriz[i][j] != otra.matriz[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

