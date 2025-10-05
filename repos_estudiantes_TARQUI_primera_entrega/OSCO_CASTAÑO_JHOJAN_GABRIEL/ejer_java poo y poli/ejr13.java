package prac1_prog2;
import java.util.Arrays;
public class ejr13 {
	    public static void main(String[] args) {
	        Fruta f1 = new Fruta("Kiwi", "Subtropical", new String[]{"C", "K", "E"});
	        Fruta f2 = new Fruta("Naranja", "Cítrica", new String[]{"A", "C"});
	        Fruta f3 = new Fruta("Banana", "Tropical", new String[]{"B6", "C"});
	        f1.mostrarDatos();
	        f2.mostrarDatos();
	        f3.mostrarDatos();
	        Fruta mayor = Fruta.mayorVitaminas(f1, f2);
	        System.out.println("La fruta con más vitaminas es: " + mayor.getNombre());
	    }
	}

	class Fruta {
	    private String nombre;
	    private String tipo;
	    private String[] vitaminas;

	    public Fruta(String nombre, String tipo, String[] vitaminas) {
	        this.nombre = nombre;
	        this.tipo = tipo;
	        this.vitaminas = vitaminas;
	    }

	    public void mostrarDatos() {
	        System.out.println("Fruta: " + nombre + " | Tipo: " + tipo + " | Vitaminas: " + Arrays.toString(vitaminas));
	    }

	    public int cantidadVitaminas() {
	        return vitaminas.length;
	    }

	    public static Fruta mayorVitaminas(Fruta f1, Fruta f2) {
	        return (f1.cantidadVitaminas() >= f2.cantidadVitaminas()) ? f1 : f2;
	    }

	    public String getNombre() {
	        return nombre;
	    }

}
