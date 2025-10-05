package Polimorfismo.Ejercicio3;

class MatrizEscalar extends Matriz {
    private float escalar;

    public MatrizEscalar(float escalar) {
        super(); 
        this.escalar = escalar;
    }

    @Override
    public Matriz sumar(Matriz m) {
        Matriz resultado = new Matriz();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                resultado.matriz[i][j] = this.matriz[i][j] * escalar + m.matriz[i][j];
            }
        }
        return resultado;
    }
}