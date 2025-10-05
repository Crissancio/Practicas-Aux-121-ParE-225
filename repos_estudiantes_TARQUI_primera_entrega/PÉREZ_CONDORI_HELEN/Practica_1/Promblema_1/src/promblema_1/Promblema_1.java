package promblema_1;
/**
 * Clase principal
 * @author Helen Perez Condori
 * @version 1.0 25/03/2025
 */
import java.util.Scanner;

public class Promblema_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese a: ");
        double a =  sc.nextDouble();
        System.out.println("Ingrese b: ");
        double b =  sc.nextDouble();
        System.out.println("Ingrese c: ");
        double c =  sc.nextDouble();
        System.out.println("Ingrese d: ");
        double d =  sc.nextDouble();
        System.out.println("Ingrese e: ");
        double e =  sc.nextDouble();
        System.out.println("Ingrese f: ");
        double f =  sc.nextDouble();
        
        EcuacionLineal ec = new EcuacionLineal(a, b, c, d, e, f);
        if(ec.tienSolucion()){
            System.out.println(String.format("x = %s, y = %s", ec.getX(), ec.getY()));           
        }
        else{
            System.out.println("La ecuacion no tiene solucion");
        }
        sc.close();
    }
    
}
