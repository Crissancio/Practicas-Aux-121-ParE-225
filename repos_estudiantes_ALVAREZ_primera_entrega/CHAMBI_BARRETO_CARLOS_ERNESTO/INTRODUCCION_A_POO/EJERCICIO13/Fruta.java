package INTRODUCCION_A_POO.EJERCICIO13;

public class Fruta {
    public String nombre, tipo;
    public int nroVitaminas;
    public String[] vitaminas;

    public Fruta(String nombre, String tipo, String[] vitaminas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vitaminas = vitaminas;
        this.nroVitaminas=vitaminas.length;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNroVitaminas() {
        return nroVitaminas;
    }

    public String[] getVitaminas() {
        return vitaminas;
    }

    public void mostrarVitaminas(){
        for(int i = 0; i<vitaminas.length; i++){
            System.out.print(vitaminas[i] + " " );
        }
        System.out.println(" ");
    }

}
