package HERENCIA.EJERCICIO9;

public class Main {
    public static void main(String[] args){
        Partido p1 = new Partido("MNR","ROL " );
        Presidente presi1= new Presidente("Roberto", "Ortiz", "Economistas", 8, p1);
        //2da forma
        Presidente presi2 = new Presidente("Maria", "Suarez" , "Abogada", 2, new Partido("RADEPA ", "Rol 2"));

        Presidente[] presidentes = new Presidente[3];
        presidentes[0] = presi1;
        presidentes[1] = presi2;
        presidentes[2] = new Presidente("Juan", "Perez" , "ingeniero", 20, new Partido("CONDEPA", "ROL3"));


        String buscar = "Juan";
        boolean ent = false;
        for(Presidente p : presidentes) {
            if (p.getNombre().equalsIgnoreCase(buscar)) {
                System.out.println("Encontrado ");
                p.mostrarDatos();
                ent = true;
                break;
            }
        }

        if(!ent){
            System.out.println("no se encontro ");
        }
    }

}
