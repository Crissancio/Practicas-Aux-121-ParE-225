package HERENCIA.EJERCICIO13;

public class Main {
    public static void main(String[] args){
        Chef chef1 = new Chef("Remy" , 2000, 10, "Frances", 20);

        Mesero m1 = new Mesero("Linguini", 1500, 5, 10, 100);
        Mesero m2 = new Mesero("Gusteau", 1300, 8, 12, 150);

        Administrativo ad1 = new Administrativo("Skinner", 1200, "Gerente del pisoxd");
        Administrativo ad2 = new Administrativo("Ego", 1250, "Contador");

        Empleado[] empleados = {chef1, m1, m2, ad1 , ad2} ;
        //mostrar quienes tienen sueldo igual a 1500
        int X = 1500;
        System.out.println("Empleados igual con el sueldo de 1500");
        for(Empleado p : empleados){
            if(p.sueldoMes==X){
                System.out.println(p);
            }
        }
        System.out.println("\n Mostrar los sueldos totales");
        //mostrar sus sueldos
        for(Empleado p : empleados){
            System.out.println("El empleado " + p.getNombre() + " con el sueldo de: " + p.sueldoTotal());
        }

    }
}
