package PRACTICA_4;
import java.util.Random;

public class MainFigura {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        Random rand = new Random();

        // Generar figuras aleatorias
        for (int i = 0; i < figuras.length; i++) {
            int tipo = rand.nextInt(2) + 1;
            String color = (rand.nextBoolean()) ? "Rojo" : "Azul";

            if (tipo == 1) {
                double lado = 1 + rand.nextInt(10);
                figuras[i] = new Cuadrado(color, lado);
            } else {
                double radio = 1 + rand.nextInt(10);
                figuras[i] = new Circulo(color, radio);
            }
        }

        // Mostrar datos de cada figura
        for (Figura f : figuras) {
            System.out.println(f.toString());
            System.out.println("Área: " + f.area());
            System.out.println("Perímetro: " + f.perimetro());

            // Verificar si implementa Coloreado
            if (f instanceof Coloreado) {
                Coloreado c = (Coloreado) f;
                System.out.println("Como colorear: " + c.comoColorear());
            }

            System.out.println("---------------------------");
        }
    }
}
