package PolimorfismoTres;

public class MainMatriz {
    public static void main(String[] args) {
        Matriz m1 = new Matriz();
        System.out.println("Matriz identidad:");
        m1.mostrar();

        float[][] valores = new float[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                valores[i][j] = i + j; 
            }
        }
        Matriz m2 = new Matriz(valores);
        System.out.println("\nMatriz con valores:");
        m2.mostrar();

        Matriz suma = m1.sumar(m2);
        System.out.println("\nSuma de matrices:");
        suma.mostrar();
    }
}

class Matriz {
    private float[][] matriz;

    public Matriz() {
        matriz = new float[10][10];
        for (int i = 0; i < 10; i++) {
            matriz[i][i] = 1; 
        }
    }

    public Matriz(float[][] valores) {
        matriz = new float[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = valores[i][j];
            }
        }
    }

    public Matriz sumar(Matriz otra) {
        float[][] resultado = new float[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                resultado[i][j] = this.matriz[i][j] + otra.matriz[i][j];
            }
        }
        return new Matriz(resultado);
    }

    public void mostrar() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%6.1f ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
