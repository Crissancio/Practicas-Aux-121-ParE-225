package PRACTICA1AUXILIATURA.Herencia.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("Sebastian", 12345, "INF112", 75);
        Docente d = new Docente("Marie",45678,"INF112",7000);
        Administrativo a = new Administrativo("Sheyla",121256,3200,"Gerente");
        Empleado em = new Empleado("Jhon",1878726,"Cocina");

        System.out.println(e.toString());
        System.out.println(d.toString());
        System.out.println(a.toString());
        System.out.println(em.toString());
        if (e.pasaConDocente(d)){
            System.out.println("El estudiante pasa con el/la docente " + d.getNombre());
        } else{
            System.out.println("El estudiante no pasa con el docente " + d.getNombre());
        }
    }
}
