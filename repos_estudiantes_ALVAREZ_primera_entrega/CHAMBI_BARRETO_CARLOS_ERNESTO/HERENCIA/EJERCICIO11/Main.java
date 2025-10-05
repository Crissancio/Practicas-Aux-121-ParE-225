package HERENCIA.EJERCICIO11;

public class Main {
    public static void main(String[] args){
        JefePolicia j1 = new JefePolicia("Carlos", "JEFE DE OPERACIONES", "capitan", "P5678", 35, 5000);
        JefePolicia j2 = new JefePolicia("Maria", "JEFA DE LOGISTICA", "Teniente Coronel", "P56723", 40, 6000);
        //mostrar sus datos
        j1.mostrarDatos();
        j2.mostrarDatos();

        // quien tiene mayor sueldo
        if(j1.getSueldo()==j2.getSueldo()){
            System.out.println("tienen el mismo sueldo");
        }
        else if(j1.getSueldo()>j2.getSueldo()){
            System.out.println("El " + j1.getGrado() + " " + j1.getNombre() + " tiene mas sueldo");
        }
        else{
            System.out.println("La " + j2.getGrado() + " " + j2.getNombre() + " tiene mas sueldo");
        }
        //
        if(j1.getGrado().equalsIgnoreCase(j2.getGrado())){
            System.out.println("Tienen el mismo grado ");
        }
        else {
            System.out.println("No tienen el mismo grado ");
        }
    }
}
