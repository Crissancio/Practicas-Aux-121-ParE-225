public class Main {
    public static void main(String[] args) {
        Fruta f1 = new Fruta("Naranja", "Cítrica", new String[]{"C", "A", "B1"});
        Fruta f2 = new Fruta("Manzana", "Dulce", new String[]{"B2", "E"});
        Fruta f3 = new Fruta("Plátano", "Tropical", new String[]{"A", "C", "E", "B6"});

        Fruta[] frutas = {f1, f2, f3};

        Fruta max = Fruta.frutaConMasVitaminas(frutas);
        System.out.println("La fruta con más vitaminas es: " + max.getNombre());

        f3.mostrarVitaminas();

        System.out.println("Vitaminas cítricas de Naranja: " + f1.contarVitaminasCitricas());

        f2.ordenarVitaminas();
    }
}
