/**
* 
* Main.
* @author Helen Pérez Condori
* @version 1.0 30/09/2025
*
*/
package lb_4;
import java.util.Scanner;
public class LB_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado[] e = new Empleado[5];
        for(int i = 0; i<3; i++){
            System.out.print("Nombre del empleado : ");
            String nombre = sc.nextLine();
            System.out.print("Salario anual: ");
            double salarioAnual = sc.nextDouble();
            sc.nextLine();
            e[i] = new EmpleadoTiempoCompleto(nombre, salarioAnual);            
        }
        for (int i = 3; i < 5; i++) {
            System.out.print("Nombre del empleado : ");
            String nombre = sc.nextLine();
            System.out.print("Horas trabajadas: ");
            double horas = sc.nextDouble();
            System.out.print("Tarifa por hora: ");
            double tarifa = sc.nextDouble();
            sc.nextLine();
            e[i] = new EmpleadoTiempoHorario(nombre, horas, tarifa);
        }
        for (Empleado em : e) {
            System.out.println("Nombre: " + em.nombre +", Salario mensual: " + em.CalcularSalarioMensual());
        }
        sc.close();       
    }
    
}
