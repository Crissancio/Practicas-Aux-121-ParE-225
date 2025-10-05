/**
* 
* Main.
* @author Helen Pérez Condori
* @version 1.0 30/09/2025
*
*/
package lb_4i;
import java.util.Random;
public class LB_4I {
    public static void main(String[] args) {
        Random r = new Random();
        Figura[] f = new Figura[5];

        for (int i = 0; i < f.length; i++) {
            int tipo = r.nextInt(2) + 1;
            String color = "Color" + (i + 1);

            if (tipo == 1) {
                double lado = 1 + r.nextDouble() * 9;
                f[i] = new Cuadrado(lado, color);
            } else {
                double radio = 1 + r.nextDouble() * 9;
                f[i] = new Circulo(radio, color);
            }
        }
        for (Figura fig : f) {
            System.out.println(fig.toString());
            System.out.println("Area: " + fig.area());
            System.out.println("Perimetro: " + fig.perimetro());
            if (fig instanceof Coloreando) {
                System.out.println(((Coloreando) fig).comoColorear());
            }
        }       
    }
    
}
