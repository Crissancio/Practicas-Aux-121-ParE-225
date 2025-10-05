public class Main {
    public static void main(String[] args){
        Estudiante estudiante1=new Estudiante("Juan Romer","Velazquez","Choque",19,17310838,8362631);
        estudiante1.mostrar();
        Estudiante estudiante2=new Estudiante("Rodrigo Jose","Marquez","Duran",21,17310838,8362631);
        estudiante2.mostrar();
        Docente docente=new Docente("Ronnald Alvaro","Silva","Guzman",42,12000,"Algebra 1");
        docente.mostrar();
        System.out.println("------------------------");
        estudiante1.promedio(estudiante2);
        estudiante1.modificarEdad(42);
        System.out.println("------------------------");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|    Verificando si un estudiante tiene la misma edad del docente   |");
        System.out.println("---------------------------------------------------------------------");
        if(estudiante1.getEdad()== docente.getEdad()){
            System.out.println("El estudiante: "+estudiante1.getNombre()+" "+estudiante1.getPaterno()+" "+estudiante1.getMaterno()+", tiene la misma edad que el docente: "+docente.getNombre()+" "+docente.getPaterno()+" "+docente.getMaterno());
        }
        else {
            if (estudiante2.getEdad()== docente.getEdad()){
                System.out.println("El estudiante: "+estudiante2.getNombre()+" "+estudiante2.getPaterno()+" "+estudiante2.getMaterno()+", tiene la misma edad que el docente: "+docente.getNombre()+" "+docente.getPaterno()+" "+docente.getMaterno());
            }
            else {
                System.out.println("Ningun estudiante tien la misma edad que el docente");
            }
        }
    }
}
