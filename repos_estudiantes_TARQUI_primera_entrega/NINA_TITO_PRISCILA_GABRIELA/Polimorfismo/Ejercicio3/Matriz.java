package PRACTICA1AUXILIATURA.Polimorfismo.Ejercicio3;

public class Matriz {
    private float[][] matriz;

    // Constructor: matriz identidad 3x3
    public Matriz() {
        this.matriz = new float[3][3];
        for (int i = 0; i < 3; i++) {
            matriz[i][i] = 1;
        }
    }

    // Constructor: recibe matriz personalizada 3x3
    public Matriz(float[][] matriz) {
        this.matriz = new float[3][3];
        for (int i = 0; i < 3; i++) {
            System.arraycopy(matriz[i], 0, this.matriz[i], 0, 3);
        }
    }

    // Suma de matrices
    public Matriz sumar(Matriz otro) {
        Matriz resultado = new Matriz();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado.matriz[i][j] = this.matriz[i][j] + otro.matriz[i][j];
            }
        }
        return resultado;
    }

    // Resta de matrices
    public Matriz restar(Matriz otro) {
        Matriz resultado = new Matriz();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado.matriz[i][j] = this.matriz[i][j] - otro.matriz[i][j];
            }
        }
        return resultado;
    }

    // Comprobar si dos matrices son iguales
    public boolean igual(Matriz otro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.matriz[i][j] != otro.matriz[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Mostrar matriz en consola
    public void mostrar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matriz m1 = new Matriz(); 
        Matriz m2 = new Matriz(); 
        float[][] datos = { {1,2,3}, {4,5,6}, {7,8,9} };
        Matriz m3 = new Matriz(datos);

        System.out.println("Matriz 1:");
        m1.mostrar();

        System.out.println("Matriz 2:");
        m2.mostrar();

        System.out.println("¿Son iguales? " + m1.igual(m2));

        System.out.println("Matriz 3:");
        m3.mostrar();

        Matriz suma = m1.sumar(m3);
        System.out.println("Suma (M1 + M3):");
        suma.mostrar();

        Matriz resta = m3.restar(m1);
        System.out.println("Resta (M3 - M1):");
        resta.mostrar();

        System.out.println("¿M1 es igual a M3? " + m1.igual(m3));
    }
}
