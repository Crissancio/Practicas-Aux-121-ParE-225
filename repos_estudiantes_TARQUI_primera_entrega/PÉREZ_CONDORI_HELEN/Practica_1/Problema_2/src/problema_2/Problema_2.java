package problema_2;
/**
 * Clase principal
 * @author Helen Perez Condori
 * @version 1.0 25/03/2025
 */
import java.util.Scanner;
public class Problema_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese a: ");
        double a =  sc.nextDouble();
        System.out.println("Ingrese b: ");
        double b =  sc.nextDouble();
        System.out.println("Ingrese c: ");
        double c =  sc.nextDouble();
        
        EcuacionLineal ec = new EcuacionLineal(a, b,c);
        double d = ec.getDiscriminante();
        if(d > 0){
            System.out.println(String.format("La ecuacion tiene dos raices %s y %s", ec.getRaiz1(),ec.getRaiz2()));
        }
        else if(d == 0){
            System.out.println(String.format("La ecuacion tiene una raiz %s",ec.getRaiz1()));            
        }
        else{
            System.out.println("La ecuacion no tiene raices reales");
        }
    }
    
}
