package INTRODUCCION_A_POO.EJERCICIO15;

class Buzon {
    int nro;
    int nroC;
    Carta[] cartas;

    public Buzon(int nro, int nroC) {
        this.nro = nro;
        this.nroC = nroC;
        this.cartas = new Carta[nroC];
    }

    public void agregarCarta(int pos, Carta carta) {
        if (pos >= 0 && pos < cartas.length) {
            cartas[pos] = carta;
        }
    }
}