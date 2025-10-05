package HERENCIA.EJERCICIO15;

public class Triatleta implements Nadador, Corredor, Ciclista {
    public String estiloNatacion, tipoBicicleta;
    public int distanciaPreferia;

    public Triatleta(String estiloNatacion, String tipoBicicleta, int distanciaPreferia) {
        this.estiloNatacion = estiloNatacion;
        this.tipoBicicleta = tipoBicicleta;
        this.distanciaPreferia = distanciaPreferia;
    }

    public void nadar() {
        System.out.println("Nadando estilo " + estiloNatacion);
    }

    public void pedalear() {
        System.out.println("Pedaleando en bicicleta tipo " + tipoBicicleta);
    }


    public void correr() {
        System.out.println("Corriendo una distancia de " + distanciaPreferia + " km");
    }
}
