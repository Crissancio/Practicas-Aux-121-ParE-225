
import java.util.Arrays;

public class Fruta {
    private String nombre;
    private String tipo;
    private int nroVitaminas;
    private String[] v = new String[30];

    public Fruta() {}

    public Fruta(String nombre, String tipo, String[] vitaminas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nroVitaminas = vitaminas.length;
        for (int i = 0; i < vitaminas.length; i++) {
            this.v[i] = vitaminas[i];
        }
    }

    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public int getNroVitaminas() { return nroVitaminas; }
    public String[] getVitaminas() { return v; }

    public void mostrar() {
        System.out.println("Fruta: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Número de vitaminas: " + nroVitaminas);
        System.out.print("Vitaminas: ");
        for (int i = 0; i < nroVitaminas; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("\n--------------------------");
    }

    public static void main(String[] args) {
        // a) Instanciar 3 frutas de distintas maneras
        String[] vit1 = {"A", "C", "E"};
        Fruta f1 = new Fruta("Kiwi", "Subtropical", vit1);

        Fruta f2 = new Fruta();
        String[] vit2 = {"B1", "B2", "C", "D"};
        f2.nombre = "Naranja";
        f2.tipo = "Cítrica";
        f2.nroVitaminas = vit2.length;
        for (int i = 0; i < vit2.length; i++) f2.v[i] = vit2[i];

        Fruta f3 = new Fruta("Manzana", "Templada", new String[]{"A", "B1", "B2"});

        f1.mostrar();
        f2.mostrar();
        f3.mostrar();

        Fruta mayor = f1;
        if (f2.nroVitaminas > mayor.nroVitaminas) mayor = f2;
        if (f3.nroVitaminas > mayor.nroVitaminas) mayor = f3;
        System.out.println("Fruta con más vitaminas: " + mayor.getNombre());

        System.out.println("\nVitaminas del Kiwi:");
        for (int i = 0; i < f1.getNroVitaminas(); i++) {
            System.out.print(f1.getVitaminas()[i] + " ");
        }
        System.out.println();

        String[] vitaminasCitricas = {"A", "C", "E"};
        int totalCitricas = 0;
        Fruta[] frutas = {f1, f2, f3};
        for (Fruta f : frutas) {
            for (int i = 0; i < f.getNroVitaminas(); i++) {
                for (String vc : vitaminasCitricas) {
                    if (f.getVitaminas()[i].equalsIgnoreCase(vc)) {
                        totalCitricas++;
                    }
                }
            }
        }
        System.out.println("\nCantidad total de vitaminas cítricas (A, C, E): " + totalCitricas);

        System.out.println("\nVitaminas ordenadas alfabéticamente para cada fruta:");
        for (Fruta f : frutas) {
            String[] copy = Arrays.copyOf(f.getVitaminas(), f.getNroVitaminas());
            Arrays.sort(copy, 0, f.getNroVitaminas());
            System.out.println(f.getNombre() + ": " + Arrays.toString(copy));
        }
    }
}
