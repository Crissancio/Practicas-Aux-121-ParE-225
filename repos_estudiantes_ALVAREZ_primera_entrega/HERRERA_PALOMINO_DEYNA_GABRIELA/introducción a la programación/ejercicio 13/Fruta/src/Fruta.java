import java.util.Arrays;

public class Fruta {
    private String nombre;
    private String tipo;
    private int nroVitaminas;
    private String[] V;
    public Fruta(String nombre, String tipo, String[] vitaminas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.V = new String[30];
        this.nroVitaminas = 0;
        agregarVitaminas(vitaminas); 
    }

    public Fruta(String[] vitaminas, int nroVitaminas) {
        this.nombre = "desconocido";
        this.tipo = "desconocido";
        this.V = new String[30];
        agregarVitaminas(Arrays.copyOf(vitaminas, nroVitaminas));
    }

    public Fruta() {
        this.nombre = "desconocido";
        this.tipo = "desconocido";
        this.V = new String[30];
        this.V[0] = "C";
        this.nroVitaminas = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNroVitaminas() {
        return nroVitaminas;
    }

    public void agregarVitaminas(String[] vitaminas) {
        for (int i = 0; i < vitaminas.length; i++) {
            if (nroVitaminas < 30) {
                V[nroVitaminas] = vitaminas[i];
                nroVitaminas++;
            } else {
                System.out.println("No se pueden agregar más vitaminas, límite 30");
                break;
            }
        }
    }

    public void mostrarVitaminas() {
        System.out.print("Vitaminas de " + nombre + ": ");
        for (int i = 0; i < nroVitaminas; i++) {
            System.out.print(V[i] + " ");
        }
        System.out.println();
    }
    public int contarVitaminasCitricas() {
        int contador = 0;
        for (int i = 0; i < nroVitaminas; i++) {
            if (V[i] != null && V[i].equalsIgnoreCase("C")) {
                contador++;
            }
        }
        return contador;
    }

    public void ordenarVitaminas() {
        String[] copia = new String[nroVitaminas];
        for (int i = 0; i < nroVitaminas; i++) {
            copia[i] = V[i];
        }
        Arrays.sort(copia);
        System.out.print("Vitaminas ordenadas de " + nombre + ": ");
        for (String vit : copia) {
            System.out.print(vit + " ");
        }
        System.out.println();
    }

    public static Fruta frutaConMasVitaminas(Fruta[] frutas) {
        if (frutas == null || frutas.length == 0) return null;

        Fruta frutaMax = frutas[0];
        for (int i = 1; i < frutas.length; i++) {
            if (frutas[i].getNroVitaminas() > frutaMax.getNroVitaminas()) {
                frutaMax = frutas[i];
            }
        }
        return frutaMax;
    }
}
