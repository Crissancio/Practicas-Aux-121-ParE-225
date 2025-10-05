package prac1_prog2;
import java.util.Arrays;

class Matriz {
    private static final int N = 10;
    private float[][] datos;
    public Matriz() {
        datos = new float[N][N];
        for (int i = 0; i < N; i++) {
            datos[i][i] = 1.0f;
        }
    }
    public Matriz(float[][] entrada) {
        datos = new float[N][N];
        for (int i = 0; i < N && i < entrada.length; i++) {
            for (int j = 0; j < N && j < entrada[i].length; j++) {
                datos[i][j] = entrada[i][j];
            }
        }
    }

    public Matriz sumar(Matriz m) {
        Matriz res = new Matriz(new float[N][N]);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                res.datos[i][j] = this.datos[i][j] + m.datos[i][j];
            }
        }
        return res;
    }

    public Matriz restar(Matriz m) {
        Matriz res = new Matriz(new float[N][N]);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                res.datos[i][j] = this.datos[i][j] - m.datos[i][j];
            }
        }
        return res;
    }

    public boolean igual(Matriz m) {
        for (int i = 0; i < N; i++) {
            if (!Arrays.equals(this.datos[i], m.datos[i])) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(Arrays.toString(datos[i])).append("\n");
        }
        return sb.toString();
    }
}

public class poli_3 {
    public static void main(String[] args) {
        Matriz identidad = new Matriz();
        float[][] a = new float[10][10];
        a[0][0] = 2; a[1][1] = 3;
        Matriz m2 = new Matriz(a);

        System.out.println("Identidad:");
        System.out.println(identidad);
        System.out.println("M2:");
        System.out.println(m2);

        Matriz suma = identidad.sumar(m2);
        System.out.println("Suma:");
        System.out.println(suma);

        System.out.println("¿identidad igual a m2? " + identidad.igual(m2));
    }
}



	

