package Polimorfismo.Ejercicio3;

class Main {
    public static void main(String[] args) {
        Matriz m1 = new Matriz();

        float[][] valores = new float[10][10];
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                valores[i][j] = i + j;
        Matriz m2 = new Matriz(valores);
        Matriz m3 = new MatrizEscalar(2.0f);

        System.out.println("Suma normal (m1 + m2):");
        m1.sumar(m2).mostrar();
        System.out.println("Suma polimórfica (m3 + m2):");
        m3.sumar(m2).mostrar(); 
        System.out.println("¿m1 = m2? " + m1.igual(m2));
    }
}
