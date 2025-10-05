package PRACTICA1AUXILIATURA.Introduccion_a_POO.Ejercicio15;

public class Buzon {
    private int nro;
    private int nroC;
    private String[][] c;

    public Buzon(int nro){
        this.nro = nro;
        this.nroC = nroC;
        this.c = new String[50][3];
    }
    public void agregarCarta(String codigo, int nroC, String remitente, String destinatario){
        if(nroC < 50){
            c[nroC][0] = codigo;
            c[nroC][1] = remitente;
            c[nroC][2] = destinatario;
        } else {
            System.out.println("Buzon lleno");
        }
    }
    public void mostrarCartas(){
        System.out.println("Buzon Nro: " + nro);
        for(int i=0; i<50; i++){
            if(c[i][0] != null){
                System.out.println("Carta " + (i+1) + ":");
                System.out.println("Codigo: " + c[i][0]);
                System.out.println("Remitente: " + c[i][1]);
                System.out.println("Destinatario: " + c[i][2]);
            }
        }
        System.out.println("-------------------------");
    }
    public int contarCartasDestinatario(String destinatarioX){
        int contador = 0;
        for(int i=0; i<50; i++){
            if(c[i][2] != null && c[i][2].equals(destinatarioX)){
                contador++;
            }
        }
        return contador;
    }
    public void eliminarCarta(String codigoX){
        for(int i=0; i<50; i++){
            if (c[i][0] != null && c[i][0].equals(codigoX)) {
                c[i][0] = null;
                c[i][1] = null;
                c[i][2] = null;
                System.out.println("Carta con codigo " + codigoX + " eliminada del buzon " + nro);
            }
        }
    }
    public void remitenteRecibioCarta(String remitenteX){
        for(int i=0; i<50; i++){
            if(c[i][1] != null && c[i][1].equals(remitenteX)){
                System.out.println("El remitente " + remitenteX + " ha recibido una carta de " + (c[i][2]));
            }
        }
    }
}
