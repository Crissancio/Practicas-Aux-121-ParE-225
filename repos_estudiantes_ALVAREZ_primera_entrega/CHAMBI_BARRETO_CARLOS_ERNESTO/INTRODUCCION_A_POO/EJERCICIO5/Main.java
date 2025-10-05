package INTRODUCCION_A_POO.EJERCICIO5;

public class Main {
    public static void main(String[] args){
        Persona p1 = new Persona("Luis", "Arratia", "Vila",  17, 12452748);
        Persona p2 = new Persona("Donovan", "Arratia", "Chambi ", 20, 12345832);
        System.out.println("---------------------------------------------");
        System.out.println("Primera persona");
        p1.mostrarDatos();
        System.out.println("Segunda persona");
        p2.mostrarDatos();
        System.out.println("---------------------------------------------");
        System.out.println("¿" + p1.nombre + " es mayor de edad? " + p1.mayorDeEdad());
        System.out.println("¿" + p2.nombre + " es mayor de edad? " + p2.mayorDeEdad());
        p1.ModificarEdad(20);

        if(p1.getPaterno().equals(p2.getPaterno())){
            System.out.println("Tienen el misma apellido :v ");
        }
        else{
            System.out.println("Tienen el apellido distinto xd ");
        }
    }
}
