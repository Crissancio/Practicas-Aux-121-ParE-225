package Polimorfismo.Ejercicio3;

public class Matriz {
    protected float[][] matriz = new float[10][10];

    public Matriz() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (i == j) ? 1.0f : 0.0f;
            }
        }
    }

    public Matriz(float[][] valores) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                this.matriz[i][j] = valores[i][j];
            }
        }
    }

    public Matriz sumar(Matriz m) {
        Matriz resultado = new Matriz();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                resultado.matriz[i][j] = this.matriz[i][j] + m.matriz[i][j];
            }
        }
        return resultado;
    }

    public Matriz restar(Matriz m) {
        Matriz resultado = new Matriz();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                resultado.matriz[i][j] = this.matriz[i][j] - m.matriz[i][j];
            }
        }
        return resultado;
    }

    public boolean igual(Matriz m) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (this.matriz[i][j] != m.matriz[i][j]) return false;
            }
        }
        return true;
    }

    public void mostrar() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}


