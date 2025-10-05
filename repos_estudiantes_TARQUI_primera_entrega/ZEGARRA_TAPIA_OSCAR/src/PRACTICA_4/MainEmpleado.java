package PRACTICA_4;
import java.util.Scanner;

public class MainEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado[] empleados = new Empleado[5];

        // 3 empleados a tiempo completo
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el nombre del empleado a tiempo completo " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el salario anual: ");
            double salarioAnual = sc.nextDouble();
            sc.nextLine(); // limpiar buffer
            empleados[i] = new EmpleadoTiempoCompleto(nombre, salarioAnual);
        }

        // 2 empleados por hora
        for (int i = 3; i < 5; i++) {
            System.out.println("Ingrese el nombre del empleado por horas " + (i - 2) + ": ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese las horas trabajadas: ");
            double horas = sc.nextDouble();
            System.out.println("Ingrese la tarifa por hora: ");
            double tarifa = sc.nextDouble();
            sc.nextLine(); // limpiar buffer
            empleados[i] = new EmpleadoTiempoHorario(nombre, horas, tarifa);
        }

        // Mostrar todos los empleados
        System.out.println("\n--- Lista de Empleados ---");
        for (Empleado emp : empleados) {
            System.out.println(emp.toString());
        }
    }
}
