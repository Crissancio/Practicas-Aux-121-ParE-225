public class Ratatouille {
    public static void main(String[]args){
        Chef chef=new Chef("Rodrigo",15000,2,"pastelero",200);
        Mesero mesero1=new Mesero("Juan",10000,500,3,120);
        Mesero mesero2=new Mesero("Pablo",10000,300,2,120);
        Administrativo administrativo1=new Administrativo("Lucas",16000,"seguridad");
        Administrativo administrativo2=new Administrativo("Marcelo",13000,"cajero");
        float x=13000;
        Empleado[]empleados={chef,mesero1,mesero2,administrativo1,administrativo2};
        System.out.println("-----------------------------------------------");
        System.out.println("Los empleados con el sueldo igual a "+x+" son: ");
        System.out.println("-----------------------------------------------");
        for (Empleado e:empleados){
            if (e.getSueldoMes()==x){
                System.out.println("- "+e.getNombre());
            }
        }
        System.out.println("----------------------------------");
        System.out.println("Sueldos totales de los empleados: ");
        System.out.println("----------------------------------");
        for (Empleado e:empleados){
            System.out.println(e.getNombre()+": "+e.sueldoTotal());
        }
    }
}
