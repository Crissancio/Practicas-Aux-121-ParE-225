package prac1_prog2;

public class ejr15 {


	    public static void main(String[] args) {
	        Buzon b1 = new Buzon(1, 3);
	        Carta c1 = new Carta("C1", "Querido amigo, amor eterno.", "Juan", "Pedro");
	        Carta c2 = new Carta("C2", "Hola, te escribo desde lejos.", "Maria", "Ana");
	        Carta c3 = new Carta("C3", "Esta carta no habla de amor.", "Luis", "Pedro");
	        b1.agregarCarta(0, 0, c1);
	        b1.agregarCarta(1, 1, c2);
	        b1.agregarCarta(2, 2, c3);

	        System.out.println("Cartas en buzón:");
	        b1.mostrarCartas();
	        System.out.println("\nCartas para Pedro: " + b1.contarCartasDestinatario("Pedro"));
	        System.out.println("\nBuscar palabra 'amor':");
	        b1.buscarPorPalabra("amor");
	        System.out.println("\nEliminar carta C456...");
	        b1.eliminarCarta("C456");
	        b1.mostrarCartas();
	    }
	}

	class Carta {
	    private String codigo;
	    private String descripcion;
	    private String remitente;
	    private String destinatario;

	    public Carta(String codigo, String descripcion, String remitente, String destinatario) {
	        this.codigo = codigo;
	        this.descripcion = descripcion;
	        this.remitente = remitente;
	        this.destinatario = destinatario;
	    }

	    public String getCodigo() { return codigo; }
	    public String getDescripcion() { return descripcion; }
	    public String getRemitente() { return remitente; }
	    public String getDestinatario() { return destinatario; }
	    public void mostrar() {
	        System.out.println("[" + codigo + "] " + remitente + " → " + destinatario + " | " + descripcion);
	    }
	}
	class Buzon {
	    private int nro;
	    private int nroC;
	    private Carta[][] cartas;
	    public Buzon(int nro, int nroC) {
	        this.nro = nro;
	        this.nroC = nroC;
	        this.cartas = new Carta[nroC][nroC]; 
	    }
	    public void agregarCarta(int fila, int col, Carta c) {
	        if (fila < nroC && col < nroC) {
	            cartas[fila][col] = c;
	        }
	    }
	    public void eliminarCarta(String cod) {
	        for (int i = 0; i < nroC; i++) {
	            for (int j = 0; j < nroC; j++) {
	                if (cartas[i][j] != null && cartas[i][j].getCodigo().equalsIgnoreCase(cod)) {
	                    cartas[i][j] = null;
	                }
	            }
	        }
	    }
	    public int contarCartasDestinatario(String dest) {
	        int contador = 0;
	        for (int i = 0; i < nroC; i++) {
	            for (int j = 0; j < nroC; j++) {
	                if (cartas[i][j] != null && cartas[i][j].getDestinatario().equalsIgnoreCase(dest)) {
	                    contador++;
	                }
	            }
	        }
	        return contador;
	    }

	    public void buscarPorPalabra(String palabra) {
	        for (int i = 0; i < nroC; i++) {
	            for (int j = 0; j < nroC; j++) {
	                if (cartas[i][j] != null && cartas[i][j].getDescripcion().contains(palabra)) {
	                    cartas[i][j].mostrar();
	                }
	            }
	        }
	    }

	    public void mostrarCartas() {
	        for (int i = 0; i < nroC; i++) {
	            for (int j = 0; j < nroC; j++) {
	                if (cartas[i][j] != null) {
	                    cartas[i][j].mostrar();
	                }
	            }
	        }
	    }
	

	

}
